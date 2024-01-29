package com.company3;

public class Constructor2 {
    public static void main(String[] args) {
        Student s1=new Student(17,10,03,"Sourav","Kanakpur");
        Student s2=new Student(16,10,02,"Abhishek","Kanakpur");
        Student s3=new Student(16,10,01,"Divyendu","Sadipur");

        System.out.printf("Here is the details of first student: name= %s, age= %d, standard=%d, roll= %d, address= %s  \n"  , s1.name,s1.age,s1.standard,s1.roll,s1.add);
        System.out.printf("Here is the details of second student: name= %s, age= %d, standard=%d, roll= %d, address= %s  \n"  , s2.name,s2.age,s2.standard,s2.roll,s2.add);
        System.out.printf("Here is the details of third student: name= %s, age= %d, standard=%d, roll= %d, address= %s", s3.name,s3.age,s3.standard,s3.roll,s3.add);

    }
}
class Student{
    int age,standard,roll;
    String name,add;
    Student(int age,int standard,int roll,String name,String add){
        this.age=age;
        this.standard=standard;
        this.roll=roll;
        this.name=name;
        this.add=add;
    }
}