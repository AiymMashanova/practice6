public class morfTask8 {
    public static void main(String[] args) {
        Shape3 s1 = new Circle3(3);
        Shape3 s2 = new Square3(4);
        Shape3 s3 = new Triangle3(5, 6);

        s1.draw();
        System.out.println(s1.calculateArea());
        s2.draw();
        System.out.println(s2.calculateArea());
        s3.draw();
        System.out.println(s3.calculateArea());
    }
}

class Shape3 {
    public void draw() {}
    public double calculateArea() {
        return 0;
    }
}

class Circle3 extends Shape3 {
    double r;
    Circle3(double r) { this.r = r; }
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

class Square3 extends Shape3 {
    double side;
    Square3(double side) {
        this.side = side;
    }
    public void draw() {
        System.out.println("Drawing a square.");
    }
    public double calculateArea() {
        return side * side;
    }
}

class Triangle3 extends Shape3 {
    double base, height;
    Triangle3(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void draw() {
        System.out.println("Drawing a triangle."); }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
