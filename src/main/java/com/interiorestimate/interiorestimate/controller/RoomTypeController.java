package com.interiorestimate.interiorestimate.controller;

import com.interiorestimate.interiorestimate.model.RoomType;
import com.interiorestimate.interiorestimate.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room-type")
public class RoomTypeController {

    @Autowired
    RoomTypeService roomTypeService;

    @GetMapping
    public List<RoomType> getRoomTypes(){
        return roomTypeService.getRoomTypes();
    }
}
