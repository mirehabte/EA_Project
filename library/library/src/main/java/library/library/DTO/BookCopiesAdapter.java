package library.library.DTO;


import library.library.client.BookCopies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookCopiesAdapter {
    public static BookCopies getBookCopiesFromBookCopiesDTO(BookCopiesDTO bookCopiesDTO){
        return new BookCopies(bookCopiesDTO.getScanCode());
    }
    public static BookCopiesDTO getBookCopiesDTOFromBookCopies(BookCopies bookCopies){
        return new BookCopiesDTO(bookCopies.getScanCode());
    }
    public Collection<BookCopiesDTO> getBookCopiesDTOListFromBookCopiesList(List<BookCopies> bookCopiesList){
        List<BookCopiesDTO> bookCopiesDTOS = new ArrayList<>();
        for(BookCopies bookCopies : bookCopiesList){
            bookCopiesDTOS.add(getBookCopiesDTOFromBookCopies(bookCopies));
        }
        return bookCopiesDTOS;
    }
}
