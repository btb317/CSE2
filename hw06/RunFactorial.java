//Braeden Benedix
//HW06
//RunFactorial
//CSE002
//Prof Chen

/*
Takes integer input between 9 and 16 inclusive
Uses a while loop to calculate the factorial of the input
*/

import java.util.Scanner;

public class RunFactorial {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        
        //Instructions
        System.out.println("Factorial program:");
        System.out.println("Please enter an integer that is between 9 and 16, inclusive:");
        
        while (true) { //repeats until there is a valid input
            double inputDouble = myScanner.nextDouble();
            int inputInt = (int) inputDouble;
            double inputDiff = inputDouble - (double) inputInt; //tests for integer
            long factorial = 1; //initialize the output product
            
            if (inputDiff != 0) {
                System.out.println("Invalid input: not an integer; enter again:");
            } else if (inputInt < 9 || inputInt > 16) {
                System.out.println("Invalid input: integer outside of range; enter again:");
            } else {
                System.out.println("Input accepted:");
                System.out.print(inputInt+"! = ");
                while (inputInt > 1) {
                    factorial *= inputInt;
                    inputInt--;
                }
                System.out.println(factorial);
                break; //leaves while loop only in the case of a valid input
            }
        }
    }
}