package com.jpa.Jpa;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import com.jpa.Jpa.Specification.AuthorSpecification;
import com.jpa.Jpa.models.Author;
import com.jpa.Jpa.repository.AuthorRepository;

import net.datafaker.Faker;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(AuthorRepository repo) {
        return args -> {
            for(int i = 0 ; i<50 ; i++){
                Faker faker = new Faker();

            Author author = Author.builder()  // Use Author type explicitly
                .firstname(faker.name().firstName())
                .lastname(faker.name().lastName())      
                .age(faker.number().numberBetween(19, 50))
                .email("vedantvvk" + i + "@gmail.com")
                .build();
                //using update so thats why i just commeted this save out
            // repo.save(author);
            //query for updating age of author 
            // repo.updateAgeById(author.getId(), author.getAge() + 1);
            // repo.updateByNameQuery(12);
            Specification<Author> spec = Specification
                     .where(AuthorSpecification.hasAge(34))
                      .and(AuthorSpecification.firstnameContains("Lecia"));  
                      repo.findAll(spec).forEach(System.out::println);
                    


            }
        };
    }
}
