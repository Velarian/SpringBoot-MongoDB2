package com.PWS.MongoDB.SpringbootMongoDB.MODEL;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("User")
public class User {
    @Field("username")
    private String username;
    @Field("password")
    private String password;
    @Id
    private String id;
    
    

}
