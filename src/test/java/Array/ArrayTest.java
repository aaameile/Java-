package Array;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr1,arr2;
        arr1 =new int[]{2,3,5,7,11,13,17,19};
        for (int i : arr1){
            System.out.print(i);
        }
        arr2 = arr1;//赋值等于把arr1地址赋值给arr2
        for (int i = 0;i < arr2.length;i++){
            if (i % 2 == 0){
                arr2[i] = i;
            }
        }
        System.out.println();
        for (int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        //数组复制
        arr2 = new int[arr2.length];
        for (int i = 0;i < arr2.length;i++){
            arr2[i] = arr1[i];
            System.out.print(i);

            //System.out.print(arr2[i]+" ");

        }
//        arr2 = new int[arr2.length];
//        System.arraycopy(arr1, 0, arr2, 0, arr2.length);


    }
}
