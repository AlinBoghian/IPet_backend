package com.example.backend_revamped.Models;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id //primary key
    @Field("_id")
    private String id;
    @Indexed(unique = true)
    @Field("email")
    private String email;
    @Field("username")
    private String username;
    @Field("password")
    private String passwd;
    @Field("type")
    private String type;


    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}