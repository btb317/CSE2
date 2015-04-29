//Braeden Benedix
//lab09
//Methods
//CSE002
//Prof Chen

import java.util.Random;

public class Methods {
    
    public static void main(String[] args) {
        
        Random rng = new Random();
        
        
    }
    
    public static String adj() {
        Random rng = new Random();
        int rand = rng.nextInt(10);
        String word;
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
        String word;
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
        String word;
        switch (rand) {
            case 0:
                word = "bought";
                break;
            case 1:
                word = "";
                break;
            case 2:
                word = "";
                break;
            case 3:
                word = "";
                break;
            case 4:
                word = "";
                break;
            case 5:
                word = "";
                break;
            case 6:
                word = "";
                break;
            case 7:
                word = "";
                break;
            case 8:
                word = "";
                break;
            case 9:
                word = "";
                break;
        }
        return word;
    }
    
    public static String obj() {
        Random rng = new Random();
        int rand = rng.nextInt(10);
        String word;
        switch (rand) {
            case 0:
                word = "";
                break;
            case 1:
                word = "";
                break;
            case 2:
                word = "";
                break;
            case 3:
                word = "";
                break;
            case 4:
                word = "";
                break;
            case 5:
                word = "";
                break;
            case 6:
                word = "";
                break;
            case 7:
                word = "";
                break;
            case 8:
                word = "";
                break;
            case 9:
                word = "";
                break;
        }
        return word;
    }
}