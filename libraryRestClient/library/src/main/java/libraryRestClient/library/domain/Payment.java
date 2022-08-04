package libraryRestClient.library.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Payment {

    private long id;
    private double amount;

    public Payment(){}

    public Payment(double amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentNumber=" + id +
                ", amount=" + amount +
                '}';
    }
}
