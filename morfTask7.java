public class morfTask7{
    public static void main(String[] args) {
        Animal2 a1 = new Bird2();
        Animal2 a2 = new Panthera();

        a1.move();
        a1.makeSound();

        a2.move();
        a2.makeSound();
    }
}

class Animal2 {
    public void move() {}
    public void makeSound() {}
}

class Bird2 extends Animal2 {
    public void move() {
        System.out.println("Bird flies.");
    }
    public void makeSound() {
        System.out.println("Tweet!");
    }
}

class Panthera extends Animal2 {
    public void move() {
        System.out.println("Panthera prowls silently.");
    }
    public void makeSound() {
        System.out.println("Roar!");
    }
}

