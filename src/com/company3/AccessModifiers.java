package com.company3;

import java.util.Scanner;

public class AccessModifiers {
    public static void main(String[] args) {
        EmployeeGetterSetter Sourav=new EmployeeGetterSetter();
//        System.out.println("Employee Name is: " +emp.Name);
//        System.out.println("EmployeeId is: " +emp.EmpId);
        System.out.println("Enter Emp Name & Id here, by pressing enter");
        Scanner sc=new Scanner(System.in);
        Sourav.SetName(sc.nextLine());
        Sourav.SetId(sc.nextInt());
        System.out.println("Employee Name is: " +Sourav.GetName());
        System.out.println("EmployeeId is: " +Sourav.GetId());
    }
}
