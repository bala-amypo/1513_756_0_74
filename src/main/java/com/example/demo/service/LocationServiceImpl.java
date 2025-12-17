package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepo;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepo locationRepo;

    public LocationServiceImpl(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    @Override
    public LocationEntity createLocation(LocationEntity location) {
        return locationRepo.save(location);
    }

    @Override
    public List<LocationEntity> getAll() {
        return locationRepo.findAll();
    }
}
