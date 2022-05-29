package com.example.backend_revamped.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
/*GridFS is an API used to store data > 16MB (max size for BSON doc)
 */
@Document(collection = "posts")
@Data
@AllArgsConstructor
public class Lost {
        @Id
        @Field(name = "_id")
        private String id;
        @Field(name = "description")
        private String description;
        @Field(name = "location")
        private String location;
        @Field(name = "userId")
        private String userId;
        @Field(name = "sightings_id")
        private ArrayList<String> sightings_id;
}
