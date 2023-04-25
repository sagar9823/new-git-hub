package com.example.prefix.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class PrefixGenderMappingId implements Serializable {

    private Integer prefixId;

    private Integer genderId;

}
