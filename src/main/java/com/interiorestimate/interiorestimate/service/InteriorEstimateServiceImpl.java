package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.*;
import com.interiorestimate.interiorestimate.repository.*;
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
    RoomTypeRepository roomTypeRepository;

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

//    @Override
//    public List<RoomTypeService> getRooms(){
//        return roomTypeRepository.findAll();
//    }

//    @Override
//    public List<UnitType> getUnitsByRoomId(int roomId){
//        return unitTypeRepository.findAllByRoomId(roomId);
//    }

//    @Override
//    public Estimate getEstimateByClientIdAndPropertyAddressId(int clientId,int propertyAddressId){
//        return estimateRepository.findAllByClientIdAndPropertyAddressId(clientId,propertyAddressId);}

    @Override
    public Client updateClient(Client client){
//        Client client1 = clientRepository.save(client);
//        client.getProperties().forEach(property -> {
//            property.setClient(client1);
//            propertyRepository.save(property);
//        });
        return clientRepository.save(client);
        //return client1;
    }


}
