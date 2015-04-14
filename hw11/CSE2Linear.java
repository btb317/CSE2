//Braeden Benedix
//HW11
//CSE2Linear
//CSE002
//Prof Chen

/*

*/

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
        //Input
        int[] list = new int[15];
        System.out.println("Enter 15 ints for final grades in CSE2:");
        int i = 0, previous = 0, input = 0;
        while (i < 15) {
            if (!scan.hasNextInt()) {
                System.out.print("That is not an integer: ");
                scan.next();
                continue;
            }
            input = scan.nextInt();
            if (input < 0 || input > 100) {
                System.out.print("That is not a valid grade: ");
                continue;
            } else if (input < previous) {
                System.out.print("That is not greater than or equal to the previous input: ");
                continue;
            }
            list[i] = input;
            previous = input;
            i++;
        }
        
        System.out.print("The grades, sorted, are: ");
        printArray(list);
        
        //Binary search
        System.out.print("Enter a grade to search for: ");
        int searchVal = scan.nextInt();
        int result = binarySearch(list, searchVal);
        if (result > 20) {
            result -= 20;
            System.out.println(searchVal+" was not found in the list with "+result+" iterations.");
        } else {
            System.out.println(searchVal+" was found in the list with "+result+" iterations.");
        }
        
        //Scrambler
        System.out.println("Scrambled: ");
        randomize(list);
        printArray(list);
        
        //Linear search
        System.out.print("Enter a grade to seach for: ");
        searchVal = scan.nextInt();
        result = linearSearch(list, searchVal);
        if (result == -1) {
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
    
    public static int binarySearch(int[] list, int searchVal) {
        int low = 0, high = list.length - 1, result = 0;
        int middle;
        Boolean loop = true;
        while (loop) {
            middle = midIndex(low, high);
            result++;
            if (list[middle] == searchVal) {
                return result;
            }
            
            if (high-low==1) {
                result++;
                if (list[middle - 1] == searchVal) {
                    return result;
                } else {
                    result += 20;
                    return result;
                }
            }
            
            if (list[middle] < searchVal) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return (result + 20);
    }
    
    public static int midIndex(int low, int high) {
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
    
    public static void randomize(int[] list) {
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
    
    public static int linearSearch(int[] list, int searchVal) {
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