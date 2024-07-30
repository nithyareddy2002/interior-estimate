package com.interiorestimate.interiorestimate.service;

import com.interiorestimate.interiorestimate.model.RoomType;
import com.interiorestimate.interiorestimate.repository.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {

    @Autowired
    RoomTypeRepository roomTypeRepository;

    @Override
    public List<RoomType> getRoomTypes(){return roomTypeRepository.findAll();}

}
