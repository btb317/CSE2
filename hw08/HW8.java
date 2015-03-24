//Braeden Benedix
//HW08
//HW8 (game)
//CSE002
//Prof Chen

/*

*/

import java.util.Scanner;
import java.util.Random;

public class HW8 {
    
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner scan, String string) {
        String input = scan.next();
        if ( !(input.equals(Character.toString(string.charAt(0))) || input.equals(Character.toString(string.charAt(1)))) ) {
            System.out.println("Yeah right loser!");
            System.exit(0);
        }
        return "C";
    }
    
    public static String getInput(Scanner scan, String string, int trial) {
        String input;
        int rng;
        Random rand = new Random();
        while (trial > 0) {
            input = scan.next();
            if ( input.equals(Character.toString(string.charAt(0))) || input.equals(Character.toString(string.charAt(1))) ) {
                //Attack attempt
                rng = rand.nextInt(2);
                switch (rng) {
                    case 1:
                        //crit
                        trial--;
                        System.out.println("Critical Hit!");
                        if (trial > 0) {
                            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                        }
                        break;
                    case 0:
                        //miss
                        System.out.println("Gosh, how can you miss it?!");
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                        break;
                }
            } else if ( input.equals(Character.toString(string.charAt(2))) || input.equals(Character.toString(string.charAt(3))) ) {
                //Escape attempt
                rng = rand.nextInt(11);
                if (rng == 10) {
                    System.out.println("You successfully escaped the giant!");
                    return "C";
                } else {
                    System.out.println("You were not able to escape.");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                }
            } else {
                System.out.println("Executed by giant! GAME OVER!");
                System.exit(0);
            }
        }
        return "C";
    }
    
    public static String getInput(Scanner scan) {
        if (!scan.hasNextInt()) {
            System.out.println("That's not a number! You get nothing! Better restart the game...");
            System.exit(0);
        }
        int box = scan.nextInt();
        switch (box) {
            case 1:
                System.out.println("You found a bag of gold coins!");
                break;
            case 2:
                System.out.println("You found a magic potion!");
                break;
            case 3:
                System.out.println("You found a large gemstone!");
                break;
            default:
                System.out.println("A wrong number! You get nothing! Better restart the game...");
                System.exit(0);
                break;
        }
        return "C";
    }
}