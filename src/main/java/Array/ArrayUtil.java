package Array;
/*
Arrays ---操作数组工具类
 */

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] a = new int[]{2,3,4};
        int[] b = new int[]{2,4,3};

       // boolean equals (int[] a,int[] b)判断数组是否相等
        boolean isEquals = Arrays.equals(a , b);//false
        System.out.println("isEquals = " + isEquals);
        
        //String toString (int [] a):输出数组信息
        System.out.println(Arrays.toString(a));//[2,3,4]
        
        //void fill(int[] a,int val)将指定元素填充到数组中
        Arrays.fill(a,10);//[10,10,10]
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

        //void sort (int[] a)对数组排序
        Arrays.sort(b);//[2,3,4]
        System.out.println(Arrays.toString(b));

        //int binarySearch(int[] a,int key)二分查找数组必须有序
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(arr,9);
        System.out.println(index);


    }
}
