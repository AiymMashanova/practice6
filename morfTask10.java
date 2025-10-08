public class morfTask10 {
    public static void main(String[] args) {
        Animal3 a1 = new Lion();
        Animal3 a2 = new Tiger();
        Animal3 a3 = new Panther();

        a1.eat(); a1.sound();
        a2.eat(); a2.sound();
        a3.eat(); a3.sound();
    }
}

class Animal3 {
    public void eat() {}
    public void sound() {}
}

class Lion extends Animal3 {
    public void eat() {
        System.out.println("Lion eats meat.");
    }
    public void sound() {
        System.out.println("Roar!");
    }
}

class Tiger extends Animal3 {
    public void eat() {
        System.out.println("Tiger eats large prey.");
    }
    public void sound() {
        System.out.println("Grrr!");
    }
}

class Panther extends Animal3 {
    public void eat() {
        System.out.println("Panther eats smaller animals.");
    }
    public void sound() {
        System.out.println("Growl!");
    }
}
