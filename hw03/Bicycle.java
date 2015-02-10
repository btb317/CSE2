//Braeden Benedix
//HW03
//Bicycle
//CSE002
//Prof Chen

/*
Takes from the user first the number of counts on a cyclometer and second the
number of seconds during which the counts occurred.  Then prints out the
distance traveled and the average MPH.  Assumes the diameter of the wheel is
27 inches.
*/

import java.util.Scanner;

public class Bicycle {
    
    public static void main(String[] args) {
        
        Scanner myScanner;  //declare an instance of the Scanner object
        myScanner = new Scanner( System.in );   //construct an instance of the Scanner object
        
        //Input
        System.out.print("Enter the number of seconds: ");
        int nSeconds = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int nCounts = myScanner.nextInt();
        
        //intermediate variables and output
        double wheelDiameter = 27.0,
        PI = 3.14159,
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerMinute = 60,
        minutesPerHour = 60;
        double totalDistance,
        totalMinutes,
        totalHours,
        avgMPH;
        
        //Calculations and output
        totalMinutes = nSeconds / secondsPerMinute;
        totalHours = totalMinutes / minutesPerHour;
        totalDistance = nCounts * wheelDiameter * PI;
        totalDistance /= inchesPerFoot * feetPerMile;
        avgMPH = totalDistance / totalHours;
        long avgMPHClean = (long) (avgMPH * 100);
        avgMPH = (double) (avgMPHClean) / 100;
        int totalDistanceClean = (int) (totalDistance * 100);
        totalDistance = (double) (totalDistanceClean) / 100;
        
        System.out.println("The distance was "+totalDistance+" miles and took "+
        totalMinutes+" minutes.");
        
        System.out.println("The average mph was "+avgMPH);
    }
}