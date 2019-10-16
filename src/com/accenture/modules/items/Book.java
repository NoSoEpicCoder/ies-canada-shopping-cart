package com.accenture.modules.items;

import com.accenture.modules.Item;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Book extends Item {

    private int pages;
    private String author;
    private String isbn;

    public Book (int id, String name, BigDecimal price, String author, String isbn, int pages) {
        super(id, name, ItemType.BOOK, price);
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
