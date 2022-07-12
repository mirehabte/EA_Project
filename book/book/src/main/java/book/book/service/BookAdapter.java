package book.book.service;

import book.book.domain.Author;
import book.book.domain.Book;
import book.book.domain.BookCopies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookAdapter {

    public static Book getBookFromBookDTO(BookDTO bookDTO){
        Book book = new Book(bookDTO.getIsbn(), bookDTO.getTitle());
        for(BookCopiesDTO bookCopiesDTO : bookDTO.getBookCopies()){
            book.setBookCopies(BookCopiesAdapter.getBookCopiesFromBookCopiesDTO(bookCopiesDTO));
        }
        for(AuthorDTO authorDTO : bookDTO.getAuthors()){
            book.setAuthor(AuthorAdapter.getAuthorFromAuthorDTO(authorDTO));
        }
        return book;
    }

    public static BookDTO getBookDTOFromBook(Book book){
        BookDTO bookDTO = new BookDTO(book.getIsbn(), book.getTitle());
        for(BookCopies bookCopies : book.getBookCopies()){
            bookDTO.setBookCopies(BookCopiesAdapter.getBookCopiesDTOFromBookCopies(bookCopies));
        }
        for(Author author : book.getAuthors()){
            bookDTO.setAuthor(AuthorAdapter.getAuthorDTOFromAuthor(author));
        }
        return bookDTO;
    }

    public static Collection<BookDTO> getBookDTOListFromBookList(List<Book> bookList){
        List<BookDTO> bookDTOS = new ArrayList<>();
        for(Book book : bookList){
            bookDTOS.add(getBookDTOFromBook(book));
        }
        return bookDTOS;
    }
}
