package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        //int[] marks;
        // marks= new int[5];
        //int[] marks= new int[5];
//        marks[0]= 4;
//        marks[1]= 5;
//        marks[2]=6 ;
//        marks[3]= 7;
//        marks[4]= 8;
        // marks[5]= 9;
//       int[] marks={1,2,3,4,5,6,7};
//        for(int i=0;i<=4;i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println(marks.length);
//        for(int element: marks){
//            System.out.println(element);
//        }

        /* ******* Create the following matrix structure by taking the elements from the screen************ */
        /*
                  1    2    3    4
                  5    6    7    8
                  9    10   11   12
         */
        int[][] Arr2d = new int[3][4];
        // int[] Arr1d=new int[3];
        int[] Arr1d = {1, 2, 4};
        int a = 1, b = 1;
        a = Arr2d.length;
        b = Arr1d.length;


        System.out.println(a);
        System.out.println(b);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Enter matrix value %d,%d \n", i, j);
                Scanner sc = new Scanner(System.in);
                Arr2d[i][j] = sc.nextInt();
            }
       }
        // Printing Array//

//        for( int k=0;k<3;k++){
//            for( int j=0;j<4;j++){
//                System.out.print(Arr2d[k][j]+ "     ")  ;
//            }
//            System.out.println();
//
//        }

            /*   Printing using For each loop    */
            for (int element : Arr1d) {
                System.out.println(Arrays.toString(Arr1d));
            }
        System.out.println("here"+Arrays.toString(Arr1d));
        System.out.println("here"+Arr1d);

        }
    }




