package com.example.prefix.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Gender {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String gender;



}
