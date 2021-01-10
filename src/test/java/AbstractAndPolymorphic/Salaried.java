package AbstractAndPolymorphic;

public class Salaried extends Employee {
    private double monthlySalary;//月工资

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Salaried(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }


    public Salaried(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earning() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "" +
                "monthlySalary=" + super.toString() +
                '}';
    }
}
