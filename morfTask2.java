public class morfTask2 {
    public static void main(String[] args) {
        Vehicle v1 = new Car1();
        Vehicle v2 = new Bicycle();

        v1.speedUp();
        v2.speedUp();
    }
}

class Vehicle {
    public void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }
}

class Car1 extends Vehicle {
    public void speedUp() {
        System.out.println("Car speeds up quickly with engine power!");
    }
}

class Bicycle extends Vehicle {
    public void speedUp() {
        System.out.println("Bicycle speeds up slowly with pedaling.");
    }
}

