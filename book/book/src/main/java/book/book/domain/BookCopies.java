package book.book.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookCopies {
    @Id
    private String scanCode;

    public BookCopies(String scanCode) {
        this.scanCode = scanCode;
    }

    public String getScanCode() {
        return scanCode;
    }

    @Override
    public String toString() {
        return "BookCopies{" +
                "scanCode='" + scanCode + '\'' +
                '}';
    }
}
