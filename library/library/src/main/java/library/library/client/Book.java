package library.library.client;


import java.util.ArrayList;
import java.util.List;


public class Book {

    private String isbn;
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<BookCopies> bookCopies = new ArrayList<>();

    public Book(){}

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthor(Author author) {
        authors.add(author);
    }

    public List<BookCopies> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(BookCopies bookCopy) {
        bookCopies.add(bookCopy);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                ", bookCopies=" + bookCopies +
                '}';
    }
}
