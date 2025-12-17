package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping
    public LocationEntity create(@RequestBody LocationEntity location) {
        return locationService.createLocation(location);
    }

    @GetMapping
    public List<LocationEntity> getAll() {
        return locationService.getall();
    }
}
