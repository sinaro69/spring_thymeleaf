package com.istad.springthymleafpartone.repository;

import com.istad.springthymleafpartone.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    List<Author> authors = new ArrayList<>(){{
        add(new Author(1001,"Joch","male","HI kon apoapappapap"));
        add(new Author(1001,"Joch","male","HI kon apoapappapap"));
        add(new Author(1001,"Joch","male","HI kon apoapappapap"));
        add(new Author(1001,"Joch","male","HI kon apoapappapap"));
    }};
    public List<Author> getAllAuthor(){
        return authors;
    }
}
