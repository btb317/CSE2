//Braeden Benedix
//lab05
//SpaceExploration
//CSE002
//Prof Chen

/*
Randomly selects a year from 2000-2010
Prints all significant space exploration advances through that year since 2000
*/

import java.util.Random;

public class SpaceExploration {
    
    public static void main(String[] args) {
        
        Random rand = new Random(); //create rng
        
        int maxYear = rand.nextInt(11); //random positive integer less than 11
        long maxYearFull = maxYear + 2000;  //full year for printing
        
        //Output
        System.out.println("Here is a timeline of space exploration events from "+maxYearFull
        +" to 2000:");
        switch (maxYear) {  //starts printing selected year and 'fall-through's printing the rest of the years
            case 10:
                System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back");
            case 9:
                System.out.println("2009: N/A");
            case 8:
                System.out.println("2008: Kepler launched to study deep space");
            case 7:
                System.out.println("2007: N/A");
            case 6:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 5:
                System.out.println("2005: Spacecraft collides with comet");
            case 4:
                System.out.println("2004: N/A");
            case 3:
                System.out.println("2003: Largest infrared telescope released");
            case 2:
                System.out.println("2002: N/A");
            case 1:
                System.out.println("2001: First spacecraft lands on an asteroid");
            case 0:
                System.out.println("2000: First spacecraft orbits an asteroid");
                break;
        }
    }
}