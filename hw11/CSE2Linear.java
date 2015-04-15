//Braeden Benedix
//HW11
//CSE2Linear
//CSE002
//Prof Chen

/*
Prompts and forces user to input 15 grades(int from 0-100, each one greater than or equal to the previous)
Prints the final array. Prompts user for grade to search for. Implements binary search.
Prints whether or not the grade was found and number of iterations used.
Scrambles array randomly. Prompts user for search grade again and uses a linear search.
Prints whether or not the grade was found and number of iterations used.
*/

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
        //Input
        int[] list = new int[15];   //create array for grades
        System.out.println("Enter 15 ints for final grades in CSE2:");
        int i = 0, previous = 0, input = 0;
        while (i < 15) {
            if (!scan.hasNextInt()) {   //tests if int
                System.out.print("That is not an integer: ");
                scan.next();    //clears scanner
                continue;   //goes to start of loop without incrementing i
            }
            input = scan.nextInt();
            if (input < 0 || input > 100) { //tests for range
                System.out.print("That is not a valid grade: ");
                continue;
            } else if (input < previous) {  //tests for sorting
                System.out.print("That is not greater than or equal to the previous input: ");
                continue;
            }
            list[i] = input;    //all tests pass so stores in list
            previous = input;
            i++;
        }
        
        System.out.print("The grades, sorted, are: ");
        printArray(list);   //method that prints array with spaces inbetween and then goes to next line
        
        //Binary search
        System.out.print("Enter a grade to search for: ");
        int searchVal = scan.nextInt();
        int result = binarySearch(list, searchVal); //binary search method
        if (result > 20) {  //analyzes result to see if it was found
            result -= 20;
            System.out.println(searchVal+" was not found in the list with "+result+" iterations.");
        } else {
            System.out.println(searchVal+" was found in the list with "+result+" iterations.");
        }
        
        //Scrambler
        System.out.println("Scrambled: ");
        randomize(list);    //scrambles array randomly
        printArray(list);
        
        //Linear search
        System.out.print("Enter a grade to seach for: ");
        searchVal = scan.nextInt();
        result = linearSearch(list, searchVal); //linear search method
        if (result == -1) {     //doesn't use result for not found because it will always take 15
            System.out.println(searchVal+" was not found in the list with 15 iterations.");
        } else {
            System.out.println(searchVal+" was found in the list with "+result+" iterations.");
        }
    }
    
    public static void printArray(int[] list) { //prints an input array w/ spaces inbetween
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println(""); //goes to next line after array is done
        return;
    }
    
    public static int binarySearch(int[] list, int searchVal) { //binary search method
        int low = 0, high = list.length - 1, result = 0;
        int middle;
        Boolean loop = true;
        while (loop) {  //infinite loop
            middle = midIndex(low, high);   //calls method to find middle index
            result++;   //count iteration
            if (list[middle] == searchVal) {    //check if found
                return result;
            }
            
            if (high-low==1) {  //if there are only 2 left then check the second
                result++;
                if (list[middle - 1] == searchVal) {
                    return result;
                } else {    //if neither are right then it is not found
                    result += 20;
                    return result;
                }
            }
            
            if (list[middle] < searchVal) { //decides whether to search top or bottom next
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return (result + 20);
    }
    
    public static int midIndex(int low, int high) { //finds middle index
        int range = high + 1 - low;
        int result;
        if (range%2 == 1) {
            result = (range / 2) + 1;
        } else {
            result = range / 2;
        }
        result += low;
        return result;
    }
    
    public static void randomize(int[] list) {  //scrambles array
        int target, temp;
        Random rand = new Random();
        for (int i=0; i<list.length; i++) {
            target = rand.nextInt(list.length);
            temp = list[target];
            list[target] = list[i];
            list[i] = temp;
        }
        return;
    }
    
    public static int linearSearch(int[] list, int searchVal) { //linear search method
        int i=0, result = -1;
        while (i < list.length) {
            if (list[i] == searchVal) {
                i++;
                result = i;
                break;
            } else {
                i++;
            }
        }
        return result;
    }
}