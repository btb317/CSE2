//Braeden Benedix
//lab10
//ArrayInputs
//CSE002
//Prof Chen

import java.util.Scanner;

public class ArrayInputs {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer for the size of an array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        array = fillArray(size);
        
        System.out.println("\nThe array is:");
        for (int i=0; i<size; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static int[] fillArray(int size) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        int[] array = new int[size];
        while (i<size) {
            do {
                System.out.print("Please enter a positive integer: ");
                while (!scan.hasNextInt()) {
                    System.out.println("Sorry, you didn't enter an integer.");
                    System.out.print("Please enter a positive integer: ");
                    scan.next();
                }
                array[i] = scan.nextInt();
                if (array[i] < 0) {
                    System.out.println("Sorry, the number you entered is negative.");
                }
            } while (array[i] < 0);
            i++;
        }
        return array;
    }
}