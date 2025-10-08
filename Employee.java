public class Employee {
    private int employee_id;
    private String empolyee_name;
    private double employee_salary;

    public int getEmployee_id(){
        return employee_id;
    }
    public String getEmpolyee_name(){
        return empolyee_name;
    }
    public double getEmployee_salary(){
        return employee_salary;
    }

    public void setEmployee_id(int employee_id){
        this.employee_id = employee_id;
    }
    public void setEmpolyee_name(String empolyee_name){
        this.empolyee_name = empolyee_name;
    }
    public void setEmployee_salary(double salary){
        this.employee_salary = employee_salary;
    }

    public Employee(int employee_id, String empolyee_name, double employee_salary){
        this.employee_id = employee_id;
        this.empolyee_name =empolyee_name;
        this.employee_salary = employee_salary;

    }

    public String getSalaryFormatted(){
        return String.format("Salary: $%.2f", employee_salary);
    }
}

