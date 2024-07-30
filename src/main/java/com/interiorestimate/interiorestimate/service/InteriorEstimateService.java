package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.*;

import java.util.List;

public interface InteriorEstimateService {

    public List<Client> getClientByPhoneNumber(Integer phoneNumber);

    public Client getClientById(int id);

    List<Property> getPropertiesByClientId(int clientId);

    public List<PropertyType> getProperties();

    //public List<RoomTypeService> getRooms();

//    public List<UnitType> getUnitsByRoomId(int roomId);
//
//    public Estimate getEstimateByClientIdAndPropertyAddressId(int clientId,int propertyAddressId);

    public Client updateClient(Client client);

}

