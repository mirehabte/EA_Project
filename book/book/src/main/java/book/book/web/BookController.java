package book.book.web;

import book.book.service.BookDTO;
import book.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/books")
    public ResponseEntity<?> addBook(@RequestBody BookDTO bookDTO){
        bookService.addBook(bookDTO);
        return new ResponseEntity<BookDTO>(bookDTO, HttpStatus.OK);
    }

    @GetMapping("/books/{isbn}")
    public ResponseEntity<?> getBook(@PathVariable("isbn") String isbn){
        BookDTO bookDTO = bookService.getBook(isbn);
        if(bookDTO == null){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Book with : "+isbn+" not found !"),
                    HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<BookDTO>(bookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/books/{isbn}")
    public ResponseEntity<?> deleteBook(@PathVariable("isbn") String isbn){
        BookDTO bookDTO = bookService.getBook(isbn);
        if(bookDTO == null) {
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Book with : "+isbn+" not found !"),
                    HttpStatus.NOT_FOUND);
        }
        bookService.deleteBook(isbn);
        return new ResponseEntity<BookDTO>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/books")
    public ResponseEntity<?> getAllBooks(){
        Collection<BookDTO> bookDTOList = bookService.getAllBooks();
        return new ResponseEntity<BookDTO>((BookDTO) bookDTOList, HttpStatus.OK);
    }

    @PutMapping("/books")
    public ResponseEntity<?> updateBook(@RequestBody BookDTO bookDTO){
        BookDTO bookUpdate = bookService.getBook(bookDTO.getIsbn());
        if(bookUpdate == null){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Book with : "+bookDTO.getIsbn()+" not found !"),
                    HttpStatus.NOT_FOUND);
        }
       bookService.updateBook(bookDTO);
        return new ResponseEntity<BookDTO>(bookDTO, HttpStatus.OK);
    }
}
