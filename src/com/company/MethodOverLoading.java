package com.company;

public class MethodOverLoading {
    public static void main(String[] args) {
        int a=2,b=3,c=40000000;
        double d= 10d;

        foo();
        //foo(a);
        System.out.println("foo returns"+ foo(a) );
        //foo(d);
        System.out.println("foo returns"+ foo(c) );
        foo(a,b,c);

    }

    private static void foo() {
        System.out.println("good morning");
    }
    static int foo(int x){
        System.out.println("good morning to you" + x +"person");
        return ++x;
    }
    static double foo(short x){
        System.out.println("good morning to you" + x +"person");
        double y= (double) ++x;
        return y;
    }
    static void foo(int x,int y,int z){
        System.out.println("good morning to you" + (x+y+z) +"person");
    }

}

