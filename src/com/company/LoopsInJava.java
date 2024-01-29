package com.company;

public class LoopsInJava {
    public static void main(String[] args) {
        int i=1,j=1;
       /* do {
            System.out.println("DoWhile"+i);
            i++;
        } while(i<4);
        System.out.println(i);
*/
        while(i<8){
            System.out.println("while loop"+i);
            i++;
            if(i==5) {
                break;
            }
        }
        System.out.println(i);

        for(i=2;i<=5;i++){
            System.out.println("For loop"+j);
        }

    }
}
