package com.company3;

public class InterfacesInJava {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.slowdown(11f);
        b1.speedup(10f);
        b1.blowHorn();
        b1.pressBrake();
        System.out.println("\n"+b1.a);

        Bike2 B1=new Bike2();
        //B1.a=50;  //  You cannot modify the properties in Interfaces as they are final
        B1.CheckProperty(); // B1.a
        B1.ABS();
        B1.slowdown(2);
        B1.exampleOfInterfaceDefaultMethod();
        B1.HeadLight();
       /*..................Polymorphism.................*/
        Light L=new Bike2();
        L.HeadLight();
       // L.blowHorn();   ///// will throw error--> Polymorphism
        //L.CheckProperty();  ///// will throw error--> Polymorphism
    }
}
interface move{
    int a=30;
    void speedup(float f);
    void slowdown(float f);

    private void exampleOfInterfacePrivateMethod(){
        System.out.println("Private method implemented: interface private method is used to use that with in the interface");
    }
    default void exampleOfInterfaceDefaultMethod(){
        System.out.println("No need to override InterfaceDefault method and you also can override if needed");
        exampleOfInterfacePrivateMethod();
    }


}
interface manualControl extends Light{  //// Inheritance of interface
    void blowHorn();
    void pressBrake();
}
interface Light {
    void HeadLight();
//    void BackLight();
//    void SideLight();
}
class Bike implements move,manualControl{
    //int a=45;
    // all the methods of interface must be implemented
    // otherwise have to declare the class as an Abstract one
    @Override
    public void speedup(float f) {   // implementation of interface methods must br public
        System.out.printf("speeding up by %f km/hr^2 \n", f);
    }
    @Override
    public void slowdown(float f){
        System.out.printf("slowing down by %f km/hr^2 \n",f);
        }

    @Override
    public void blowHorn() {
        System.out.printf(" PO PO PO !!!PO POOOO!!! PO! PO  \n");
    }

    @Override
    public void pressBrake() {
        System.out.printf("Manual breaking enabled\n");
    }

    void ABS(){
        System.out.println("Advance breaking system implemented");
    }

    @Override
    public void HeadLight() {
        System.out.println("Headlight is on"); // This class must have to implement
        // all grandparent intefaceMethods or have to declare Abstract
    }
}
class Bike2 extends Bike implements move{
    int a=60;  //You can modify the properties in Interfaces with in the class where it implements
    // but can't in another class from where you calling it
    void CheckProperty(){
        System.out.println(a);
    }

    @Override
    public void slowdown(float f) {
        System.out.println("Bike 2 getting slowed down");
    }

}


