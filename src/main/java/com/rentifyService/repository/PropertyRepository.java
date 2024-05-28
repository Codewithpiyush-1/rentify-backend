package com.rentifyService.repository;

import com.rentifyService.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository  extends JpaRepository<Property,Long> {
    List<Property> findByOwnerId(Long ownerId);
}
