public class Main{
    public static void main(String[] args){
        Person p1 = new Person("Aiym", "Qazaqstan", 18);
        Person p2 = new Person("Togzhan", "USA", 19);
        System.out.println(p1.getAge() + ", " + p1.getCountry() + ", " + p1.getName());
        p1.setAge(19);
        p1.setCountry("South Korea");
        System.out.println(p2.getAge() + ", " + p2.getCountry() + ", " + p2.getName());
        System.out.println(p1.getAge() + ", " + p1.getCountry() + ", " + p1.getName());
    }
}

