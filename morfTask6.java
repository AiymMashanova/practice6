public class morfTask6{
    public static void main(String[] args) {
        Shape2 c = new Circle2(5);
        Shape2 r = new Rectangle2(4, 6);
        Shape2 t = new Triangle2(3, 4, 5);

        System.out.println(c.getArea() + " " + c.getPerimeter());
        System.out.println(r.getArea() + " " + r.getPerimeter());
        System.out.println(t.getArea() + " " + t.getPerimeter());
    }
}

class Shape2 {
    public double getArea() {
        return 0; }
    public double getPerimeter() {
        return 0; }
}

class Circle2 extends Shape2 {
    double r;
    Circle2(double r) {
        this.r = r;
    }
    public double getArea() {
        return Math.PI * r * r;
    }
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}

class Rectangle2 extends Shape2 {
    double w, h;
    Rectangle2(double w, double h) {
        this.w = w; this.h = h;
    }
    public double getArea() {
        return w * h;
    }
    public double getPerimeter() {
        return 2 * (w + h);
    }
}

class Triangle2 extends Shape2 {
    double a, b, c;
    Triangle2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double getPerimeter() {
        return a + b + c;
    }
}

