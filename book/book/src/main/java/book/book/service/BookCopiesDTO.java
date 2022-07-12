package book.book.service;

public class BookCopiesDTO {
    private String scanCode;

    public BookCopiesDTO(){}

    public BookCopiesDTO(String scanCode) {
        this.scanCode = scanCode;
    }

    public String getScanCode() {
        return scanCode;
    }

}
