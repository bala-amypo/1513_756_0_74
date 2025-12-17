package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{ 
@Autowired 
LocationRepository locationrepo;

@Override
public LocationEntity createLocation(LocationEntity le) {
      return locationrepo.save(le);
}
   
@Override
public List<LocationEntity> getallocation() {
    return locationrepo.findAll();          
}
}

