package com.example.backend_revamped.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
public class Review {
    @Id
    @Field(name = "_id")
    private String id;
    @Field(name = "stars")
    private int stars;
    @Field(name = "description")
    private String description;
    @Field(name = "user_id")
    String user_id;
    @Field(name = "veterinary id")
    String veterinary_id;
}
