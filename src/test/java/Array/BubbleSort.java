package Array;

/*
数组冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{42,34,65,34,87,23,-4};
        System.out.println("arr[2] = " + arr[2]);
        for (int i = 0;i < arr.length - 1;i++){

            for (int j = 0;j < arr.length - 1 - i;j++){

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr [j + 1] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.print(i+" ");
            System.out.println("arr = " + arr[2]);
        }
        System.out.println();
        //大到小
        int[] arr2 = new int[]{34,5,22,-98,6,-76,0,-3};

        for (int i = 0;i < arr2.length - 1;i++){

            for (int j = 0;j < arr2.length - 1 - i;j++){

                if (arr2[j] < arr2[j + 1]){
                    int temp = arr2[j + 1];
                    arr2 [j + 1] = arr2[j];
                    arr2[j] = temp;
                }
            }

        }

        for (int i : arr2){
            System.out.print(i+" ");
        }

    }

}
