package com.jpa.Jpa.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.NoArgsConstructor;

import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data

@AllArgsConstructor
@SuperBuilder
@Entity
// @DiscriminatorValue("T")

public class Text extends Resource{
    
    private String contect ;
}
