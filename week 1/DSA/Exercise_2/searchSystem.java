public class SearchSystem {
    private static Product[] products;

    public static void main(String[] args) {
        products = new Product[]{
            new Product("001", "Laptop", "Electronics"),
            new Product("002", "Smartphone", "Electronics"),
            new Product("003", "Tablet", "Electronics"),
        };

        System.out.println(linearSearch("Tablet"));
        System.out.println(binarySearch("Smartphone"));
    }

    public static Product linearSearch(String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(String productName) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = productName.compareTo(products[mid].getProductName());
            if (result == 0)
                return products[mid];
            if (result > 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
