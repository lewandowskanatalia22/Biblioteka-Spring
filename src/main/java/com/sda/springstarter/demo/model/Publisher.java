package com.sda.springstarter.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "wydawca")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;

    @OneToOne(mappedBy = "publisher")
    private Book book;

    public Publisher(String name, String address, Book book) {
        this.name = name;
        this.address = address;
        this.book = book;
    }

    public Publisher() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
