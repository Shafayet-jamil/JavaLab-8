public interface PaymentMathod {
    boolean authorizePayment(double amount);
    void processPayment(double amount);
    void refundPayment(double amount);
}
