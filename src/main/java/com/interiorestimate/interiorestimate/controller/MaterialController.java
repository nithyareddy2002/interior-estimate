package com.interiorestimate.interiorestimate.controller;

import com.interiorestimate.interiorestimate.model.Material;
import com.interiorestimate.interiorestimate.model.PropertyType;
import com.interiorestimate.interiorestimate.service.InteriorEstimateService;
import com.interiorestimate.interiorestimate.service.MaterialService;
import com.interiorestimate.interiorestimate.service.MaterialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    MaterialService materialService;

    @GetMapping
    public List<Material> getMaterials(){
        return materialService.getMaterials();
    }
}
