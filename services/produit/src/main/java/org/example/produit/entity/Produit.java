package org.example.produit.entity;

import java.lang.annotation.Documented;

@Document
@lombok
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private int stock;

}

