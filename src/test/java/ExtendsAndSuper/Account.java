package ExtendsAndSuper;

public class Account {
    private int id;//账号
    private double balance;//余额
    private double annuallnterestRate;//月利率

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    //返回月利率
    public double getAnnuallnterest (){
        return annuallnterestRate / 12;
    }

    //取款
    public void withDraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(" 取款成功 ");
            return;
        }
        System.out.println(" 余额不足 你当前余额为" + balance);
    }

    //存款
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(" 存款成功 您当前余额为" + balance);
            return;
        }
        System.out.println(" 存款失败 请确认存款数目大于0元人民币 ");

    }
}
