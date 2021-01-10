package Array;
/*
二维数组
一维数组的元素为数组就叫二维数组，没有多维数组

二维数组的使用
1 声明初始化
2 调用指定位置的元素
3 获取长度
4 遍历
5 数组元素默认初始化值
    外层为地址 内层与一维数组初始化相同
    String [][] arr3 = new String[3][];
    外层 null
    内层不可调用 否则空指针因为没赋值
6 数组内存解析


 */
public class Array2 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2};
        int [][] arr1 = new int[][]{{1,2},{1,2,3,4}};
        String [][] arr2 = new String[3][2];//arr2中有3个元素其中每个元素有2个元素
        String [][] arr3 = new String[3][];
        arr3[1] = new String[4];//给arr3的第2个元素分配4个元素
        System.out.println("arr1[0][1] = " + arr1[0][1]);//2
        System.out.println("arr3[1][1] = " + arr3[1][1]);//null
        System.out.println("arr3[0] = " + arr3[0]);//null
        //System.out.println("arr3[0][1] = " + arr3[0][1]);//空指针
        System.out.println("arr1.length = " + arr1.length);//2
        System.out.println("arr1[0].l = " + arr1[1].length);//4
        //遍历
//        for (int i = 0;i < arr1.length;i++){
//            for (int j = 0;j < arr1[i].length;j++){
//                System.out.print(arr1[i][j]);
//            }
//            System.out.println();
//        }
        for (int[] i : arr1) {
            for (int i1 : i) {
                System.out.print(i1);
            }
            System.out.println();
        }
        //默认初始化值
        int[][] arr4 =new int[3][2];
        System.out.println("arr4 = " + arr4);//[[I@74a14482
        System.out.println("arr4[0] = " + arr4[0]);//外层 内层赋的地址值[I@4554617c 一个中括号表示一维数组 I 表示整型 @后为16进制存放的地址
        System.out.println("arr4[0][0] = " + arr4[0][0]);//内层0

        float[][] arr5 = new float[3][2];
        System.out.println("arr5 = " + arr5);//[[F@1540e19d
        System.out.println("arr5[0] = " + arr5[0]);//[F@677327b6
        System.out.println("arr5[0][0] = " + arr5[0][0]);//0.0

        String[][] arr6 =new String[3][2];
        System.out.println("arr6 = " + arr6[0][0]);//null


    }


}
