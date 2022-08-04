package libraryRestClient.library.DTO;


import libraryRestClient.library.domain.Payment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PaymentAdapter {
    public static Payment getPaymentFromPaymentDTO(PaymentDTO paymentDTO){
        return new Payment(paymentDTO.getAmount());
    }
    public static PaymentDTO getPaymentDTOFromPayment(Payment payment){
        return new PaymentDTO(payment.getAmount());
    }
    public static Collection<PaymentDTO> getPaymentDTOListFromPaymentList(List<Payment> payments){
        List<PaymentDTO> paymentDTOS = new ArrayList<>();
        for(Payment payment : payments){
            paymentDTOS.add(getPaymentDTOFromPayment(payment));
        }
        return paymentDTOS;
    }
}
