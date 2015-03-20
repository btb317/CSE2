//Braeden Benedix
//lab04
//Cookies
//CSE002
//Prof Chen

/*
User inputs number of people, number of cookies, and how many cookies at least for each person
Inputs other than positive integers are rejected
Determines if the cookies will divide evenly and if there are enough for each person
Determines how many more cookies are needed if there are not enough
*/

import java.util.Scanner;

public class Cookies {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );   //make scanner
        
        //Inputs and instructions
        System.out.print("Enter the number of people: ");
        if (!myScanner.hasNextInt()) {  //checks for non-integers
            System.out.println("That is not an integer.");
            return; //leaves the program
        }
        int numPeople = myScanner.nextInt();    //stores the number of people
        if (numPeople < 0) {    //checks for integer range
            System.out.println("That is not a positive integer.");
            return;
        }
        
        System.out.print("Enter the number of cookies you are planning to buy:");
        if (!myScanner.hasNextInt()) {  //checks for non-integers
            System.out.println("That is not an integer.");
            return;
        }
        int numCookies = myScanner.nextInt();   //stores the number of cookies
        if (numCookies < 0) {   //checks for integer range
            System.out.println("That is not a positive integer.");
            return;
        }
        
        System.out.print("How many do you want each person to get:");
        if (!myScanner.hasNextInt()) {  //checks for non-integers
            System.out.println("That is not an integer.");
            return;
        }
        int numEach = myScanner.nextInt();  //stores how many cookies each person should get
        if (numEach < 0) {  //checks for integer range
            System.out.println("That is not a positive integer.");
            return;
        }
        
        if (numPeople*numEach > numCookies) {   //checks if there are enough cookies
            int moreCookies = numPeople * numEach - numCookies; //finds how many cookies are needed
            System.out.println("You will not have enough cookies. You need to buy at least "+
            moreCookies+" more.");
            return;
        }
        
        if (numCookies%numPeople == 0) {    //finds if they will divide evenly
            System.out.println("You have enough cookies for each person and the amount will divide evenly.");
        } else {
            System.out.println("You have enough cookies, but they will not divide evenly.");
        }
    }
}