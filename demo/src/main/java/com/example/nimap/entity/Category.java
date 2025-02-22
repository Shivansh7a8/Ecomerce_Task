package com.example.nimap.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
// import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryid;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // @JsonManagedReference
    @JsonIgnoreProperties("category")
    private List<Product> products;

    public Category() {
    }

    public Category(Long categoryid, String name, List<Product> products) {
        this.categoryid = categoryid;
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public List<Product> getProducts() {
        return products;
    }

    // public void setProducts(List<Product> products) {
    // this.products = products;
    // }
    public void setProducts(List<Product> products) {
        this.products = products;
        if (products != null) {
            for (Product product : products) {
                product.setCategory(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Category [categoryid=" + categoryid + ", name=" + name + ", products=" + products + ", getName()="
                + getName() + ", getCategoryid()=" + getCategoryid() + ", getProducts()=" + getProducts()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    // Getters and Setters

}
