public class StrategyPatternTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();
        
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout();
    }
}
