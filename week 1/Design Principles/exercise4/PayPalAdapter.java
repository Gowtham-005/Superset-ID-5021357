public class PayPalAdapter implements PaymentProcessor {
    private PayPalPayment payPalPayment;
    
    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }
    
    public void processPayment() {
        payPalPayment.makePayment();
    }
}