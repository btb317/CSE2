//Braeden Benedix
//HW13
//FourDwin
//CSE002
//Prof Chen

import java.util.Scanner;
import java.util.Random;

public class FourDwin {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rng = new Random();
        
        int X, Y;
        
        do {    //test for integer range
            System.out.print("Enter an integer X: ");
            while (!scan.hasNextInt()) {   //test for non-integers
                System.out.println("That is not a valid integer!");
                System.out.print("Enter an integer X: ");
                scan.next();
            }
            X = scan.nextInt();
            if (X <= 0) {   //test for integer range
                System.out.println("That is not a valid integer!");
            }
        } while(X <= 0);
        
        do {    //test for integer range
            System.out.print("Enter an integer Y, where Y > X: ");
            while (!scan.hasNextInt()) {   //test for non-integers
                System.out.println("That is not a valid integer!");
                System.out.print("Enter an integer Y, where Y > X: ");
                scan.next();
            }
            Y = scan.nextInt();
            if (Y <= X) {   //test for integer range
                System.out.println("That is not a valid integer!");
            }
        } while(Y <= X);
        
        double randVal = (double) ((int) (Math.random() * 300)) / 10;
        
        int rand1 = rng.nextInt(Y - X + 1) + X;
        int rand2 = rng.nextInt(Y - X + 1) + X;
        int rand3 = rng.nextInt(Y - X + 1) + X;
        double[][][][] array = new double[3][rand1][rand2][];
        
        for (int i=0; i<3; i++) {
            for (int i1=0; i1<rand1; i1++) {
                for (int i2=0; i2<rand2; i2++) {
                    array[i][i1][i2] = new double[rng.nextInt(Y - X + 1)+X];
                    for (int i3=0; i3<array[i][i1][i2].length; i3++) {
                        array[i][i1][i2][i3] = (double) ((int) (Math.random() * 300)) / 10;
                    }
                }
            }
        }
        
        printArray(array);
        statArray(array);
        //System.out.println(min3d(array[0]));
    }
    
    public static void printArray(double[][][][] array) {
        System.out.println("{");
        for (int i=0; i<array.length; i++) {
            System.out.println("\t{");
            System.out.print("\t\t");
            for (int i1=0; i1<array[i].length; i1++) {
                System.out.print("{");
                for (int i2=0; i2<array[i][i1].length; i2++) {
                    System.out.print("{");
                    for (int i3=0; i3<array[i][i1][i2].length; i3++) {
                        System.out.print(array[i][i1][i2][i3]+", ");
                    }
                    System.out.print("}, ");
                }
                System.out.print("}, ");
            }
            System.out.println("\n\t},");
        }
        System.out.println("}");
    }
    
    public static int numElements(double[][][] array) { //finds number of elements in a 3d array
        int num = 0;
        for (int i=0; i<array.length; i++) {
            for (int i1=0; i1<array[i].length; i1++) {
                num += array[i][i1].length;
            }
        }
        return num;
    }
    
    public static double sum3d(double[][][] array) {
        double sum = 0;
        for (int i=0; i<array.length; i++) {
            for (int i1=0; i1<array[i].length; i1++) {
                for (int i2=0; i2<array[i][i1].length; i2++) {
                    sum += array[i][i1][i2];
                }
            }
        }
        return sum;
    }
    
    public static void statArray(double[][][][] array) {
        int eleNum=0;
        double sum=0;
        for (int i=0; i<3; i++) {
            eleNum += numElements(array[i]);
            sum += sum3d(array[i]);
        }
        System.out.println("Members:\t"+eleNum);
        System.out.println("Sum:\t\t"+sum);
        double mean = sum / eleNum;
        System.out.println("Mean:\t\t"+mean);
    }
    
    public static double min3d(double[][][] array) {
        double min = 50;
        for (int i=0; i<array.length; i++) {
            for (int i1=0; i1<array[i].length; i1++) {
                for (int i2=0; i2<array[i][i1].length; i2++) {
                    if (array[i][i1][i2] < min) {
                        min = array[i][i1][i2];
                    }
                }
            }
        }
        return min;
    }
    
    /*
    public static double[][][][] sort4DArray(double[][][][] array) {
        double key, j;
        double[][][] temp;
        for (int i=1; i<array.length; i++) {
            key = min3d(array[i]);
            temp = array[i];
            j = i - 1;
            while (j>-1 && min3d(array[j]) > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }*/
}