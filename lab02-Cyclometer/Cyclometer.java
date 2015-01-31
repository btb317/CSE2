//Braeden Benedix
//1/30/15
//CSE002
//Prof Chen

//For two trips, given elapsed time in seconds and number of rotations of the front wheel, print:
    //a. number of minutes of each trip
    //b. number of rotations of each trip
    //c. distance in miles of each trip
    //d. total combined distance
public class Cyclometer {
    
    public static void main(String[] args) {
        
        //input data
        int secsTrip1 = 480;      //length of trip 1 in seconds
        int secsTrip2 = 3220;     //length of trip 2 in seconds
        int countsTrip1 = 1561;   //length of trip 1 in rotations
        int countsTrip2 = 9037;   //length of trip 2 in rotations
        
        //intermediate variables and output
        double wheelDiameter = 27.0,    //diameter of a wheel in inches
        PI = 3.14159,                   //value of pi
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerMinute = 60;
        double distanceTrip1,           //output distance for trip 1
        distanceTrip2,                  //output distance for trip 2
        totalDistance;                  //output distance total
        
        //print outputs a. and b.
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
        " minutes and had "+countsTrip2+" counts.");
        
        //calculations
        distanceTrip1 = countsTrip1*wheelDiameter*PI;
            //^ circumference = diameter*pi, distance = rotations*circumference
        distanceTrip1 /= inchesPerFoot*feetPerMile; //convert to miles
        distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance = distanceTrip1+distanceTrip2;
        
        //print outputs c. and d.
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
    }
}