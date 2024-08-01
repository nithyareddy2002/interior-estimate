package com.interiorestimate.interiorestimate.controller;

import com.interiorestimate.interiorestimate.model.*;
import com.interiorestimate.interiorestimate.service.InteriorEstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    InteriorEstimateService interiorEstimateService;

   @GetMapping
    public List<Client> getClients(@RequestParam(name="phoneNumber",required=false) Integer phoneNumber){
        return interiorEstimateService.getClientByPhoneNumber(phoneNumber);
   }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable("id") int id){
        return interiorEstimateService.getClientById(id);
    }


  @PostMapping
    public Client saveClient(@RequestBody Client client){
        return interiorEstimateService.updateClient(client);
  }

  @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable("id") int id){
       interiorEstimateService.deleteClient(id);
  }
}


