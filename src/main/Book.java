package main;

public class Book {
    private String book_name;
    private String author_name;
    private String isbn_no;

    public Book(String book_name, String author_name, String isbn_no) {
        this.book_name = book_name;
        this.author_name = author_name;
        this.isbn_no = isbn_no;
    }

    @Override
    public String toString() {
        return "-------------------------" + "\n" + "BookName:\t" + book_name + "\n" + "AuthorName:\t" + author_name + "\n" + "ISBN:\t" + isbn_no + "\n" + "--------------------------";
    }
}
