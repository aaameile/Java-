package Method;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for (int i = 0;i < stu.length;i++){
            stu[i] = new Student();//给每个数组元素new一个对象
            stu[i].num = i + 1;
            stu[i].state = (int) (Math.random() * 6 + 1);
            stu[i].score = (int) (Math.random() * 101);
        }
        //调用方法
        StudentTest2 st = new StudentTest2();
        st.bubbleSort(stu);
        st.Print(stu);
        st.Query(stu,4);
    }



    //遍历
    public void Print(Student[] stu){
        for (Student i: stu){
            //System.out.println("i = " + i.num + i.state + i.score);
            System.out.println(i.info());
        }
        System.out.println();
    }
    //查找
    public void Query(Student[] stu,int state){
        for (Student s : stu) {
            if (s.state == state) {
                System.out.println(s.info());
            }
        }
        System.out.println();
    }
    //冒泡排序
    public void bubbleSort(Student[] stu){
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
