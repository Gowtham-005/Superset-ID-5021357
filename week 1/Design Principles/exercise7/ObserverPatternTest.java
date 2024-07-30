public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();
        
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);
        
        stockMarket.setStockPrice("100 USD");
        stockMarket.setStockPrice("105 USD");
    }
}
