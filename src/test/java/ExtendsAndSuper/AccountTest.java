package ExtendsAndSuper;

public class AccountTest {
    public static void main(String[] args) {
        Account count = new Account(1122,20000,4.5);
        count.withDraw(30000);
        count.withDraw(2500);
        count.deposit(3000);
        System.out.println(" 当前月利率为 " + count.getAnnuallnterest() + "%");

        CheckAccount check = new CheckAccount(1122,20000,4.5);
        check.withDraw(5000);
        System.out.println("账户余额为" + check.getBalance() + "可透支额度为" + check.getOverDraft());
        check.withDraw(18000);
        System.out.println("账户余额为" + check.getBalance() + "可透支额度为" + check.getOverDraft());
        check.withDraw(3000);
        System.out.println("账户余额为" + check.getBalance() + "可透支额度为" + check.getOverDraft());
        
    }
}
