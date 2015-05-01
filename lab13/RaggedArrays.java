//Braeden Benedix
//lab13
//RaggedArrays
//CSE002
//Prof Chen

import java.util.Random;

public class RaggedArrays {
    
    public static void main(String[] args) {
        int[][] array = new int[5][];
        Random rng = new Random();
        for (int i=0; i<5; i++) {
            array[i] = new int[i*3 + 5];
            for (int j=0; j<(i*3 + 5); j++) {
                array[i][j] = rng.nextInt(40);
            }
        }
        System.out.println("Array before sorting:");
        printArray(array);
        
        System.out.println("\nArray after sorting:");
        for (int i=0; i<5; i++) {
            array[i] = sortArray(array[i]);
        }
        printArray(array);
        
        int[][] rectArray = new int[5][array[4].length];
        for (int i=0; i<5; i++) {
            for (int j=0; j<(array[4].length); j++) {
                if (j<array[i].length) {
                    rectArray[i][j] = array[i][j];
                } else {
                    rectArray[i][j] = 0;
                }
            }
        }
        System.out.println("\nArray after sorting and copying:");
        printArray(rectArray);
    }
    
    public static void printArray(int[][] array) {
        for (int i=0; i<5; i++) {
            System.out.print("Row "+(i+1)+": ");
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        return;
    }
    
    public static int[] sortArray(int[] array) {
        int j = 0, temp = 0;
        for (int i = 0; i < array.length; i++) {
            j = minFind(array, i, array.length - 1);
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
    
    public static int minFind(int[] array, int lowIndex, int highIndex) {
        //finds the element with the lowest value in a portion of an array
        //when there are multiple, defaults to lowest index
        int j = lowIndex;
        for (int i = lowIndex; i <= highIndex; i++) {
            if (array[i] < array[j]) {
                j = i;
            }
        }
        return j;
    }
}