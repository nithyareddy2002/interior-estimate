package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.*;
import com.interiorestimate.interiorestimate.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class InteriorEstimateServiceImpl implements InteriorEstimateService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    PropertyRepository propertyRepository;

    @Autowired
    PropertyTypeRepository propertyTypeRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    UnitRepository unitRepository;

    @Override
    public List<Client> getClientByPhoneNumber(Integer phoneNumber) {
        if(phoneNumber == null){
          return clientRepository.findAll();
        }
        return clientRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Client getClientById(int id){ return clientRepository.findById(id);}
    @Override
    public List<Property> getPropertiesByClientId(int clientId) {
        return propertyRepository.findAllByClientId(clientId);
    }

    @Override
    public List<PropertyType> getProperties(){
        return propertyTypeRepository.findAll();
    }

    @Override
    @Transactional
    public Client updateClient(Client client){
        clientRepository.save(client);
        Set<Integer> propertyIdsInDB = propertyRepository.findAllByClientId(client.getId())
                .stream().map(Property::getId).collect(Collectors.toSet());
        client.getProperties().forEach(property -> {
            property.setClient(client);
            propertyRepository.save(property);
            propertyIdsInDB.remove(property.getId());
            Set<Integer> roomsIdsInDB = roomRepository.findAllByPropertyId(property.getId())
                    .stream().map(Room::getId).collect(Collectors.toSet());
            property.getRooms().forEach(room -> {
                room.setProperty(property);
                roomRepository.save(room);
                roomsIdsInDB.remove(room.getId());
                Set<Integer> unitIdsInDB = unitRepository.findAllByRoomId(room.getId())
                                .stream().map(Unit::getId).collect(Collectors.toSet());
                room.getUnits().forEach(unit -> {
                    unit.setRoom(room);
                    unitRepository.save(unit);
                    unitIdsInDB.remove(unit.getId());
                });
                unitIdsInDB.forEach(unitId -> unitRepository.deleteById(unitId));
            });
            roomsIdsInDB.forEach(roomId -> roomRepository.deleteById(roomId));
        });
        propertyIdsInDB.forEach(propertyId -> propertyRepository.deleteById(propertyId));
        return client;
    }

    @Transactional
    public void deleteClient(int id){
        Client client = clientRepository.findById(id);
        client.getProperties().forEach(property -> {
            property.getRooms().forEach(room -> {
                room.getUnits().forEach(unit -> {
                    unitRepository.deleteById(unit.getId());
                });
                roomRepository.deleteById(room.getId());
            });
            propertyRepository.deleteById(property.getId());
        });
        clientRepository.deleteById(id);
    }
}
