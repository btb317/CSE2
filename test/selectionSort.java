//Braeden Benedix
//sample selection sort practice

import java.util.Random;

public class selectionSort {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[6];
        for (int f = 0; f < 6; f++) {
            array[f] = rand.nextInt(100);
            if (f == 5) {
                System.out.println(array[f]);
            } else {
                System.out.print(array[f]+", ");
            }
        }
        
        int j = 0, temp = 0;
        for (int i = 0; i < 6; i++) {
            j = minFind(array, i, 5);
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
        for (int f = 0; f < 6; f++) {
            if (f == 5) {
                System.out.println(array[f]);
            } else {
                System.out.print(array[f]+", ");
            }
        }
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