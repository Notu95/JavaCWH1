package com.company3;


import static java.lang.System.*;

public class JavaConstractor {
    String name="Sourav Ghosh";
    String batchId="0035";
    String year="2023";

    public static void main(String[] args) {

        JavaConstractor jc=new JavaConstractor();
        Employee em= new Employee(jc.name,jc.batchId,jc.year);
        //String EmpId= em.empId;

        System.out.println("your EmpId is:  "+em.empId );
        Employee em1= new Employee(jc.name);
        System.out.println("Your first name is: "+ em1.arrName[0]+ " \n Your last name is: "+em1.arrName[1] );

    }
}
class Employee{
    String empId;
    int index;
    String[] arrName=new String[2];

    public /*String */ Employee(String name, String batchId, String year){
         this.empId= name.substring(0,1)+year.substring(2)+batchId;
         //return empId;
     }


    public Employee(String name)
    {
        this.index=name.indexOf(" ");
        this.arrName[0]= name.substring(0,index);
        this.arrName[1]=name.substring(index+1) ;
        //return arrName;
    }
}


