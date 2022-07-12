package book.book.service;

import book.book.domain.Book;
import book.book.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    //Adding a book
   public void addBook(BookDTO bookDTO){
       Book book = BookAdapter.getBookFromBookDTO(bookDTO);
       bookRepository.save(book);
   }
   //Delete a book
    public void deleteBook(String isbn){
       Book book = bookRepository.findById(isbn).get();
       if(book == null){
           System.out.println("Book with : "+isbn+" is not found !");
       }
       bookRepository.delete(book);
    }

    //Get all books
    public Collection<BookDTO> getAllBooks(){
       List<Book> bookList = bookRepository.findAll();
       return BookAdapter.getBookDTOListFromBookList(bookList);
    }
    //Get Book
    public BookDTO getBook(String isbn){
       Book book = bookRepository.findById(isbn).get();
       if(book == null){
           System.out.println("No book found with the : "+isbn);
       }
       return BookAdapter.getBookDTOFromBook(book);
    }

    //Update a Book
    public void updateBook(BookDTO bookDTO){
        Book book = BookAdapter.getBookFromBookDTO(bookDTO);
        //book = bookRepository.findById(book.getIsbn()).get();
//        if(book == null){
//            System.out.println("No book found with the : "+book.getIsbn());
//        }
        bookRepository.save(book);
        //return BookAdapter.getBookDTOFromBook(book);
    }
}
