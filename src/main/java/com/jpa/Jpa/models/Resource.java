// package com.jpa.Jpa.models;

// import jakarta.persistence.DiscriminatorColumn;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Inheritance;
// import jakarta.persistence.InheritanceType;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToOne;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.EqualsAndHashCode;
// import lombok.NoArgsConstructor;
// import lombok.experimental.SuperBuilder;


// @Data
// @SuperBuilder
// @AllArgsConstructor
// @NoArgsConstructor
// @Entity
// //because of this all subclass named video , file and test will get store in single table the discriminator table is Resorce
// // @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// // @DiscriminatorColumn(name = "resource_type")
// //there are 3 kind of stratagy for this -> single_table , join and table_per_class
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// public class Resource{
//     @Id
//    @GeneratedValue(
//         strategy = GenerationType.IDENTITY
//     )
//     private Integer id;
//     private String name;
//     private int size ;
//     private String url;

// //lecture and resorce has one to one relationship
//    @OneToOne
//    @JoinColumn(name = "lecture_id")
//    private Lecture lecture;

// }
// ------------------------------------------------------------------
package com.jpa.Jpa.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Resource {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO) 
    // private Integer id;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resource_seq")
    @SequenceGenerator(name = "resource_seq", sequenceName = "resource_sequence", allocationSize = 1)
    private Integer id;
    private String name;
    private int size;
    private String url;

    // Lecture and Resource have one-to-one relationship
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
