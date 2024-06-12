public class Transaction {
    private int amount;
    private BankAccount in;
    private BankAccount out;

    public Transaction(int amount, BankAccount in, BankAccount out) {
        this.amount = amount;
        this.in = in;
        this.out = out;
    }

    public int getAmount() {
        return this.amount;
    }

    public BankAccount getIn() {
        return this.in;
    }

    public BankAccount getOut() {
        return this.out;
    }

    public void getInfo() {
        System.out.println(this.in.getClass().getName() + " (" + this.in.getAccountStatus() + ")" + " " +
                this.out.getClass().getName() + " (" + this.out.getAccountStatus() + ")");
    }
}