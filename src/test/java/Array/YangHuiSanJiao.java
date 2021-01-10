package Array;

public class YangHuiSanJiao {
    public static void main(String[] args) {
        int[][] YangHui = new int[10][];
        for (int i = 0;i < YangHui.length;i++){
            YangHui[i] = new int[i + 1];
            YangHui[i][0] = YangHui[i][i] = 1;
            //if (i > 1){
                for (int j = 1;j < YangHui[i].length-1;j++){
                    YangHui[i][j] = YangHui[i - 1][j - 1] + YangHui[i - 1][j];
                }
           // }
        }
        for (int[] ints : YangHui) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
}
