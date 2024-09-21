package com.jpa.Jpa.models.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

@Embeddable
public class Address {
    private String streetName;
    private String houseNumber;
    private String zipCode;
    public Address() {
    }
    
}
