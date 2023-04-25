package com.example.prefix.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;
@Data
@Entity
public class PrefixGenderMapping implements Serializable  {

    @EmbeddedId
    private PrefixGenderMappingId prefixGenderMappingId;

}