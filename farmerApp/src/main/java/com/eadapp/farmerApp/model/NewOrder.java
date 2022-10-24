package com.eadapp.farmerApp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

    @Entity
    @Table
    public class NewOrder {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank
        @Column
        private int productType;
        @NotBlank
        @Column
        private String productName;
        @NotBlank
        @Column
        private String location;
        @NotBlank
        @Column
        private Long quantity;
        @Column
        @NotEmpty
        private Long price;
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

        public int getProductType() {
            return productType;
        }

        public void setProductType(int productType) {
            this.productType = productType;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public Long getQuantity() {
            return quantity;
        }

        public void setQuantity(Long quantity) {this.quantity = quantity;}

        public Long getPrice() { return price;}

        public void setPrice(Long price) {
            this.price = price;
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

