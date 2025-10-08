public class morfTask11  {
    public static void main(String[] args) {
        Vehicle2 c = new Car2();
        Vehicle2 m = new Motorcycle();

        c.startEngine();
        c.stopEngine();
        m.startEngine();
        m.stopEngine();
    }
}

class Vehicle2 {
    public void startEngine() {
    }
    public void stopEngine() {

    }
}

class Car2 extends Vehicle2 {
    public void startEngine() {
        System.out.println("Car engine started!");
    }
    public void stopEngine() {
        System.out.println("Car engine stopped!");
    }
}

class Motorcycle extends Vehicle2 {
    public void startEngine() {
        System.out.println("Motorcycle engine starts with a roar!");
    }
    public void stopEngine() {
        System.out.println("Motorcycle engine stops quietly.");
    }
}

