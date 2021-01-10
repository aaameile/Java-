package com.design.template;
/*
模板模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}
abstract class Template{
    //计算某段代码执行需要多少时间
    public void spendTime(){
        long start = System.currentTimeMillis();//获取当前时间
        code();//不确定的部分
        long end = System.currentTimeMillis();
        System.out.println("花费时间" +(end - start));
    }

    public abstract void code();
}
class SubTemplate extends Template{

    //求1000以内质数
    @Override
    public void code() {
        for (int i = 2; i <= 1000;i++){
            boolean isFlag = true;
            for (int j = 2;j <= Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}
