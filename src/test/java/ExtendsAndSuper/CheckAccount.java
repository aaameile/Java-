package ExtendsAndSuper;
//可透支的账户
public class CheckAccount extends Account{
    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    private double overDraft = 5000;//可透支限额
    public CheckAccount(int id, double balance, double annuallnterestRate) {
        super(id, balance, annuallnterestRate);
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() >= amount){//余额足够
            super.withDraw(amount);
        }else if (getBalance() < amount){
            if (overDraft + getBalance() >= amount) {
                overDraft -= (amount - getBalance());
                setBalance(0.0);
                return;
            }
            System.out.println(" 超过可透支限额 ");
        }
    }
}
