package Method;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for (int i = 0;i < stu.length;i++){
            stu[i] = new Student();//给每个数组元素new一个对象
            stu[i].num = i + 1;
            stu[i].state = (int) (Math.random() * 6 + 1);
            stu[i].score = (int) (Math.random() * 101);
        }
        for (Student i: stu){
            //System.out.println("i = " + i.num + i.state + i.score);
            System.out.println(i.info());
        }
        System.out.println();
        for (Student s : stu) {
            if (s.state == 3) {
                System.out.println(s.info());
            }
        }
        System.out.println();
        for (int i = 0;i < stu.length - 1;i++){
            for (int j = 0;j < stu.length - 1 -i;j++){
                if (stu[j].score > stu[j + 1].score){
                    //对象数组交换的是对象
                    Student temp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = temp;
                }
            }
        }
        for (Student s : stu){
            System.out.println(s.info());
        }

    }
}
