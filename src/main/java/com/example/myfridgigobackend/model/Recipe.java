package com.example.myfridgigobackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "recipe_title", nullable = false)
    private String recipeTitle;
}
