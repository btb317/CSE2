//Braeden Benedix
//HW12
//Multiply
//CSE002
//Prof Chen

/*
Unfinished
*/

import java.util.Scanner;
import java.util.Random;

public class Multiply {
    
    public static void main(String[] args) {
        int width = 3, height = 3;
        int[][] array = new int[height][width];
        array = randomMatrix(width, height);
        printMatrix(array);
    }
    
    public static int[][] randomMatrix(int width, int height) {
        Random rand = new Random();
        
        int[][] array = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = rand.nextInt(21) - 10;
            }
        }
        return array;
    }
    
    public static void printMatrix(int[][] array) {
        int height = array.length;
        int width = array[0].length;
        if (array == null) {
            System.out.println("The array was empty!");
            return;
        }
        for (int i = 0; i < height; i++) {
            System.out.print("{");
            for (int j = 0; j < width; j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println("\t}");
        }
        return;
    }
    
    public static int[][] matrixMultiply(int[][] array1, int[][] array2) {
        int height1 = array1.length;
        int height2 = array2.length;
        int width1 = array1[0].length;
        int width2 = array2[0].length;
        if (width1 != height2) {
            System.out.println("ERROR");
            return null;
        }
        
        return null; //placeholder
    }
}