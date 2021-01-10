package Array;
/*
数组中常见异常
1 索引越界 ArrayIndexOutOfBoundsException: 6
2 空指针 NullPointerException
 */
public class ArrayException {
    public static void main(String[] args) {
        //1 索引越界
//        int[] a = new int[]{1,2,3};
//        System.out.println(a[6]);
        //2空指针
        int[][] a = new int[12][];
        System.out.println("a = " + a[2][0]);

    }
}
