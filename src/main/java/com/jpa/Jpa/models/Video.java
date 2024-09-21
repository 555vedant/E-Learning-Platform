package com.jpa.Jpa.models;


import org.hibernate.annotations.Polymorphism;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@SuperBuilder
@Entity

// @DiscriminatorValue("V")

public class Video extends Resource{
    private int length;

}
