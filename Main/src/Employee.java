import java.util.ArrayList;

public class Employee extends Client {
    private static int counter = 0;
    private String ID;
    protected static ArrayList<Client> clients = new ArrayList<>();
    protected static ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public Employee(String name, String surname) {
        super(name, surname);
        this.ID = this.getClass().getName() + "#" + ++counter;
        this.addClient(this);
    }

    public String getID() {
        return this.ID;
    }

    public void addClient(Client client) {
        client.setBankAccount(new BankAccount(0));
        bankAccounts.add(client.getBankAccount());
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }
}