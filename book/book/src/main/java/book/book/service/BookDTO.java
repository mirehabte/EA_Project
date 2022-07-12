package book.book.service;


import java.util.ArrayList;
import java.util.List;

public class BookDTO {
    private String isbn;
    private String title;
    private List<AuthorDTO> authorsDTOList = new ArrayList<>();
    private List<BookCopiesDTO> bookCopiesDTOList = new ArrayList<>();

    public BookDTO(){}

    public BookDTO(String isbn, String title) {
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

    public List<AuthorDTO> getAuthors() {
        return authorsDTOList;
    }

    public void setAuthor(AuthorDTO author) {
        authorsDTOList.add(author);
    }

    public List<BookCopiesDTO> getBookCopies() {
        return bookCopiesDTOList;
    }

    public void setBookCopies(BookCopiesDTO bookCopy) {
        bookCopiesDTOList.add(bookCopy);
    }

}
