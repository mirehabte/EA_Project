package library.library.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;


import library.library.client.Book;


import org.junit.jupiter.api.Test;

class BorrowTest {


    @Test
    void testCheckout() {
        Borrow borrow = new Borrow();
        borrow.checkout(new ArrayList<>());
        assertEquals(0L, borrow.getBorrowNumber());
    }


    @Test
    void testCheckout2() {
        Borrow borrow = new Borrow();

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("123", "Head First Design patterns"));
        borrow.checkout(bookList);
        assertEquals(0L, borrow.getBorrowNumber());
    }


    @Test
    void testCheckout3() {
        Borrow borrow = new Borrow();

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(
                "123", "Head First Design patterns"));
        bookList.add(new Book("123", "Head First Design patterns"));
        borrow.checkout(bookList);
        assertEquals(0L, borrow.getBorrowNumber());
    }

}

