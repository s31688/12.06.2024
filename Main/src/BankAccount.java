import java.util.ArrayList;

interface AccountOperations {
    int checkAccountStatus();

    void makeTransfer(int amount, BankAccount bankAccount);

    void makePayment(int amount, BankAccount bankAccount);
}

public class BankAccount implements AccountOperations {
    private int accountStatus = 0;
    private static ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getAccountStatus() {
        return this.accountStatus;
    }

    public void setTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public int checkAccountStatus() {
        return this.accountStatus;
    }

    @Override
    public void makeTransfer(int amount, BankAccount bankAccount) {
        AccountOperationException exception = new AccountOperationException("There arent that many money");
        try {
            accountStatus += amount;
            Transaction transaction = new Transaction(amount, this, bankAccount);
            transactions.add(transaction);
            if (amount > accountStatus) {
                throw exception;
            }
        } catch (AccountOperationException e) {
            e.getStackTrace();
        }
    }

    @Override
    public void makePayment(int amount, BankAccount bankAccount) {
        accountStatus += amount;
        Transaction transaction = new Transaction(amount, this, bankAccount);
        transactions.add(transaction);
    }
}