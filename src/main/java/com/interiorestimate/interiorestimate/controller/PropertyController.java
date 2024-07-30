package com.interiorestimate.interiorestimate.controller;

import com.interiorestimate.interiorestimate.model.PropertyType;
import com.interiorestimate.interiorestimate.service.PropertyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    PropertyTypeService propertyService;

    @GetMapping("/getpropertytypes")
    public List<PropertyType> getProperties(){return propertyService.getPropertyTypes();
    }
}
