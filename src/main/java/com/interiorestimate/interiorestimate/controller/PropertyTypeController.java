package com.interiorestimate.interiorestimate.controller;

import com.interiorestimate.interiorestimate.model.PropertyType;
import com.interiorestimate.interiorestimate.service.PropertyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/property-types")
public class PropertyTypeController {

    @Autowired
    PropertyTypeService propertyService;

    @GetMapping
    public List<PropertyType> getPropertyTypes(){return propertyService.getPropertyTypes();
    }
}
