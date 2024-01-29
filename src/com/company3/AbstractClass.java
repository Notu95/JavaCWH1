package com.company3;

public class AbstractClass {
    public static void main(String[] args) {

        Child1_Abstract c1a= new Child1_Abstract();
        c1a.morningGreet();
        c1a.eveningGreet();

       // Child2_Abstract c2a= new Child2_Abstract();  // Child2_Abstract' is abstract; cannot be instantiated
        //abstract class can not have any object
    }
}
abstract class Parent_Abstract {
    abstract void morningGreet();  /*Abstract method can not have a body*/
    abstract void eveningGreet();
    void generalGreet(){};
}
class Child1_Abstract extends Parent_Abstract{
    // Class 'Child1_Abstract' must either be declared abstract or implement abstract method 'morningGreet()' in 'Parent_Abstract'

    @Override
    void morningGreet() {
        System.out.println(" Good Morning Sourav:  (from Child1_Abstract )");
    }

    @Override
    void eveningGreet() {
        System.out.println(" Good Evening Sourav:  (from Child1_Abstract )");
    }
}
abstract class Child2_Abstract extends Parent_Abstract{
    @Override  // Class 'Child2_Abstract' must either be declared abstract or implement abstract method 'eveningGreet()' in 'Parent_Abstract'
    void morningGreet() {
        System.out.println(" Good Morning Sourav:  (from Child2_Abstract )");
    }
}