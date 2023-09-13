package com.example.bookborrowingapplication.entity;

import javax.persistence.*;

@Entity
public class Borrow {
    @Id
    private long idBorrow;
    @ManyToOne()
    @JoinColumn(name = "id_user")
    User user;
    @ManyToOne()
    @JoinColumn(name = "id_book")
    Book book;

    public Borrow() {
    }

    public Borrow(Long idBorrow, User user, Book book) {
        this.idBorrow = idBorrow;
        this.user = user;
        this.book = book;
    }

    public long getIdBorrow() {
        return idBorrow;
    }

    public void setIdBorrow(long idBorrow) {
        this.idBorrow = idBorrow;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
