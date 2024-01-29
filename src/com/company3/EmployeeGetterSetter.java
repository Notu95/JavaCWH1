package com.company3;

import java.util.Scanner;

public class EmployeeGetterSetter {
    private String Name="Enter your name";
    private int EmpId=0000;
/* ******************Taking Input Using Scanner ************** */
//    void TakeInPut() {
//        Scanner sc=new Scanner(System.in);
//        //EmployeeGetterSetter Sourav=new EmployeeGetterSetter();
//        System.out.println("Enter Employee Name and Id by pressing enter button");
//        /*Sourav.*/  EmpId =sc.nextInt();
//        /*Sourav.*/  Name=sc.nextLine();
//
//  }


    void SetName(String n){this.Name=n;} // will also work if you remove this keyword
    void SetId(int n){this.EmpId =n;}
    String GetName(){return Name;}
    int GetId(){return EmpId;}
}
