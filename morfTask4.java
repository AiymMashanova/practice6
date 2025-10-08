public class morfTask4 {
    public static void main(String[] args) {
        Employee0 e1 = new Manager();
        Employee0 e2 = new Programmer();

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}

class Employee0{
    public double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee0 {
    public double calculateSalary() {
        return 5000 + 2000;
    }
}

class Programmer extends Employee0 {
    public double calculateSalary() {
        return 4000 + 1000;
    }
}

