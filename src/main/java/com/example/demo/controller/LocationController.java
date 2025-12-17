package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/addlocation")
    public LocationEntity add(@RequestBody LocationEntity location) {
        return locationService.createLocation(location);
    }

    @GetMapping("/showlocation")
    public List<LocationEntity> show() {
        return locationService.getAll();
    }
}
