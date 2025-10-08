public class morfTask3 {
    public static void main(String[] args) {
        Shape s1 = new Circle0(3);
        Shape s2 = new Rectangle0(4, 5);
        Shape s3 = new Triangle(3, 6);

        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());
        System.out.println(s3.calculateArea());
    }
}

class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Circle0 extends Shape {
    double r;
    Circle0(double r) { this.r = r; }
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

class Rectangle0 extends Shape {
    double w, h;
    Rectangle0(double w, double h) { this.w = w; this.h = h; }
    public double calculateArea() {
        return w * h;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) { this.base = base; this.height = height; }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
