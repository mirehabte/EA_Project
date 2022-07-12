package book.book.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Author {
    @Id
    private long authorNumber;
    private String name;

    public Author(){}

    public Author(long authorNumber, String name) {
        this.authorNumber = authorNumber;
        this.name = name;
    }

    public long getAuthorNumber() {
        return authorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorNumber=" + authorNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
