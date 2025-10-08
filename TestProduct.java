public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product("Laptop", "LP-2025", 1200.0);

        System.out.println("Product: " + p.getProductName());
        System.out.println("Code: " + p.getProductCode());
        System.out.println("Price: $" + p.getPrice());

        p.applyDiscount(15);
        System.out.println("\nAfter 15% discount: " + p.getPrice());
    }
}

class Product {
    private String productName;
    private String productCode;
    private double price;

    public Product(String productName, String productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }
    public String getProductCode() {
        return productCode;
    }
    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price -= price * percent / 100;
        }
    }
}
