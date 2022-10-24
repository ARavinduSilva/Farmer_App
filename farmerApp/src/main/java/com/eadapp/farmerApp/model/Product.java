package com.eadapp.farmerApp.model;

//import jdk.incubator.vector.VectorOperators;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column
    private String name;
    @Column(name = "image", unique = false, nullable = false, length = 100000)
    private byte[] image;
    @NotBlank
    @Column
    private int productType;
    @Lob
    @Column
    @NotEmpty
    private String description;
    @NotBlank
    @Column
    private Long quantity;
    @Column
    @NotEmpty
    private Long unitPrice;
    @Column
    @NotEmpty
    private Boolean activeStatus;
    @Column
    private Instant createdOn;
    @Column
    private Instant updatedOn;
    @Column
    @NotBlank
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setTitle(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {this.quantity = quantity;}

    public Long getUnitPrice() { return unitPrice;}

    public void setActiveStatus(Boolean activeStatus) {this.activeStatus = activeStatus;}

    public Boolean getActiveStatus() { return activeStatus;}

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}