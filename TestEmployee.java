public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee(1, "John Snow ", 3500.75);
        System.out.println(e.getEmployee_id() + " " + e.getEmpolyee_name() + e.getEmployee_salary());
        System.out.println("String formattted " +e.getSalaryFormatted());
    }
}
