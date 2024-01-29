package com.company3;

public class OverRiding {
    public static void main(String[] args) {
        C c=new C();
        c.m1(10);

    }
}

class P{
    int a=10;
    void m1(int i){
        System.out.println(" This is m1 method of Parent Class"+ a);
    }
}
class C extends P{
    int a=11;
    void m1(int i){
        System.out.println(" This is m1 method of Child Class"+ a);
    }
}

