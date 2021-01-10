package Constructor.bank;

public class bankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("tom","jerry");
        bank.getCustomers(0).setAccount(new Account(1000));
        bank.getCustomers(0).getAccount().deposit(10000);
        bank.getCustomers(0).getAccount().withDraw(3000);
        System.out.println(bank.getCustomers(0).getFirstName()+ "余额为" + bank.getCustomers(0).getAccount().getBalance());



    }
}
