package com.example.bookborrowingapplication.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    private long idBook;
    private String nameBook;
    private String author;
    private String price;
    private int quantity;
    @OneToMany(mappedBy = "book")
    Set<Borrow> borrows;

    public Book() {
    }

    public Book(long idBook, String nameBook, String author, String price, int quantity, Set<Borrow> borrows) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.borrows = borrows;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(Set<Borrow> borrows) {
        this.borrows = borrows;
    }
}
