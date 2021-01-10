package AbstractAndPolymorphic;
//按小时计算工资
public class HourlyEmployee extends Employee{
    private int hour;//月工作的小时数
    private int wage;//单位小时工资

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int hour, int wage) {
        super(name, number, birthday);
        this.hour = hour;
        this.wage = wage;
    }

    public HourlyEmployee(int hour, int wage) {
        this.hour = hour;
        this.wage = wage;
    }

    @Override
    public double earning() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee=" +
                super.toString()+
                '}';
    }
}
