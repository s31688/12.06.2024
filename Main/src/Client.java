public class Client extends User {
    private BankAccount bankAccount;
    private static int counter = 0;
    private String ID;

    public Client(String name, String surname) {
        super(name, surname);
        this.ID = this.getClass().getName() + "#" + ++counter;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getID() {
        return this.ID;
    }

    public void checkAccountStatus() {
        this.bankAccount.checkAccountStatus();
    }

    public void makeTransfer(double amount, BankAccount bankAccount) {
        this.bankAccount.makeTransfer(amount, bankAccount);
    }

    public void makePayment(double amount) {
        this.bankAccount.makePayment(new Transaction(amount, this.bankAccount, null));
    }
}