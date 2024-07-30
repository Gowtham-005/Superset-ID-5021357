public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter(new PayPalPayment());
        processor.processPayment();
    }
}
