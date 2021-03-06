package com.scl.spring._4_jdbcTemplate.entity;

public class Book {
    private int bookId;
    private String name;
    private String author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "booId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
