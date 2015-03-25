//Braeden Benedix
//lab07
//zigzag
//CSE002
//Prof Chen

/*
Forces user to input an integer from 3 to 33
Prints a pattern with stars dependent on the input
Repeats if user chooses to
*/

import java.util.Scanner;

public class zigzag {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner( System.in );    //create scanner
        
        int nStars; //create sentinel variable
        
        while (true) {  //infinite loop
            
            //Input and validation
            nStars = 0; //set variable to invalid value
            while (nStars > 33 || nStars < 3) { //outer check: range
                System.out.print("Enter an int between 3 and 33: ");
                while (!scan.hasNextInt()) {    //inner check: input type
                    System.out.println("That is not an integer.");
                    scan.next();    //clears scanner
                    System.out.print("Enter an int between 3 and 33: ");
                }
                nStars = scan.nextInt();    //saves user input
                if (nStars > 33 || nStars < 3) {    //error message
                    System.out.println("That number is out of range [3,33]");
                }
            }
            
            //Pattern
            int i = 0;  //create loop counter
            while (i < nStars) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            
            int j = 0;  //outer loop counter
            int k;  //inner loop counter
            while (j < (nStars - 2)) {  //loop for the lines
                k = 1;
                while (k < (j + 2)) {   //loop for the line length
                    System.out.print(" ");
                    k++;
                }
                System.out.println("*");
                j++;
            }
            
            i = 0;  //loop counter
            int nStarts = nStars;
            while (i < nStarts) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            
            System.out.print("Enter y or Y to go again: ");
            String answer = scan.next();
            if (!(answer.equals("y") || answer.equals("Y"))) {  //repeat check
                break;  //if answer is not yes then break out of infinite loop
            }
        }
    }
}