//Braeden Benedix
//HW06
//GetIntegers
//CSE002
//Prof Chen

/*
Ask user for 5 non-negative integers
Use a loop to find and print the sum
If an invalid value is entered, ask again
*/

import java.util.Scanner;

public class GetIntegers {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        
        //Instructions
        System.out.println("Please enter 5 non-negative integers:");
        
        //Intialize variables
        int counter = 0, capacity = 5;
        int intSum = 0, userInput = 0;
        
        //Input and sum loop
        for (counter = 0; counter<capacity; counter++) {
            userInput = myScanner.nextInt();
            if ( userInput < 0 ) {
                System.out.println("Invalid input, enter again:");
                capacity++; //stops loop from counting the invalid input
            } else {
                intSum += userInput;
            }
        }
        
        //Output
        System.out.println("Sum is "+intSum);
    }
}