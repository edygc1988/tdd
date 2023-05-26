package ec.edu.apt.tdd.payment;

public interface PaymentGateway {
    public PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
