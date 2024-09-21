package com.jpa.Jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.Jpa.models.Author;

import jakarta.transaction.Transactional;



public interface AuthorRepository extends JpaRepository<Author , Integer> , JpaSpecificationExecutor<Author> {
   
    //here name of firstname should as same as the methioned in the author class and for method name to follow the camelcase we are doint first letter as capital 
    //select * from author where firstname = "ved"
    List<Author> findAllByFirstname(String fn);
    List<Author> findAllByFirstnameIgnoreCase(String fn);
    //select * from author where firstname like "ved%"
    //this % sign mince starts with ved and ends with anyname
    List<Author> findAllByFirstnameContainingIgnoreCase(String fn);
    //select * from author where first_name in ("reshma" , "ved" , "yash")
    List<Author> findAllByFirstnameIn(List<String> fn);
    @Modifying
    @Query("update Author a set a.age = :age where a.id = :id")
    @Transactional
    void updateAgeById(Integer id, int age);

    @Modifying
    @Transactional
    void updateByNameQuery(@Param("age") int age);
    

    
    
}
