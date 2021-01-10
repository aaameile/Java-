package Array;
/*
随机数[a - b]范围：
    [a - b]  (int) (Math.random() * (b - a + 1) + a) ;
    [10 - 99] (int) (Math.random() * (99 - 10 + 1) + 10) ;

 */
public class SuijiShu {
    public static void main(String[] args) {
        int[] arr = new int[2];
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int) (Math.random() * (30) + 1);//0-30随机数
            for (int j = 0;j < i; j++){
                if (arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        //最大值
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
        //最小值
        int min = arr[0];
        for (int i = 0;i < arr.length;i++){
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min);
        //求和
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("all = " + sum);
        //平均数
        double avg = sum / arr.length;
        System.out.println("avg = " + avg);
    }
}
