package Constructor;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withDraw(960);
        customer.getAccount().withDraw(2000);
        System.out.println("Customer [" + customer.getFirstName() + customer.getLastName()+ "] has a account: id is " + customer.getAccount().getId()
         + " annuallnterestRate is " + account.getAnnuallnterestRate() *100 + "% balance is " + account.getBalance() );


    }
}
