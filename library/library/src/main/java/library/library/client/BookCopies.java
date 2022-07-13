package library.library.client;




public class BookCopies {

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
