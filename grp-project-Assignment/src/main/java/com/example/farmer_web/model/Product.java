package com.example.farmer_web.model;


import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String price;
    private String description;
    private Date date;

}
