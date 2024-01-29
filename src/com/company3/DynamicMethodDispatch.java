package com.company3;

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Phone_Parent m1 = new SmartPhone_Child();

        m1.on();
        m1.playSnake();
       // m1.playCallOfDuty();  /* This is not Allowed */

    }
}
class Phone_Parent{
    void on(){
        System.out.println("Switching on the Nokia 1100");
    }
    void playSnake(){
        System.out.println("You are playing Snake on Nokia 1100");
    }

}
class SmartPhone_Child extends Phone_Parent{
    void on(){
        System.out.println("Switching on the Samsung A33");
    }
    void playCallOfDuty(){
        System.out.println("You are playing Cal Of Duty on Samsung A33");
    }
}