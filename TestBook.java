class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
            this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price = price - (price * percent / 100);
        }
    }
}
public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "John Smith", 100.0);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: $" + book1.getPrice());

        book1.applyDiscount(20);

        System.out.println("\nAfter 20% discount:");
        System.out.println("Price: " + book1.getPrice());
    }
}
