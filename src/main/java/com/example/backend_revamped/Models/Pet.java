package com.example.backend_revamped.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document
@AllArgsConstructor
public class Pet {
    @Id
    @Field(name = "_id")
    String id;
    @Field(name = "name")
    String name;
    @Field(name = "description")
    String description;
}
