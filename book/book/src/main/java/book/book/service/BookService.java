package book.book.service;

import book.book.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    //Adding a book
   /* public void addBook(Book book){

    }*/
}
