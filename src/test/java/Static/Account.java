package Static;

public class Account {
    private int id;//账号
    private String pwd = "000000";
    private double balance;//余额

    private static double interestRate;//利率
    private static double minMoney;//最少存钱数
    private static int init = 1001;//自动生成id

    public Account(){
        id = init++;
    }

    public Account(String pwd,double balance){
        id = init++;
        this.balance = balance;
        this.pwd = pwd;
    }

    public void setId(){

    }

    public int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}

