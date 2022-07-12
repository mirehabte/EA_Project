package book.book.web;

import book.book.DTO.BookDTO;
import book.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

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
        return new ResponseEntity<Collection<BookDTO>>(bookDTOList, HttpStatus.OK);
    }

    @PutMapping("/books/{isbn}")
    public ResponseEntity<?> updateBook(@PathVariable("isbn") String isbn, @RequestBody BookDTO bookDTO){
        BookDTO bookUpdate = bookService.getBook(isbn);
        if(bookUpdate == null){
            return new ResponseEntity<CustomErrorType>(
                    new CustomErrorType("Book with : "+isbn+" not found !"),
                    HttpStatus.NOT_FOUND);
        }
       bookService.updateBook(bookDTO);
       return new ResponseEntity<BookDTO>(bookDTO, HttpStatus.OK);
    }

    //Searching by isbn, authorName, tittle, scancode
    @GetMapping("/books/search")
    public Collection<BookDTO> searchingBook(
            @RequestParam(value = "isbn") String isbn,
           // @RequestParam(value = "title") String title,
//            @RequestParam(value = "authorName") String authorName,
//            @RequestParam(value = "scanCode") String scanCode,
            @RequestParam(value = "operation") String operation
    ){
        Collection<BookDTO> bookDTOS = bookService.getAllBooks();
        if(operation.equals("isbn")) {
            return bookDTOS.stream().filter(b -> b.getIsbn().equals(isbn)).collect(Collectors.toList());
        }
//        if(operation.equals("title")) {
//            return bookDTOS.stream().filter(b -> b.getTitle().equals(title)).collect(Collectors.toList());
//        }
//        if(operation.equals("author")){
//            return bookDTOS.stream().flatMap(b -> b.getAuthorsDTOList().stream()).filter(b -> b.equals(authorName));
//        }
//        if(operation.equals("bookCopies")) bookDTOS.stream().flatMap(b -> b.getBookCopiesDTOList().stream()).filter(b -> b.getScanCode().equals(scanCode));
        return bookDTOS;
    }
}
