package com.company;

public class Varags {
    public static void main(String[] args) {
        int a=2,b=3,c=5,d=9;
        add();
        add(a);
        add(a,b,c,d);
       // add1();   ///atleast one value must have to pass
        add1(a);
        add1(a,b,c);
    }
    public static void add(int ...arr){  // public static void add(int ...x){
        int result=0;
        for(int element:arr){  //  for(int y:arr){
            result+=element;
        }
        System.out.println(result);

    }
    public static void add1(int x,int ...arr){
        int result=0;
        for(int element:arr){  //  for(int y:arr){
            result+=element;
        }
        System.out.println(result+x);
    }
}
