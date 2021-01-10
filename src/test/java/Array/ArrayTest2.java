package Array;
/*
数组复制 反转 查找（线性 二分法）
 */
public class ArrayTest2 {
    public static void main(String[] args){
        String[] arr1 = new  String[]{"as","sd","ds","sa"};
        //复制操作
        String[] arr2 = new String[arr1.length];
        for (int i = 0;i < arr2.length;i++){
            arr2[i] = arr1[i];
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
//        //反转
        for (int i = 0;i < arr2.length / 2;i++){
            String temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 -i];
            arr2[arr2.length - i -1] = temp;
        }
        for (String i : arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        //线性查找
        String dest = "sa";
        boolean flag = true;
        for (int i = 0;i < arr2.length;i++){
            if (dest.equals(arr1[i])){
                System.out.println("找到了指定元素索引为"+i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(" 没找到 ");
        }
        //二分法--数组有序推荐二分法查找
        int[] arr3 = new int[]{1,1,3,4,5,6,7};
        int dest1 =7;
        int head = 0;
        int end = arr3.length - 1;
        boolean flag1 = true;
        while (head <= end){
            int middle = (head + end) / 2;
            if (dest1 == arr3[middle]){
                System.out.println("找到了指定元素索引为"+middle);
                flag1 = false;
                break;
            }else if (dest1 < arr3[middle]){
                end = middle - 1;
            }else {
                head =middle + 1;
            }
        }
        if (flag1){
            System.out.println(" 没找到 ");
        }
        //
        int fist = 0;
        int last = arr3.length-1 ;
        int dest2 = 1;
        while (fist <= last){
            int middle = (fist + last) / 2;
            if (dest2 == arr3[middle]){
                System.out.println("找到指定元素索引为" + middle);
                break;
            }else if (dest2 > middle){
                fist = middle + 1;
            }else {
                last = middle - 1;
            }
        }
        if (fist > last){
            System.out.println(" 没找到 ");
        }





    }
}
