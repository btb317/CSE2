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
        double[][][][] array = new double[3][rand1][rand2][rand3];
        for (int i=0; i<3; i++) {
            for (int i1=0; i1<rand1; i1++) {
                for (int i2=0; i2<rand2; i2++) {
                    for (int i3=0; i3<rand3; i3++) {
                        array[i][i1][i2][i3] = (double) ((int) (Math.random() * 300)) / 10;
                    }
                }
            }
        }
        
        printArray(array);
    }
    
    public static void printArray(double[][][][] array) {
        System.out.println("{");
        for (int i=0; i<array.length(); i++) {
            System.out.println("\t{");
            System.out.print("\t\t");
            for (int i1=0; i1<array[i].length(); i1++) {
                System.out.print("{");
                for (int i2=0; i2<array[i1].length(); i2++) {
                    System.out.print("{");
                    for (int i3=0; i3<array[i2].length(); i3++) {
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
}