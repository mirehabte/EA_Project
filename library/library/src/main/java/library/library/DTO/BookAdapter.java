package library.library.DTO;


import library.library.client.Author;
import library.library.client.Book;
import library.library.client.BookCopies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookAdapter {

    public static Book getBookFromBookDTO(BookDTO bookDTO){
        Book book = new Book(bookDTO.getIsbn(), bookDTO.getTitle());
        for(BookCopiesDTO bookCopiesDTO : bookDTO.getBookCopiesDTOList()){
            book.setBookCopies(BookCopiesAdapter.getBookCopiesFromBookCopiesDTO(bookCopiesDTO));
        }
        for(AuthorDTO authorDTO : bookDTO.getAuthorsDTOList()){
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

    public static List<Book> getBookListFromBookDTOList(List<BookDTO> bookList){
        List<Book> books = new ArrayList<>();
        for(BookDTO bookDTO : bookList){
            books.add(getBookFromBookDTO(bookDTO));
        }
        return books;
    }
}
