package com.design.singleton;

public class TestSingleTon {
    public static void main(String[] args) {
        Single s = Single.SINGLE;
        Single s1 = Single.SINGLE;
        System.out.println(s1 == s);
        //Single single = Single.getInstance();
        //Single single1= Single.getInstance();
        //System.out.println("single = " + single);
        //System.out.println("single1 = " + single1);
    }
}
