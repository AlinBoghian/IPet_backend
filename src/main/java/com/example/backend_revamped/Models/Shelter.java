package com.example.backend_revamped.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "shelters")
@Data
@AllArgsConstructor
public class Shelter {
    @Id
    @Field(name = "_id")
    private String id;
    @Field (name = "user_id")
    private String user_id;
    @Field (name = "phone")
    private String phone;
    @Field (name = "adress")
    String address;
    @Field (name = "pet_ids")
    List<String> pet_ids;
}