public class MobileApp implements Observer {
    public void update(String stockPrice) {
        System.out.println("Mobile App received stock price update: " + stockPrice);
    }
}
