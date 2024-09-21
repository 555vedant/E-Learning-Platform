package com.jpa.Jpa.Specification;

import org.springframework.data.jpa.domain.Specification;
import com.jpa.Jpa.models.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class AuthorSpecification {
    
    public static Specification<Author> hasAge(int age) {
        return (Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            if (age < 0) {
                return null;
            } else {
                return builder.equal(root.get("age"), age);
            }
        };
    }

    public static Specification<Author> firstnameContains(String firstname) {
        return (Root<Author> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {
            if (firstname == null || firstname.isEmpty()) {
                return null;
            } else {
                return builder.like(root.get("firstname") , "%" + firstname + "%");
            }
        };
    }
}
