public class WebApp implements Observer {
    public void update(String stockPrice) {
        System.out.println("Web App received stock price update: " + stockPrice);
    }
}
