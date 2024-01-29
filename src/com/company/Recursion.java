package com.company;

public class Recursion {
    public static void main(String[] args) {
        int A=6;
        System.out.printf("printing factorial numbers of %d \n",A );
        factorials(A);
        //summationOfFactorials(A);
        System.out.printf("sum of factorial numbers of %d \n",A );
        System.out.println(summationOfFactorials(A));
        System.out.println("factorial of "+A+" is " + factorial(A));

    }
    /*=============printing factorials =============*/
  public static void factorials(int n){
      if(n>0) {
          System.out.println(n);
          factorials(n-1);
      }
    }


    /* =======================Summation of factorials ==========*/
    public static int summationOfFactorials(int n){
        int sum=0;
        if(n>0) {
            sum=n+summationOfFactorials(n-1);
        }
        return sum;

    }

    /*  =================Calculating factorial===================*/
    public static long factorial(int n){
        long mul =1;
        if(n>0){
            mul = n * factorial(n-1);
            System.out.println("testing1:"+ n);

        }
        System.out.println("testing2:"+ n);
        return mul;
    }


}
