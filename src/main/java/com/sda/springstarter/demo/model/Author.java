package com.sda.springstarter.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "autorzy")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Size(min=2, max=60)
    private String lastname;

    @NotNull
    @Size(min=2, max=30)
    private String address;

    @OneToMany(mappedBy = "bookAuthor", cascade = CascadeType.ALL)
    private Set<Book> books;

    public Author(String name, String lastname, String address, Set<Book> books) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.books = books;
    }

    public Author() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
