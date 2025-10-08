public class TestCircle {
    public  static void main(String[] args){
        Circle c0 = new Circle(2.0);
        System.out.println(c0.calcuatePerimetr() + ", " + c0.calculateArea());
        c0.setRadius(3.0);
        System.out.println(c0.getRadius());
    }
}
class Circle {
    private double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calcuatePerimetr(){
        return 2*Math.PI*radius;
    }

}
