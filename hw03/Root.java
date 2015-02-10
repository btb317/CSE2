//Braeden Benedix
//HW03
//Root
//CSE002
//Prof Chen

/*
Estimates the cube root of user input.  Outputs estimate and cube of estimate.
*/

import java.util.Scanner;

public class Root {
    
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //Input
        System.out.print("Enter a double to receive an estimate of its cube root: ");
        double xValue = myScanner.nextDouble();
        
        //Calculations
            //guessing algorithm repeats 5 times after first operation
        double guess = xValue / 3;
        guess = (2*guess*guess*guess+xValue)/(3*guess*guess);
        guess = (2*guess*guess*guess+xValue)/(3*guess*guess);
        guess = (2*guess*guess*guess+xValue)/(3*guess*guess);
        guess = (2*guess*guess*guess+xValue)/(3*guess*guess);
        guess = (2*guess*guess*guess+xValue)/(3*guess*guess);
        
        //Output
        System.out.println("The cube root is "+guess);
        System.out.println(guess+"*"+guess+"*"+guess+" = ");
        System.out.println(guess*guess*guess);
    }
}