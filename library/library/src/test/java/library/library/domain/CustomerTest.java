package library.library.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import library.library.client.Book;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void testPayPenality() {
        assertEquals(0.0d, (new Customer()).payPenality(10.0d));
    }

    @Test
    void testReserveBook() {
        Customer customer = new Customer();
        customer.reserveBook(new ArrayList<>());
        assertEquals(0.0d, customer.getOutstandingFee());
        assertEquals(0L, customer.getCustomerNumber());
    }
}

