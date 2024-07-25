package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.*;
import com.interiorestimate.interiorestimate.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InteriorEstimateServiceImpl implements InteriorEstimateService {

    @Autowired
    MaterialTypeRepository materialTypeRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    PropertyRepository propertyAddressRepo;

    @Autowired
    PropertyTypeRepository propertyTypeRepository;

    @Autowired
    RoomTypeRepository roomTypeRepository;

    @Autowired
    UnitTypeRepository unitTypeRepository;

//    @Autowired
//    EstimateRepository estimateRepository;


    @Override
    public List<MaterialType> getFinishTypes() {
        return materialTypeRepository.findAll();
    }

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
        return propertyAddressRepo.findAllByClientId(clientId);
    }

    @Override
    public List<PropertyType> getProperties(){
        return propertyTypeRepository.findAll();
    }

    @Override
    public List<RoomType> getRooms(){
        return roomTypeRepository.findAll();
    }

    @Override
    public List<UnitType> getUnitsByRoomId(int roomId){
        return unitTypeRepository.findAllByRoomId(roomId);
    }

//    @Override
//    public Estimate getEstimateByClientIdAndPropertyAddressId(int clientId,int propertyAddressId){
//        return estimateRepository.findAllByClientIdAndPropertyAddressId(clientId,propertyAddressId);}

    @Override
    public MaterialType updateFinishType(MaterialType materialType){
        return materialTypeRepository.save(materialType);
    }

}
