import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockPrice;
    
    public void register(Observer observer) {
        observers.add(observer);
    }
    
    public void deregister(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
    
    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
