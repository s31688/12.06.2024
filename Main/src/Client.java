public class Client extends User {
    private BankAccount bankAccount;
    private static int counter;
    private String ID;

    public Client(String name, String surname) {
        super(name, surname);
        this.ID = this.getClass().getName() + "#" + ++counter;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public String getID() {
        return this.ID;
    }
}