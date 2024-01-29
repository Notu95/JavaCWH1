package com.company;

public class DecessionMakingIfElseSwitch {
    public static void main(String[] args) {
        int marks=65;
        DecessionMakingIfElseSwitch E =new DecessionMakingIfElseSwitch();

        String[] arr = E.grade1(marks);
        System.out.println("Your grade is "+ arr[0]);
        System.out.println("Your status is "+ arr[1]);

    }
    /*  Marks Gradation System
     *
     */
//	String grade(int x) {
//		String grade="E";
//		String status="Fail";
//
//		if(x>=90) {
//		grade="A";
//		status="Pass";
//		}
//		else if(x>=80) {
//			grade="B";
//			status="Pass";
//			}
//		else if(x>=70) {
//			grade="C";
//			status="Pass";
//			}
//		else if(x>=60) {
//			grade="D";
//			status="Pass";
//			}
//		else if(x>=50) {
//			grade="D";
//			status="Fail";
//			}
//		String grade1=String.valueOf(grade);
//
//		//String grade1 =(String)grade;
//		return status,grade;
//		}
           /* ###########returning more than one ATTRIBUTE ############*/

    String[] grade1(int x) {
        String grade="F";
        String status="Fail";
        switch(x/10) {
            case(9):
            {grade="A";
                status= "Pass";
                break;
            }
            case(8):
            {grade="B";
                status= "Pass";
                break;
            }
            case(7):
            {grade="C";
                status= "Pass";
                break;
            }
            case(6):
            {grade="D";
                status= "Pass";
                break;
            }
            case(5):
            {grade="E";
                status= "Pass";
                break;
            }
        }

        String[] arr= {grade,status};
        return arr;
    }

}
