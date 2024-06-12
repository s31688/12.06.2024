public class Transaction {
    private double amount;
    private BankAccount in;
    private BankAccount out;

    public Transaction(double amount, BankAccount in, BankAccount out) {
        this.amount = amount;
        this.in = in;
        this.out = out;
    }

    public double getAmount() {
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