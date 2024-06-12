import java.util.ArrayList;

public class Admin extends User {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static ArrayList<Client> clients = new ArrayList<>();

    public Admin(String name, String surname) {
        super(name, surname);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public void addTransaction(Client client, Transaction transaction) {
        client.getBankAccount().setTransaction(transaction);
    }
}