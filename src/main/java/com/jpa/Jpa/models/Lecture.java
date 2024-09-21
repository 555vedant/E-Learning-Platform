package com.jpa.Jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Lecture extends BaseEntity{
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) // Specify the generation strategy
    // private Integer id;
    
    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id") // Specify the foreign key column for the Section relationship
    private Section section;

   
    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}
