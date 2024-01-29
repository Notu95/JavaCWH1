package com.company3;

public class ConstructorInheritance {
    public static void main(String[] args) {

//        GrandParent GP=new GrandParent();
//        Parent P=new Parent();
        Child C=new Child();
//        GrandParent GP1=new GrandParent(100);
//        Parent P1=new Parent(101);
//        Child C1=new Child(102);

//        System.out.println();
//        System.out.println();

    }
}
class GrandParent{
    int a=10,b=11;

//    public GrandParent() {System.out.println("It is no argument GrandParent Constructor  "+ a);}
//    public GrandParent(int i) {this.a=i;System.out.println("It is with one argument GrandParent Constructor  "+ a);}
}
class Parent extends GrandParent{
    int c=12,d=13;

//    public Parent() {System.out.println("It is no argument Parent Constructor  "+ c);}
    public Parent(int i) {this.c=i;System.out.println("It is with one  argument Parent Constructor  "+ i);}
}
class Child extends Parent{
    int e=14,f=15;
    //super();

    public Child() {super(1000);System.out.println("It is no argument Child Constructor  "+ e);}
//    public Child(int i) {this.c=i;System.out.println("It is with one  argument Child Constructor  "+ i);}

}
