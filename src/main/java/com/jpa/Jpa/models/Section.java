package com.jpa.Jpa.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data

@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class Section extends BaseEntity {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) 
    // private Integer id;
    
    private String name;
    private String sectionOrder; // Renamed from "order" to avoid SQL reserved keyword conflict

    // Many sections belong to one course
    @ManyToOne
    @JoinColumn(name = "course_id") // Foreign key for the Course entity
    private Course course;

    // // One section can have multiple subsections
    // @OneToMany(mappedBy = "parentSection", cascade = CascadeType.ALL) // Specify the parentSection field
    // private List<Section> subsections; 

    // // Many subsections belong to one parent section
    // @ManyToOne
    // @JoinColumn(name = "parent_section_id") // Foreign key for the parent section
    // private Section parentSection;
}
