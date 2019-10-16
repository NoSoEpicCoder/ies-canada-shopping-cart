package com.accenture.modules;

import com.accenture.modules.items.Book;
import com.accenture.modules.items.CD;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private ArrayList<Item> items;
    private ArrayList<Book> books;
    private ArrayList<CD> cds;

    public Catalog() {
        books = new ArrayList<Book>();
        Book book = new Book(0,
                "Spring Boot In Action",
                BigDecimal.valueOf(39.00),
                "Craig Walls",
                "9781617292545",
                264);
        books.add(book);

        cds = new ArrayList<CD>();
        CD cd = new CD(1,
                "Waltz for Debby",
                BigDecimal.valueOf(8.99),
                "Bill Evans",
                6);
        cds.add(cd);

        items = new ArrayList<Item>();
        items.add(book);
        items.add(cd);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public List<CD> getCds() {
        return cds;
    }

    public void setCds(ArrayList<CD> cds) {
        this.cds = cds;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}
