package Array;

/*
1.Array：多个相同类型数据按照顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据统一管理；
2.数组名
  元素
  下标（索引）
  数组长度（元素个数）
  
3.数组是有序排列的 
4.类 接口 数组 是引用数据类型 数组元素可以是基本数据类型也可以是引用数据类型（对象数组）
5.创建数组对象是在内存中开辟一块连续的存储空间
6.数组长度确定就不能更改

分类 
1 按照维数: 一维数组 二维数组
2 按照数组元素类型:基本数据类型  引用数据类型

一维数组的使用
1 声明初始化  
2 调用指定位置的元素  
3 获取长度 
4 遍历 
5 数组元素默认初始化值 
6 数组内存解析
 */
public class Array {
    public static void main(String[] args) {
        //声明 初始化
        int [] id;
        //静态初始化:初始化元素赋值操作同时进行
        id = new int []{1,2,4,3};
        int[] arr6 = {1,2,3};
        //动态初始化：初始化元素赋值操作分开进行
        String[] name = new String[4];
        //调用指定位置的元素：通过索引的方式
        name[1] = "哈哈";
        name[2] = "sss";
        name[3] = "sda";
        name[0] = "eqw";
        System.out.println("name.length = " + name.length);

        //遍历
        for (int i = 0;i < name.length;i++){
            System.out.println("i = " + name[i]);
        }
        for (String names : name){
            System.out.println("name = " + names);
        }

        //数组默认初始化值
        int[] arr1 = new int[3];//0
        float[] arr2 = new float[3];//0.0
        short[] arr3 = new short[3];//0
        char[] arr4 = new char[3];//0或者空格
        boolean[] arr5 = new boolean[3];//false
//        for (int j = 0;j < arr2.length;j++){
//            System.out.println("arr1 = " + arr2[j]);
//        }
        for (int i : arr1){
            System.out.println("i = " + i);
        }
        for (float f : arr2){
            System.out.println("f = " + f);
        }
        for (short s : arr3){
            System.out.println("s = " + s);
        }
        for (char c : arr4){
            System.out.println("c = " + c);
        }
        String [] arr7 = new String[3];//null
        for (String s : arr7){
            System.out.println("s = " + s);
        }
        //数组内存解析






        
        
        
        
        
        

        
        
        
        
    }
    
}
