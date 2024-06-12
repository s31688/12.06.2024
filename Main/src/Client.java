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

    public String getID() {
        return this.ID;
    }

    public void makeOperation(String operation, int amount, BankAccount bankAccount) {
        if (operation.equals("checkAccountStatus")) {
            this.bankAccount.checkAccountStatus();
        } else if (operation.equals("makeTransfer")) {
            this.bankAccount.makeTransfer(amount, bankAccount);
        } else {
            this.bankAccount.makePayment(amount, bankAccount);
        }
    }
}