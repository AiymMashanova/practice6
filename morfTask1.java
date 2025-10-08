public class morfTask1 {
    public static void main(String[] args) {
        Animal a1 = new Bird();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("Some animal sound");
    }
}

class Bird extends Animal {
    public void sound() {
        System.out.println("Chirp chirp!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow!");
    }
}

