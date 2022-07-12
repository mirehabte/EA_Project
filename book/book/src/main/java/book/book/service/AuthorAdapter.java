package book.book.service;

import book.book.domain.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorAdapter {
    public static Author getAuthorFromAuthorDTO(AuthorDTO authorDTO){
        return new Author(authorDTO.getAuthorNumber(), authorDTO.getName());
    }
    public static AuthorDTO getAuthorDTOFromAuthor(Author author){
        return new AuthorDTO(author.getAuthorNumber(), author.getName());
    }
    public static List<AuthorDTO> getAuthorDTOListFromAuthorList(List<Author> authors){
        List<AuthorDTO> authorDTOS = new ArrayList<>();
        for(Author author : authors){
            authorDTOS.add(getAuthorDTOFromAuthor(author));
        }
        return authorDTOS;
    }
}
