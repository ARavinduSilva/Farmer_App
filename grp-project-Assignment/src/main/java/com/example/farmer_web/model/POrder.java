package com.example.farmer_web.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class POrder {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String cName;
    private String pName;
    private String ptype;
    private String quantity;
    private String price;
    private Date date;

}
