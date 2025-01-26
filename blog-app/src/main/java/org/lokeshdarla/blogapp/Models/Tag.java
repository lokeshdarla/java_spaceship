package org.lokeshdarla.blogapp.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection  = "tags")
public class Tag {
    @Id
    private  String id;
    private String name;
    List<Post> posts;
}
