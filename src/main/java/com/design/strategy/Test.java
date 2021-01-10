package com.design.strategy;

public class Test {
    public static void main(String[] args) {
        Context context;
        System.out.println(" 1111111111111 ");
        context = new Context(new Strategy1());
        context.operate();
        //
        System.out.println(" 2222222222222 ");
        context = new Context(new Strategy2());
        context.operate();
        //
        System.out.println(" 3333333333333 ");
        context = new Context(new Strategy3());
        context.operate();


    }
}
