//Braeden Benedix
//HW05
//ToHex
//CSE002
//Prof Chen

/*

*/

import java.util.Scanner;

public class ToHex {
    
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //Input
        System.out.println("Please enter three numbers representing RGB values:");
        System.out.print("  ");
        int red = myScanner.nextInt();
        int green = myScanner.nextInt();
        int blue = myScanner.nextInt();
        
        //Input Check
        if (red>=0 && red<256 && green>=0 && green<256 && blue>=0 && blue<256) {
        
            //Calculations
            int redDec1 = red / 16;
            int redDec2 = red % 16;
            int greenDec1 = green / 16;
            int greenDec2 = green % 16;
            int blueDec1 = blue / 16;
            int blueDec2 = blue % 16;
            String redHex1, redHex2, greenHex1, greenHex2, blueHex1, blueHex2;
            
            //Convert to hex with letters
                //first hex digit
            switch (redDec1) {
                case 10:
                    redHex1 = "A";
                    break;
                case 11:
                    redHex1 = "B";
                    break;
                case 12:
                    redHex1 = "C";
                    break;
                case 13:
                    redHex1 = "D";
                    break;
                case 14:
                    redHex1 = "E";
                    break;
                case 15:
                    redHex1 = "F";
                    break;
                default:
                    redHex1 = Integer.toString(redDec1);
                    break;
            }
                //second hex digit
            switch (redDec2) {
                case 10:
                    redHex2 = "A";
                    break;
                case 11:
                    redHex2 = "B";
                    break;
                case 12:
                    redHex2 = "C";
                    break;
                case 13:
                    redHex2 = "D";
                    break;
                case 14:
                    redHex2 = "E";
                    break;
                case 15:
                    redHex2 = "F";
                    break;
                default:
                    redHex2 = Integer.toString(redDec2);
                    break;
            }
                //third hex digit
            switch (greenDec1) {
                case 10:
                    greenHex1 = "A";
                    break;
                case 11:
                    greenHex1 = "B";
                    break;
                case 12:
                    greenHex1 = "C";
                    break;
                case 13:
                    greenHex1 = "D";
                    break;
                case 14:
                    greenHex1 = "E";
                    break;
                case 15:
                    greenHex1 = "F";
                    break;
                default:
                    greenHex1 = Integer.toString(greenDec1);
                    break;
            }
                //fourth hex digit
            switch (greenDec2) {
                case 10:
                    greenHex2 = "A";
                    break;
                case 11:
                    greenHex2 = "B";
                    break;
                case 12:
                    greenHex2 = "C";
                    break;
                case 13:
                    greenHex2 = "D";
                    break;
                case 14:
                    greenHex2 = "E";
                    break;
                case 15:
                    greenHex2 = "F";
                    break;
                default:
                    greenHex2 = Integer.toString(greenDec2);
                    break;
            }
                //fifth hex digit
            switch (blueDec1) {
                case 10:
                    blueHex1 = "A";
                    break;
                case 11:
                    blueHex1 = "B";
                    break;
                case 12:
                    blueHex1 = "C";
                    break;
                case 13:
                    blueHex1 = "D";
                    break;
                case 14:
                    blueHex1 = "E";
                    break;
                case 15:
                    blueHex1 = "F";
                    break;
                default:
                    blueHex1 = Integer.toString(blueDec1);
                    break;
            }
                //sixth hex digit
            switch (blueDec2) {
                case 10:
                    blueHex2 = "A";
                    break;
                case 11:
                    blueHex2 = "B";
                    break;
                case 12:
                    blueHex2 = "C";
                    break;
                case 13:
                    blueHex2 = "D";
                    break;
                case 14:
                    blueHex2 = "E";
                    break;
                case 15:
                    blueHex2 = "F";
                    break;
                default:
                    blueHex2 = Integer.toString(blueDec2);
                    break;
            }
            
            //Output
            System.out.println("The decimal numbers R:"+red+", G:"+green+
            ", B:"+blue+", are represented in hexadecimal as: "+redHex1+
            redHex2+greenHex1+greenHex2+blueHex1+blueHex2);
            
        } else if ((red+green+blue)>=0 || (red+green+blue)<0) {
            System.out.println("You must enter values from 0-255.");
        } else {
            System.out.println("You must enter an integer.");
        }
    }
}