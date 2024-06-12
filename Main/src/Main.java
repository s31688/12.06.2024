public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Adam", "Smith");
        Employee employee1 = new Employee("John", "Johnson");
        Employee employee2 = new Employee("Jane", "Jones");

        Client client1 = new Client("Alexander", "Bell");
        BankAccount bankAccount1 = new BankAccount(0);
        client1.setBankAccount(bankAccount1);

        Client client2 = new Client("Bob", "Boson");
        BankAccount bankAccount2 = new BankAccount(45000);
        client2.setBankAccount(bankAccount2);

        Client client3 = new Client("Jasemin", "Richard");
        BankAccount bankAccount3 = new BankAccount(4578.45);
        client3.setBankAccount(bankAccount3);

        Client client4 = new Client("Adam", "White");
        BankAccount bankAccount4 = new BankAccount(49590.35);
        client4.setBankAccount(bankAccount4);

        bankAccount1.makeTransfer(456.45, bankAccount2);
        bankAccount2.makeTransfer(4054.45, bankAccount3);
        bankAccount3.makeTransfer(1230.45, bankAccount4);
        bankAccount4.makeTransfer(45.45, bankAccount1);

        bankAccount1.checkAccountStatus();
        bankAccount2.checkAccountStatus();
        bankAccount3.checkAccountStatus();
        bankAccount4.checkAccountStatus();

        Transaction transaction1 = new Transaction(45.45, bankAccount1, bankAccount2);

        bankAccount1.setTransaction(transaction1);

        bankAccount1.makePayment(transaction1);
    }
}