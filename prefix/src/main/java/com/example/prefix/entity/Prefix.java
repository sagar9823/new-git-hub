package com.example.prefix.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prefix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String prefix;

    @Transient
    private int genderId;

}
