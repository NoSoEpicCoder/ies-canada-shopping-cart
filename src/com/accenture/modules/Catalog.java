package com.accenture.modules;

import com.accenture.modules.items.Book;
import com.accenture.modules.items.CD;
import com.accenture.modules.items.ItemType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Catalog {

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

    }

    public int find(Item item) {
        int result = -1;

        if(item.getItemType() == ItemType.BOOK) {
            for (Book book : books)
                if (book.equals(item))
                    result = book.getId();
        } else if(item.getItemType() == ItemType.CD){
            for (CD cd : cds)
                if (cd.equals(item))
                    result = cd.getId();
        }

        return result;
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

}
