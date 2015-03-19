//Braeden Benedix
//HW07
//waves
//CSE002
//Prof Chen

/*
User is forced to input an integer from 1 to 30.
Creates a 'wave' with length dependent on the number.
*/

import java.util.Scanner;

public class waves {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in );
        
        //Input and validation
        int number;
        do {    //test for integer range
            System.out.print("Enter an integer from 1 to 30: ");
            while (!myScanner.hasNextInt()) {   //test for non-integers
                System.out.println("That is not a valid integer!");
                System.out.print("Enter an integer from 1 to 30: ");
                myScanner.next();
            }
            number = myScanner.nextInt();
            if (number <= 0 || number > 30) {   //test for integer range
                System.out.println("That is not a valid integer!");
            }
        } while(number <= 0 || number > 30);
        
        //For-loop wave
        System.out.println();
        System.out.println("FOR LOOP:");
        for (int lineCounter = 1; lineCounter <= number; lineCounter++) {
            if (lineCounter % 2 == 1) { //separates even and odd
                //odd descends
                for (int sizeCounter = lineCounter; sizeCounter >= 1; sizeCounter--) {
                    for (int printCounter = sizeCounter; printCounter > 1; printCounter--) {
                        System.out.print(lineCounter);
                    }
                    System.out.println(lineCounter);
                }
            } else {
                //even ascends
                for (int sizeCounter = 1; sizeCounter <= lineCounter; sizeCounter++) {
                    for (int printCounter = 1; printCounter < sizeCounter; printCounter++) {
                        System.out.print(lineCounter);
                    }
                    System.out.println(lineCounter);
                }
            }
        }
        
        //While-loop wave
        System.out.println();
        System.out.println("WHILE LOOP:");
        int lineWhile = 1;
        int sizeWhile, printWhile;
        while (lineWhile <= number) {
            if (lineWhile % 2 == 1) {
                sizeWhile = lineWhile;
                while (sizeWhile >= 1) {
                    printWhile = sizeWhile;
                    while (printWhile > 1) {
                        System.out.print(lineWhile);
                        
                        printWhile--;
                    }
                    System.out.println(lineWhile);
                    
                    sizeWhile--;
                }
            } else {
                sizeWhile = 1;
                while (sizeWhile <= lineWhile) {
                    printWhile = 1;
                    while (printWhile < sizeWhile) {
                        System.out.print(lineWhile);
                        
                        printWhile++;
                    }
                    System.out.println(lineWhile);
                    
                    sizeWhile++;
                }
            }
            
            lineWhile++;
        }
        
        //Do-while loop wave
        System.out.println();
        System.out.println("DO-WHILE LOOP:");
        int lineDo = 1;
        int sizeDo, printDo;
        do {
            if (lineDo % 2 == 1) {
                sizeDo = lineDo;
                do {
                    printDo = sizeDo;
                    do {
                        if (printDo != 1) {
                            System.out.print(lineDo);
                        }
                        
                        printDo--;
                    } while(printDo > 1);
                    System.out.println(lineDo);
                    
                    sizeDo--;
                } while(sizeDo >= 1);
            } else {
                sizeDo = 1;
                do {
                    printDo = 1;
                    do {
                        if (printDo != sizeDo) {
                            System.out.print(lineDo);
                        }
                        
                        printDo++;
                    } while(printDo < sizeDo);
                    System.out.println(lineDo);
                    
                    sizeDo++;
                } while(sizeDo <= lineDo);
            }
            
            lineDo++;
        } while(lineDo <= number);
    }
}