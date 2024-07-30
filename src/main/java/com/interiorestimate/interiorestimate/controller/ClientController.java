package com.interiorestimate.interiorestimate.controller;

import com.interiorestimate.interiorestimate.model.*;
import com.interiorestimate.interiorestimate.service.InteriorEstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    InteriorEstimateService interiorEstimateService;

    @GetMapping("/hello")
    public String Hello() {
        return "Hi ra..!!!";
    }


   @GetMapping("/clientbynumber")
    public List<Client> getClientByPhoneNumber(@RequestParam(name="phoneNumber",required=false) Integer phoneNumber){
        return interiorEstimateService.getClientByPhoneNumber(phoneNumber);
   }

    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable("id") int id){
        return interiorEstimateService.getClientById(id);
    }

   @GetMapping("/clientProperties/{clientId}")
   public List<Property> getPropertiesByClientId(@PathVariable("clientId") int clientId){
        return interiorEstimateService.getPropertiesByClientId(clientId);
   }

   @GetMapping("/propertytypes")
    public List<PropertyType> getProperties(){
        return interiorEstimateService.getProperties();
   }

//   @GetMapping("/rooms")
//    public List<RoomType> getRooms(){
//        return interiorEstimateService.getRooms();
//   }

  @PostMapping("/updateclient")
    public Client addClient(@RequestBody Client client){
        return interiorEstimateService.updateClient(client);
  }

}

