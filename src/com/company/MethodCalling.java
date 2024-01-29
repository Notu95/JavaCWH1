package com.company;

public class MethodCalling {


    public static void main(String[] args) {
          /*  no return no argument  */
//        areaOfTriangle();
        /*  with return no argument  */
//        double Area =areaOfTriangle2();
//        System.out.println("Area of the triangle(with return no argument) ="+Area);
        /*  no return with argument  */
//        float height=4.0f;
//        float base = 2.0f;
//        areaOfTriangle3(height,base);
        /*  with return with argument  */
        float height=5.0f;
        float base = 2.0f;
        double Area= areaOfTriangle4(height,base);
        System.out.println("Area of the triangle(with return with argument) ="+Area );
    }

    /*  with return with argument  */

    private static double areaOfTriangle4(float height, float base) {
        double Area = (float)(1.0/2.0*base*height);
        return Area;
    }
    /*  no return with argument  */

    private static void areaOfTriangle3(float height, float base) {
        float Area= (float)(1.0/2.0*base*height);
        System.out.println("Area of the triangle(no return with argument) ="+Area);

    }
    /*  with return no argument  */

    private static double areaOfTriangle2() {
        float height=3.0f;
        float base = 2.0f;
        float Area= (float)(1.0/2.0*base*height);
        return Area;

    }
    /*  no return no argument  */

    private static void areaOfTriangle() {
        float height=3.0f;
        float base = 2.0f;
        float Area= (float)(1.0/2.0*base*height);
        System.out.println("Area of the triangle(no return no argument) ="+Area);
    }

}

