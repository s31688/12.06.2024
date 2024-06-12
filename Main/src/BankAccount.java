import java.util.ArrayList;

interface AccountOperations {
    void checkAccountStatus();

    void makeTransfer(double amount, BankAccount bankAccount);

    void makePayment(Transaction transaction);
}

public class BankAccount implements AccountOperations {
    private double accountStatus = 0;
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(double accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAccountStatus() {
        return this.accountStatus;
    }

    public void setTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    @Override
    public void checkAccountStatus() {
        System.out.println("Checking Account: " + this.getClass().getName() + " Status: " + this.accountStatus);
    }

    @Override
    public void makeTransfer(double amount, BankAccount bankAccount) {
        try {
            if (amount > this.accountStatus) {
                throw new AccountOperationException("There's not enough money");
            }
            this.accountStatus -= amount;
            Transaction transaction = new Transaction(amount, this, bankAccount);
            transactions.add(transaction);
            bankAccount.accountStatus += amount;
            bankAccount.setTransaction(transaction);
        } catch (AccountOperationException e) {
            e.getStackTrace();
        }
    }

    public boolean checkTransaction(Transaction transaction) {
        return this.transactions.contains(transaction);
    }

    @Override
    public void makePayment(Transaction transaction) {
        if (transaction.getOut() != null && transaction.getOut().checkTransaction(transaction)) {
            this.accountStatus += transaction.getAmount();
            this.transactions.add(transaction);
        } else {
            throw new IllegalArgumentException("There's no such transaction");
        }
    }
}