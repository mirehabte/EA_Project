package book.book.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookCopies {
    @Id
    private String scanCode;
    private boolean isBorrowed;

    public BookCopies(){}

    public BookCopies(String scanCode) {
        this.scanCode = scanCode;
        this.isBorrowed = false;
    }

    public String getScanCode() {
        return scanCode;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "BookCopies{" +
                "scanCode='" + scanCode + '\'' +
                '}';
    }
}
