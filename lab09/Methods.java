//Braeden Benedix
//lab09
//Methods
//CSE002
//Prof Chen

import java.util.Random;
import java.util.Scanner;

public class Methods {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String sentence;
        int answer;
        do {
            sentence = "The "+adj()+" "+adj()+" "+sub()+" "+verb()+" the "+adj()+" "+obj()+".";
            System.out.println(sentence);
            System.out.print("Would you like another sentence? Type 1 for yes: ");
            answer = scan.nextInt();
        } while(answer == 1);
    }
    
    public static String adj() {
        Random rng = new Random();
        int rand = rng.nextInt(10);
        String word = "";
        switch (rand) {
            case 0:
                word = "bouncy";
                break;
            case 1:
                word = "basic";
                break;
            case 2:
                word = "best";
                break;
            case 3:
                word = "blind";
                break;
            case 4:
                word = "busy";
                break;
            case 5:
                word = "bold";
                break;
            case 6:
                word = "broken";
                break;
            case 7:
                word = "boring";
                break;
            case 8:
                word = "beautiful";
                break;
            case 9:
                word = "buttery";
                break;
        }
        return word;
    }
    
    public static String sub() {
        Random rng = new Random();
        int rand = rng.nextInt(10);
        String word = "";
        switch (rand) {
            case 0:
                word = "bear";
                break;
            case 1:
                word = "bee";
                break;
            case 2:
                word = "boy";
                break;
            case 3:
                word = "bird";
                break;
            case 4:
                word = "brother";
                break;
            case 5:
                word = "beginner";
                break;
            case 6:
                word = "beast";
                break;
            case 7:
                word = "beggar";
                break;
            case 8:
                word = "beetle";
                break;
            case 9:
                word = "boyfriend";
                break;
        }
        return word;
    }
    
    public static String verb() {
        Random rng = new Random();
        int rand = rng.nextInt(10);
        String word = "";
        switch (rand) {
            case 0:
                word = "bought";
                break;
            case 1:
                word = "bit";
                break;
            case 2:
                word = "burned";
                break;
            case 3:
                word = "boiled";
                break;
            case 4:
                word = "blessed";
                break;
            case 5:
                word = "borrowed";
                break;
            case 6:
                word = "broke";
                break;
            case 7:
                word = "brushed";
                break;
            case 8:
                word = "buried";
                break;
            case 9:
                word = "believed";
                break;
        }
        return word;
    }
    
    public static String obj() {
        Random rng = new Random();
        int rand = rng.nextInt(10);
        String word = "";
        switch (rand) {
            case 0:
                word = "ball";
                break;
            case 1:
                word = "bucket";
                break;
            case 2:
                word = "basket";
                break;
            case 3:
                word = "bubble";
                break;
            case 4:
                word = "bush";
                break;
            case 5:
                word = "boots";
                break;
            case 6:
                word = "bread";
                break;
            case 7:
                word = "brick";
                break;
            case 8:
                word = "bike";
                break;
            case 9:
                word = "banana";
                break;
        }
        return word;
    }
}