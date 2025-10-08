public class DesktopTest {
    public static void main(String[] args) {
        Desktop pc = new Desktop("HP", "Intel i5", 8);
        System.out.println("Brand: " + pc.getBrand());
        System.out.println("Processor: " + pc.getProcessor());
        System.out.println("RAM: " + pc.getRamSize() + " GB");

        pc.upgradeRam(8);
        System.out.println("\nAfter upgrade:");
        System.out.println("RAM: " + pc.getRamSize() + " GB");
    }
}

class Desktop {
    private String brand;
    private String processor;
    private int ramSize;

    public Desktop(String brand, String processor, int ramSize) {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
    }

    public String getBrand() {
        return brand;
    }
    public String getProcessor() {
        return processor;
    }
    public int getRamSize() {
        return ramSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void upgradeRam(int value) {
        if (value > 0) {
            ramSize += value;
        }
    }
}
