
package com.jpa.Jpa.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@NamedQueries({
    @NamedQuery(
        name = "Author.updateByNameQuery", 
        query = "UPDATE Author a SET a.age = :age"
    )
})


public class Author extends BaseEntity{
    //we are removing this id because as we are extending it from the BaseEntity
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private int age;

    @ManyToMany
    
    private List<Course> courses; // Ensure the class name matches
}
