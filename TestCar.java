class Car {
    private double mileage;
    private String company_name;
    private String model_name;
    private int year;

    public int getYear() {
        return year;
    }
    public String getModel_name() {
        return model_name;
    }
    public String getCompany_name() {
        return company_name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public Car(String company_name, String model_name, int year, double mileage){
        this.company_name =company_name;
        this.model_name =model_name;
        this.year = year;
        this.mileage = mileage;
    }
}
public class TestCar{
    public static void main(String[] args){
        Car c1 = new Car("Motor", "Porshe", 1986, 250);
        System.out.println(c1.getCompany_name()+", "+ c1.getModel_name()+", "+ c1.getMileage()+", "+ c1.getYear());
    }
}
