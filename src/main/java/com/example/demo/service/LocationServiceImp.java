package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepo;

@Service
public class LocationServiceImp implements LocationService {

    @Autowired
    private LocationRepo locationRepo;

    @Override
    public LocationEntity createLocation(LocationEntity location) {
        return locationRepo.save(location);
    }

    @Override
    public List<LocationEntity> getall() {
        return locationRepo.findAll();
    }
}
