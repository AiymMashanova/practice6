public class Person{
    private String name;
    private String country;
    private int age;

    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public Person(String name, String country, int age){
        this.name = name;
        this.country = country;
        this.age = age;
    }
}

