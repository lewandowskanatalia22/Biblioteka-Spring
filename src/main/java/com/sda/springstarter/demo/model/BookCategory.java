package com.sda.springstarter.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "kategoria")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

//    @NotNull
//    @Size(min=2, max=30)
    private String name;

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private Set<Book> books;


    public BookCategory() {
    }

    public BookCategory(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

}