package com.example.bookborrowingapplication.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    private int idUser;
    private String name;

    @OneToMany(mappedBy = "user")
    Set<Borrow> borrows;

    public User() {
    }

    public User(int idUser, String name, Set<Borrow> borrows) {
        this.idUser = idUser;
        this.name = name;
        this.borrows = borrows;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(Set<Borrow> borrows) {
        this.borrows = borrows;
    }
}
