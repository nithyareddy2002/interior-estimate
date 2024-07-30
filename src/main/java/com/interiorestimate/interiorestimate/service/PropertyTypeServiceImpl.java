package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.PropertyType;
import com.interiorestimate.interiorestimate.repository.PropertyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyTypeServiceImpl implements PropertyTypeService {

    @Autowired
    PropertyTypeRepository propertyTypeRepository;

    @Override
    public List<PropertyType> getPropertyTypes(){return propertyTypeRepository.findAll();
    }
}
