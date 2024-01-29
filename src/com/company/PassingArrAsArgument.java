package com.company;

public class PassingArrAsArgument {
    public static void main(String[] args) {
        int[] marks={2,5,7};
        int x=3;
        System.out.println("before change integer,array ="+x+","+marks[0]);
        // integer value in main will unchanged where array will be changed
        change(marks);
        change1(x);
        System.out.println("after change integer,array ="+x+","+marks[0]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


    }

    private static void change1(int a) {
        a=10;
        System.out.println(" integer x is changed to:"+a+"from 3" );
    }

    static void change(int[] Array){
        Array[0]=10;
        System.out.println("first box of array is changed to 10 from 2");

    }
}
