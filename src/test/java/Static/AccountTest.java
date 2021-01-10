package Static;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();
        Account a1 = new Account("123",30000);
        System.out.println("a = " + a);
        System.out.println("a1 = " + a1);
        Account.setInterestRate(0.012);
        Account.setMinMoney(10);


        System.out.println(Account.getInterestRate());
        
        
    }
}
