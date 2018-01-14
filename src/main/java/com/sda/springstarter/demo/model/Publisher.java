package com.sda.springstarter.demo.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "wydawca")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    @NotNull
    @Size(min=2, max=30)
    private String name;

    private String address;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> book;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;

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

}
