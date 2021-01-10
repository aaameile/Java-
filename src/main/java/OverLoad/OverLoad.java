package OverLoad;
/*
方法重载 （overload）loading....
    在同一个类中允许存在一个及以上的同名方法只要他们参数个数和参数类型不同即可
    例如 Arrays 中sort()
    两同一不同
        同一个类方法名相同
        参数 列表 类型 个数 不同
    如何判断
        跟方法修饰符 返回值类型 形参变量名 方法体都没关系
    在通过对象调用方法时，如何确定指定某一个方法
        参数列表



 */
public class OverLoad {
    public static void main(String[] args) {
        OverLoad load = new OverLoad();
        load.Sum("2",2);
        load.Sum(1,2);
    }
    //参数类型不同
    public void Sum(int i,int j){
        int s = i+j;
        System.out.println("i + j = " +s );
    }
    public void Sum(String i,String j){
        System.out.println("i + j = " + i + j );
    }
    public void Sum(String i,int j){

    }
    public void Sum(int i,String j){

    }
//  public int Sum(int i,int j){      //不可以
//
//    }
//  public void Sum(String m,String n){


//  private void Sum(String i,String j){

//  }
    public int max(int a,int b){
        return (a > b) ? a : b;
    }
    public double max(double a,double b){
        return (a > b) ? a : b;
    }
    public double max(double a,double b,double c){
        double max = (a > b) ? a : b;

        return (max > c) ? max : c;
    }
}


