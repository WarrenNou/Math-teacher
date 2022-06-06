import java.util.Scanner;
/*
Name:Warren Noubi
        Date: 2/15/2022
        Cse 7 HW3: Math Menu
        Description= Solving math problems.

 */
public class MathMenu {
    public static void main(String[] args) {
// the scanner for the inputs
        Scanner myScan = new Scanner(System.in);
        // userchoice variable
        int  userChoice;
// the random numbers
        int num1 = (int) (Math.random() * 9);
        int num2 = (int)(Math.random() * 9);
        // the mathematical operations
        int addition= num1 + num2;
        int subtraction= num1-num2;
        int multiplication= num1*num2;
        int division= num1 /num2;
        // the results
        int result;
        int Result;
        // the menu
            System.out.println("Welcome To the math program");
            System.out.println("1 - Addition");
            System.out.println("2 - subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("\nEnter your choice");
            userChoice = myScan.nextInt();
            // the condition statements
           switch(userChoice){
               // case when the user selected 1
               case 1: System.out.println(" Enter the result of the addition of " + num1+" + "+ (num2));
                      result= myScan.nextInt();
                      while (result != addition){
                          System.out.println("you are wrong, reenter a solution");
                          result= myScan.nextInt();
                      }
                      System.out.println("congratulation you got the correct  answer");
               break;
               case 2:
                   // Fourth graders do not know negative numbers
                   if(num1<num2) {
                       Result = num2 - num1;
                       System.out.println(" Enter the result of  " + num2 + " - " + (num1));
                       result = myScan.nextInt();

                       while (result != Result) {
                           System.out.println("you are wrong, reenter a solution");
                           result = myScan.nextInt();
                       }
                   }   else{
                       System.out.println(" Enter the result of  " + num1 + " - " + (num2));
                       result= myScan.nextInt();
                       while (result != subtraction){
                           System.out.println("you are wrong, reenter a solution");
                           result= myScan.nextInt();
                   }
                          }
               System.out.println("congratulation you got the correct answer");
               break;
               case 3:System.out.println(" Enter the result of " + num1+" * "+ (num2));
                   result= myScan.nextInt();

                   while (result != multiplication){
                       System.out.println("you are wrong, reenter a solution");
                       result= myScan.nextInt();
                   }
                   System.out.println("congratulation you got the correct  answer");
                   break;
               // they are fourth graders so i assume that they don't know decimal numbers
               case 4:System.out.println(" Enter the result of the division  " + num1+" / "+ (num2));
                   result= myScan.nextInt();
                   while (result != division){
                       System.out.println("you are wrong, reenter a solution");
                       result= myScan.nextInt();
                   }
                   System.out.println("congratulation you got the correct answer");
                   break;

               default: System.out.println("You made a wrong selection");

        }


        }
    }

