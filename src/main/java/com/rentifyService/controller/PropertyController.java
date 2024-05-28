package com.rentifyService.controller;

import com.rentifyService.entity.Property;
import com.rentifyService.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
@CrossOrigin
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<List<Property>> getPropertiesByOwnerId(@PathVariable Long ownerId) {
        List<Property> properties = propertyService.getPropertiesByOwnerId(ownerId);
        return ResponseEntity.ok(properties);
    }
    @GetMapping
    public ResponseEntity<List<Property>> getAllProperties() {
        List<Property> properties = propertyService.getAllProperties();
        return new ResponseEntity<>(properties, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addProperty(@RequestBody Property property) {
        propertyService.addProperty(property);
        return ResponseEntity.status(HttpStatus.CREATED).body("Property added successfully!");
    }
}
