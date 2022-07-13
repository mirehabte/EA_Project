package library.library.DTO;

public class PaymentDTO {
    private long id;
    private double amount;

    public PaymentDTO(){}
    public PaymentDTO(double amount) {
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
        return "PaymentDTO{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
