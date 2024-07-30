import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private static Map<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        addProduct(new Product("001", "Laptop", 5, 999.99));
        addProduct(new Product("002", "Smartphone", 10, 499.99));
        addProduct(new Product("003", "Tablet", 7, 299.99));

        displayInventory();
    }

    public static void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public static void updateProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public static void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public static void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}