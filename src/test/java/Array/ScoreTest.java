package Array;

import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 请输入学生个数");
        int stu = scan.nextInt();
        int[] score = new int[stu];
        System.out.println(" 请输入"+ stu +"个学生分数 ");

        for (int i = 0;i < score.length;i++){
            //for (int i : score){
            score[i] = scan.nextInt();
    }
    int maxScore = 0;
        for (int value : score) {
            //for (int i : score) {
            if (value > maxScore) {
                maxScore = value;
            }
        }
        System.out.println("最高分为 " + maxScore);
    char level;
        for (int i = 0; i < score.length;i++){
        if (maxScore - score[i] <= 10){
            level = 'A';
        }else if (maxScore - score[i] <= 20){
            level = 'B';
        }else if (maxScore - score[i] <= 30){
            level = 'C';
        }else {
            level = 'D';
        }
        System.out.println("学生" + i +"成绩为"+ score[i] + "等级为" + level);
    }



}
}
