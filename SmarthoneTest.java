public class SmarthoneTest {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S23", 128);
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage: " + phone.getStorageCapacity() + " GB");

        phone.increaseStorage(64);
        System.out.println("\nAfter upgrade:");
        System.out.println("Storage: " + phone.getStorageCapacity() + " GB");
    }
}

class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void increaseStorage(int amount) {
        if (amount > 0) {
            storageCapacity += amount;
        }
    }
}

