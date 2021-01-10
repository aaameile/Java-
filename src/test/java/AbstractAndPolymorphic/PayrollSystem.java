package AbstractAndPolymorphic;

import java.util.Calendar;

public class PayrollSystem {
    public static void main(String[] args) {
//        Scanner c = new Scanner(System.in);
//        System.out.println(" 请输入当月月份 ");
//        int month = c.nextInt();
        Calendar c = Calendar.getInstance();//日历
        int month = c.get(Calendar.MARCH);//获取月份 是从0开始记录的

        Employee[] emp = new Employee[2];
        emp[0] = new Salaried("小红",1001,new MyDate(1997,7,5),10000);
        emp[1] = new HourlyEmployee("小张",1002,new MyDate(1997,9,22),60,240);
        for (Employee i : emp){
            if (month + 1 == i.getBirthday().getMonth()){
                double sal = i.earning() + 100;
                System.out.println(" 生日快乐奖励100元 ");
                System.out.println(i);
                System.out.println("工资 = " + sal);
            }


        }
    }
}
