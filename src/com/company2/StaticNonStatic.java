package com.company2;

public class StaticNonStatic {
    public static void main(String[] args) {
        Secondary2 s2=new Secondary2();
        s2.meth();
    }
}
class Secondary1 {
   //static
   void meth(){
        int x=2;
        System.out.println("Hello sourav"+x);
    }

}
class Secondary2 extends Secondary1{
      void meth(){
        int x=2;
        System.out.println("Hello Ghosh"+x);
    }

}
