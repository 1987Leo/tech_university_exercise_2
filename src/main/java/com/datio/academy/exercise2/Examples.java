package com.datio.academy.exercise2;

public class Examples {
    protected CalcExtended calcExtended = new CalcExtended();

    public int methodToTest_1(int a, int b){
        return calcExtended.add(a, b);
    }

    public int methodToTest_2(int a, int b){
        return calcExtended.minus(a, b);
    }
}
