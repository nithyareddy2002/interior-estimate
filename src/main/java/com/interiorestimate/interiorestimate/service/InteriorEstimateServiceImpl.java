package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.*;
import com.interiorestimate.interiorestimate.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
        client.getProperties().forEach(property -> {
            property.setClient(client);
            propertyRepository.save(property);
            property.getRooms().forEach(room -> {
                room.setProperty(property);
                roomRepository.save(room);
                room.getUnits().forEach(unit -> {
                    unit.setRoom(room);
                    unitRepository.save(unit);
                });
            });
        });
        return client;
    }


}
