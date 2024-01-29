package com.company;

import java.util.Arrays;

public class Rough {

    public static void main(String[] args) {
        int[] marks={1,3,5};
        for(int element:marks) {
            System.out.println(element);
        }
        System.out.println(Arrays.toString(marks));
        System.out.println(marks);
    }
}