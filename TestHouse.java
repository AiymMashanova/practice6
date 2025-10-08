public class TestHouse {
    public static void main(String[] args) {
        House h1 = new House("Almaty, Main Street 5", 4, 120.5);
        System.out.println("Address: " + h1.getAddress());
        System.out.println("Rooms: " + h1.getNumberOfRooms());
        System.out.println("Area: " + h1.getArea() + " m²");
        System.out.println("Price: $" + h1.calculatePrice(1000));
    }
}

class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public String getAddress() {
        return address; }
    public int getNumberOfRooms() {
        return numberOfRooms; }
    public double getArea() {
        return area; }

    public void setAddress(String address) {
        this.address = address; }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms; }
    public void setArea(double area) {
        this.area = area; }

    public double calculatePrice(double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
}
