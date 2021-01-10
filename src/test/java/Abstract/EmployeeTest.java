package Abstract;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee m = new Manage("小明",1001,5000,50000);
        m.work();
        Employee e = new CommonEmployee("小红",01,3000);
        e.work();

    }
}
