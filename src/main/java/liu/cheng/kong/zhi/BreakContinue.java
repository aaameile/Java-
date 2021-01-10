package liu.cheng.kong.zhi;
/*
break: 结束当前循环


continue: 结束当次循环

 */
public class BreakContinue {
    public static void main(String args[]){
        for (int i = 1;i <= 10;i++){
            if (i % 4 == 0){
                break;//123
                //continue;//123567910
            }
            System.out.print(i + " ");
        }
        System.out.println();

        //*************************************
        lable:for (int i = 1;i <= 4;i++){
            for (int j = 1;j <= 10;j++){
                    if (j % 4 == 0){
                        //System.out.println("j = " + j);
                        //break;//123 x 4
                        //continue;//123567910 x 4
                        //break lable;//123 x 4
                        continue lable;
                    }
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
