package library.library.DTO;

public class CustomerDTO {
    private long customerNumber;
    private String name;
    private String email;
    private double outstandingFee;

    private BorrowDTO borrow;

    private PaymentDTO payment;

    private ReservationDTO reservation;

    public CustomerDTO(){}

    public CustomerDTO(long customerNumber, String name, String email) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.email = email;
        this.outstandingFee = 0.0;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getOutstandingFee() {
        return outstandingFee;
    }

    public void setOutstandingFee(double outstandingFee) {
        this.outstandingFee = outstandingFee;
    }

    public BorrowDTO getBorrow() {
        return borrow;
    }

    public void setBorrow(BorrowDTO borrow) {
        this.borrow = borrow;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public ReservationDTO getReservation() {
        return reservation;
    }

    public void setReservation(ReservationDTO reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", outstandingFee=" + outstandingFee +
                ", borrow=" + borrow +
                ", payment=" + payment +
                ", reservation=" + reservation +
                '}';
    }
}
