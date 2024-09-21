package com.jpa.Jpa.models.embedded;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
@Embeddable

public class OrderId implements Serializable {
    //basically this embedded id are just unique combination of orderid and product id like composite key

    private String username ;
    private LocalDateTime orderDate ;
    //because of this we can embed address fields in this class
    private  Address address ;

    public OrderId() {
    }
    

}
