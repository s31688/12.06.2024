import java.util.ArrayList;

public class Employee extends User {
    private static int counter = 0;
    private String ID;
    private static ArrayList<Client> clients = new ArrayList<>();

    public Employee(String name, String surname) {
        super(name, surname);
        this.ID = this.getClass().getName() + "#" + ++counter;
    }

    public Employee(String name, String surname, Client client) {
        super(name, surname);
        this.ID = this.getClass().getName() + "#" + ++counter;
        clients.add(client);
    }

    public String getID() {
        return this.ID;
    }

    public void addTransaction(Client client, Transaction transaction) {
        client.getBankAccount().setTransaction(transaction);
    }
}