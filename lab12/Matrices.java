//Braeden Benedix
//lab12
//Matrices
//CSE002
//Prof Chen

import java.util.Random;

public class Matrices {
    
    public static void main(String[] args) {
        //Matrix generation
        Random rng = new Random();
        int[][] a, b, c, d;
        int ABwidth = rng.nextInt(2) + 3;
        int ABheight = rng.nextInt(2) + 3;
        int Cwidth = rng.nextInt(2) + 3;
        int Cheight = rng.nextInt(2) + 3;
        a = increasingMatrix(ABwidth, ABheight, true);
        b = increasingMatrix(ABwidth, ABheight, false);
        c = increasingMatrix(Cwidth, Cheight, true);
        
        //Printing
        System.out.println("Generating a matrix with width "+ABwidth+" and height "+ABheight+":");
        printMatrix(a, true);
        System.out.println("Generating a matrix with width "+ABwidth+" and height "+ABheight+":");
        printMatrix(b, false);
        System.out.println("Generating a matrix with width "+Cwidth+" and height "+Cheight+":");
        printMatrix(c, true);
        
        //Adding
        System.out.println("Adding first and second matrices:");
        d = addMatrix(a, true, b, false);
        printMatrix(d, true);
        System.out.println("Adding first and third matrices:");
        d = addMatrix(a, true, c, true);
        printMatrix(d, true);
    }
    
    public static int[][] increasingMatrix(int width, int height, boolean format) {
        int d2Size, d1Size;
        if (format) {   //row-major
            d2Size = height;
            d1Size = width;
        } else {        //column-major
            d2Size = width;
            d1Size = height;
        }
        
        int[][] array = new int[d2Size][d1Size];
        int elementVal = 1;
        if (format) {   //row-major
            for (int i=0; i<d2Size; i++) {
                for (int j=0; j<d1Size; j++) {
                    array[i][j] = elementVal;
                    elementVal++;
                }
            }
            
        } else {        //column-major
            for (int i=0; i<d1Size; i++) {
                for (int j=0; j<d2Size; j++) {
                    array[j][i] = elementVal;
                    elementVal++;
                }
            }
        }
        
        return array;
    }
    
    public static void printMatrix(int[][] array, boolean format) {
        if (array == null) {
            System.out.println("The array was empty!");
            return;
        }
        
        if (format) {
            for (int i=0; i<array.length; i++) {
                System.out.print("{\t");
                for (int j=0; j<array[i].length; j++) {
                    System.out.print(array[i][j]+"\t");
                }
                System.out.println("}");
            }
        } else {
            for (int i=0; i<array[0].length; i++) {
                System.out.print("{\t");
                for (int j=0; j<array.length; j++) {
                    System.out.print(array[j][i]+"\t");
                }
                System.out.println("}");
            }
        }
        
        return;
    }
    
    public static int[][] translate(int[][] array) {
        int[][] output = new int[array[0].length][array.length];
        for (int i=0; i<array[0].length; i++) {
            for (int j=0; j<array.length; j++) {
                output[i][j] = array[j][i];
            }
        }
        return output;
    }
    
    public static int[][] addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb) {
        //Check if possible
        boolean bothRow = formata && formatb;
        boolean bothCol = !(formata) && !(formatb);
        if (bothRow || bothCol) {
            if (a.length != b.length || a[0].length != b[0].length) { //not same width or not same height
                System.out.println("The arrays cannot be added!");
                return null;
            }
        } else {
            if (a.length != b[0].length || a[0].length != b.length) { //not same width or not same height
                System.out.println("The arrays cannot be added!");
                return null;
            }
        }
        
        //Column --> Row
        if (!formata) {
            a = translate(a);
            formata = !formata;
        }
        if (!formatb) {
            b = translate(b);
            formatb = !formatb;
        }
        
        //Addition
        int[][] d = new int[a.length][a[0].length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                d[i][j] = a[i][j] + b[i][j];
            }
        }
        return d;
    }
}