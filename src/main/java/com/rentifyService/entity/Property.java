package com.rentifyService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Long ownerId;

    @Column(name = "place")
    private String place;

    @Column(name = "area")
    private String area;

    @Column(name = "bedrooms")
    private int bedrooms;

    @Column(name = "bathrooms")
    private int bathrooms;

    @Column(name = "nearby_hospitals")
    private String nearbyHospitals;

    @Column(name = "nearby_colleges")
    private String nearbyColleges;

    @Column(name = "rent")
    private double rent;

    // Getters and setters
}
