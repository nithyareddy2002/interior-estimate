package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.Material;
import com.interiorestimate.interiorestimate.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService{

    @Autowired
    MaterialRepository materialRepository;

    @Override
    public List<Material> getMaterials(){
        return materialRepository.findAll();
    }

}
