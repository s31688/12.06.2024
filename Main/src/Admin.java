import java.util.ArrayList;

public class Admin extends Employee {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public Admin(String name, String surname) {
        super(name, surname);
        this.addEmployee(this);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}