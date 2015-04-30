//Braeden Benedix
//lab11
//ArraySearch
//CSE002
//Prof Chen

import java.util.Scanner;
import java.util.Random;

public class ArraySearch {
    
    public static void main(String[] args) {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        Random rng = new Random();
        
        int i;
        for (i=0; i<50; i++) {
            array1[i] = rng.nextInt(100);
        }
        
        int min1 = 100, max1 = 0;
        for (i=0; i<50; i++) {
            if (array1[i] < min1) {
                min1 = array1[i];
            }
            if (array1[i] > max1) {
                max1 = array1[i];
            }
        }
        System.out.println("The minimum of array1 is: "+min1);
        System.out.println("The maximum of array1 is: "+max1);
        
        array2[0] = rng.nextInt(100);
        for (i=1; i<50; i++) {
            array2[i] = rng.nextInt(100) + array2[i - 1];
        }
        int min2 = array2[0];
        int max2 = array2[49];
        System.out.println("The minimum of array2 is: "+min2);
        System.out.println("The maximum of array2 is: "+max2);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int >= 0: ");
        if (!scan.hasNextInt()) {
            System.out.println("You did not enter an int.");
            return;
        }
        int input = scan.nextInt();
        if (input < 0) {
            System.out.println("You did not enter an int >= 0.");
            return;
        }
        
        if (input < min2) {
            System.out.println(input+" was not found in the list.");
            System.out.println("The number above the key was "+min2);
            return;
        } else if (input > max2) {
            System.out.println(input+" was not found in the list.");
            System.out.println("The number below the key was "+max2);
            return;
        }
        
        int result = binarySearch(array2, input);
        if (result > 49) {
            System.out.println("ERROR");
            return;
        } else if (result < 0) {
            System.out.println(input+" was not found in the list.");
            result *= -1;
            System.out.println("The number above the key was "+array2[result]);
            System.out.println("The number below the key was "+array2[result - 1]);
        } else {
            System.out.println(input+" was found in the list.");
        }
    }
    
    public static int binarySearch(int[] list, int searchVal) { //binary search method
        int low = 0, high = list.length - 1;
        int middle;
        Boolean loop = true;
        while (loop) {  //infinite loop
            middle = midIndex(low, high);   //calls method to find middle index
            
            if (list[middle] == searchVal) {    //check if found
                return middle;
            }
            
            if (high-low==1) {  //if there are only 2 left then check the second
                if (list[middle - 1] == searchVal) {
                    return middle - 1;
                } else {    //if neither are right then it is not found
                    return middle * -1;
                }
            }
            
            if (list[middle] < searchVal) { //decides whether to search top or bottom next
                low = middle;
            } else {
                high = middle;
            }
        }
        return list.length;
    }
    
    public static int midIndex(int low, int high) { //finds middle index
        int range = high - low;
        int result;
        if (range%2 == 1) {
            result = (range + 1) / 2;
        } else {
            result = range / 2;
        }
        result += low;
        return result;
    }
}