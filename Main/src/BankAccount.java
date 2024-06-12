import java.util.ArrayList;

interface AccountOperations {
    int checkAccountStatus();

    void makeTransfer(int amount);

    void makePayment(int amount);
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

    @Override
    public int checkAccountStatus() {
        return this.accountStatus;
    }

    @Override
    public void makeTransfer(int amount) {
        AccountOperationException exception = new AccountOperationException("There arent that many money");
        try {
            accountStatus += amount;
            if(amount > accountStatus) {
                throw exception;
            }
        } catch(AccountOperationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makePayment(int amount) {
        accountStatus += amount;
    }
}