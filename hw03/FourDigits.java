//Braeden Benedix
//HW03
//FourDigits
//CSE002
//Prof Chen

/*
Prints the first four digits to the right of the decimal point for a given
double that the user inputs.
*/

import java.util.Scanner;

public class FourDigits {
    
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //Input
        System.out.println("Enter a double and the first four digits to the "+
        "right of the decimal point will be printed:");
        double inVal = myScanner.nextDouble();
        
        //Calculations
        int tensDigit = (int) (inVal * 10) % 10;
        int hundDigit = (int) (inVal * 100) % 10;
        int thouDigit = (int) (inVal * 1000) % 10;
        int tenthouDigit = (int) (inVal * 10000) % 10;
        
        //Output
        System.out.println("The four digits are "+tensDigit+hundDigit+
        thouDigit+tenthouDigit);
    }
}