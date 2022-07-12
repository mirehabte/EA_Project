package library.library.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    private long paymentNumber;
    private double amount;

    public Payment(long paymentNumber, double amount) {
        this.paymentNumber = paymentNumber;
        this.amount = amount;
    }

    public long getPaymentNumber() {
        return paymentNumber;
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
                "paymentNumber=" + paymentNumber +
                ", amount=" + amount +
                '}';
    }
}
