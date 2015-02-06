//Braeden Benedix
//2/6/15
//CSE002
//Prof Chen
//lab03

/*
Computes the cost of buying some Big Macs.
Uses the Scanner class to obtain from the user:
    How many Big Macs
    Cost per Big Mac
    Percentage tax
Then displays the total cost
*/

//import the Scanner class
import java.util.Scanner;

public class BigMac {
    
    public static void main(String[] args) {
        
        Scanner myScanner;  //declare an instance of the Scanner object
        myScanner = new Scanner( System.in );   //construct an instance of the Scanner object
        
        //Input
        System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"+
            " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate /= 100;
        
        //Calculations
        double cost$;
        int dollars, dimes, pennies;
        cost$ = nBigMacs * bigMac$ * (1 + taxRate);
        dollars = (int) cost$;
        dimes = (int) (cost$ * 10) % 10;
        pennies = (int) (cost$ * 100) % 10;
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+
            " per Big Mac, with a sales tax of "+ (int) (taxRate * 100) +"%, is $"+
            dollars+'.'+dimes+pennies);
    }
}