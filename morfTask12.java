public class morfTask12 {
    public static void main(String[] args) {
        Shape4 s1 = new Circle4(3);
        Shape4 s2 = new Cylinder(3, 5);

        s1.draw();
        System.out.println(s1.calculateArea());
        s2.draw();
        System.out.println(s2.calculateArea());
    }
}

class Shape4 {
    public void draw() {
    }
    public double calculateArea() {
        return 0;
    }
}

class Circle4 extends Shape4 {
    double r;
    Circle4(double r) {
        this.r = r;
    }
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

class Cylinder extends Shape4 {
    double r, h;
    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }
    public void draw() {
        System.out.println("Drawing a cylinder.");
    }
    public double calculateArea() {
        return 2 * Math.PI * r * (r + h);
    }
}
