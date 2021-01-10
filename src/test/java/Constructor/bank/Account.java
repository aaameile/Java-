package Constructor.bank;

public class Account {
    private double balance;
    public Account(double init_balance){
        this.balance = init_balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println(" 成功存入 " + amt);
        }
    }
    public void withDraw(double amt){
        if (amt > balance){
            System.out.println(" 余额不足 ");
            //return;
        }
        balance -= amt;
        System.out.println(" 成功取出 " + amt);
    }
}
