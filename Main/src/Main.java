public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Adam", "Smith");
        Employee employee1 = new Employee("John", "Johnson");
        Employee employee2 = new Employee("Jane", "Jones");
        Client client1 = new Client("Alexander", "Bell");
        BankAccount bankAccount1 = new BankAccount(0);
        Client client2 = new Client("Bob", "Boson");
        BankAccount bankAccount2 = new BankAccount(45000);
        Client client3 = new Client("Jasemin", "Richard");
        BankAccount bankAccount3 = new BankAccount(4578);
        Client client4 = new Client("Adam", "White");
        BankAccount bankAccount4 = new BankAccount(49590.34);
    }
}