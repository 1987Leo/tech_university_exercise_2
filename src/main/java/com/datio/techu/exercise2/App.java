package com.datio.techu.exercise2;

public class App {

    protected static Examples e = new Examples();

    public static void main(String[] args){
        System.out.println("Hello world!");
        System.out.println(e.methodToTest_1(5, 5) + " - " + e.methodToTest_2(20, 10));
    }

}
