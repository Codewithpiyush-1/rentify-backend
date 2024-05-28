package com.rentifyService.service;

import com.rentifyService.entity.Property;
import com.rentifyService.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    public List<Property> getPropertiesByOwnerId(Long ownerId) {
        return propertyRepository.findByOwnerId(ownerId);
    }

    public void addProperty(Property property) {
        propertyRepository.save(property);
    }
    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    // Other service methods
}
