//Braeden Benedix
//HW04
//WhichNumber
//CSE002
//Prof Chen

/*
PLANNING FLOWCHART
level 1 [1,2,3,4,5,6,7,8,9,10]
    answer1 <- even?
    
    yes: level 2 [2,4,6,8,10]
        answer2 <- div3?
        
        yes: level 3 [6]
            finish
        
        no: level 3 [2,4,8,10]
            answer3 <- greater than 5?
            
            yes: level 4 [8,10]
                answer4 <- div5?
                
                yes: level 5 [10]
                    finish
                
                no: level 5 [8]
                    finish
            
            no: level 4 [2,4]
                answer5 <- div4?
                
                yes: level 5 [4]
                    finish
                
                no: level 5 [2]
                    finish
            
    
    no: level 2 [1,3,5,7,9]
        answer6 <- div3?
        
        yes: level 3 [3,9]
            answer7 <- greater than 5?
            
            yes: level 4 [9]
                finish
            
            no: level 4 [3]
                finish
        
        no: level 3 [1,5,7]
            answer8 <- div5?
            
            yes: level 4 [5]
                finish
            
            no: level 4 [1,7]
                answer9 <- greater than 5?
                
                yes: level 5 [7]
                    finish
                
                no: level 5 [1]
                    finish
*/

import java.util.Scanner;

public class WhichNumber {
    
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //Flowchart
        System.out.println("Think of a number between 1 and 10 inclusive.");
        System.out.println("Answer with Y or y for yes and N or n for no.");
        
        //level 1 [1,2,3,4,5,6,7,8,9,10]
        System.out.print("Is the number even? ");
        char answer1 = myScanner.next().charAt(0);
        switch ( answer1 ) {
            case 'Y':
            case 'y':
                //level 2 [2,4,6,8,10]
                System.out.print("Is it divisible by 3? ");
                char answer2 = myScanner.next().charAt(0);
                switch ( answer2 ) {
                    case 'Y':
                    case 'y':
                        //level 3 [6]
                        //FINISH
                        System.out.print("Is your number 6? ");
                        char answerF6 = myScanner.next().charAt(0);
                        switch ( answerF6 ) {
                            case 'Y':
                            case 'y':
                                System.out.println("Yay!");
                            break;
                            
                            case 'N':
                            case 'n':
                                System.out.println("Well, I'm sorry then...");
                            break;
                            
                            default:
                                System.out.println("That is not a valid input.");
                            break;
                        }
                    break;
                    
                    case 'N':
                    case 'n':
                        //level 3 [2,4,8,10]
                        System.out.print("Is it greater than 5? ");
                        char answer3 = myScanner.next().charAt(0);
                        switch ( answer3 ) {
                            case 'Y':
                            case 'y':
                                //level 4 [8,10]
                                System.out.print("Is it divisible by 5? ");
                                char answer4 = myScanner.next().charAt(0);
                                switch ( answer4 ) {
                                    case 'Y':
                                    case 'y':
                                        //level 5 [10]
                                        //FINISH
                                        System.out.print("Is your number 10? ");
                                        char answerF10 = myScanner.next().charAt(0);
                                        switch ( answerF10 ) {
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            
                                            case 'N':
                                            case 'n':
                                                System.out.println("Well, I'm sorry then...");
                                            break;
                                            
                                            default:
                                                System.out.println("That is not a valid input.");
                                            break;
                                        }
                                    break;
                                    
                                    case 'N':
                                    case 'n':
                                        //level 5 [8]
                                        //FINISH
                                        System.out.print("Is your number 8? ");
                                        char answerF8 = myScanner.next().charAt(0);
                                        switch ( answerF8 ) {
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            
                                            case 'N':
                                            case 'n':
                                                System.out.println("Well, I'm sorry then...");
                                            break;
                                            
                                            default:
                                                System.out.println("That is not a valid input.");
                                            break;
                                        }
                                    break;
                                    
                                    default:
                                        System.out.println("That is not a valid input.");
                                    break;
                                }
                            break;
                            
                            case 'N':
                            case 'n':
                                //level 4 [2,4]
                                System.out.print("Is it divisible by 4? ");
                                char answer5 = myScanner.next().charAt(0);
                                switch ( answer5 ) {
                                    case 'Y':
                                    case 'y':
                                        //level 5 [4]
                                        //FINISH
                                        System.out.print("Is your number 4? ");
                                        char answerF4 = myScanner.next().charAt(0);
                                        switch ( answerF4 ) {
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            
                                            case 'N':
                                            case 'n':
                                                System.out.println("Well, I'm sorry then...");
                                            break;
                                            
                                            default:
                                                System.out.println("That is not a valid input.");
                                            break;
                                        }
                                    break;
                                    
                                    case 'N':
                                    case 'n':
                                        //level 5 [2]
                                        //FINISH
                                        System.out.print("Is your number 2? ");
                                        char answerF2 = myScanner.next().charAt(0);
                                        switch ( answerF2 ) {
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            
                                            case 'N':
                                            case 'n':
                                                System.out.println("Well, I'm sorry then...");
                                            break;
                                            
                                            default:
                                                System.out.println("That is not a valid input.");
                                            break;
                                        }
                                    break;
                                    
                                    default:
                                        System.out.println("That is not a valid input.");
                                    break;
                                }
                            break;
                            
                            default:
                                System.out.println("That is not a valid input.");
                            break;
                        }
                    break;
                    
                    default:
                        System.out.println("That is not a valid input.");
                    break;
                }
            break;
            
            case 'N':
            case 'n':
                //level 2 [1,3,5,7,9]
                System.out.print("Is it divisible by 3? ");
                char answer6 = myScanner.next().charAt(0);
                switch ( answer6 ) {
                    case 'Y':
                    case 'y':
                        //level 3 [3,9]
                        System.out.print("Is it greater than 5? ");
                        char answer7 = myScanner.next().charAt(0);
                        switch ( answer7 ) {
                            case 'Y':
                            case 'y':
                                //level 4 [9]
                                //FINISH
                                System.out.print("Is your number 9? ");
                                char answerF9 = myScanner.next().charAt(0);
                                switch ( answerF9 ) {
                                    case 'Y':
                                    case 'y':
                                        System.out.println("Yay!");
                                    break;
                                    
                                    case 'N':
                                    case 'n':
                                        System.out.println("Well, I'm sorry then...");
                                    break;
                                    
                                    default:
                                        System.out.println("That is not a valid input.");
                                    break;
                                }
                            break;
                            
                            case 'N':
                            case 'n':
                                //level 4 [3]
                                //FINISH
                                System.out.print("Is your number 3? ");
                                char answerF3 = myScanner.next().charAt(0);
                                switch ( answerF3 ) {
                                    case 'Y':
                                    case 'y':
                                        System.out.println("Yay!");
                                    break;
                                    
                                    case 'N':
                                    case 'n':
                                        System.out.println("Well, I'm sorry then...");
                                    break;
                                    
                                    default:
                                        System.out.println("That is not a valid input.");
                                    break;
                                }
                            break;
                            
                            default:
                                System.out.println("That is not a valid input.");
                            break;
                        }
                    break;
                    
                    case 'N':
                    case 'n':
                        //level 3 [1,5,7]
                        System.out.print("Is it divisible by 5? ");
                        char answer8 = myScanner.next().charAt(0);
                        switch ( answer8 ) {
                            case 'Y':
                            case 'y':
                                //level 4 [5]
                                //FINISH
                                System.out.print("Is your number 5? ");
                                char answerF5 = myScanner.next().charAt(0);
                                switch ( answerF5 ) {
                                    case 'Y':
                                    case 'y':
                                        System.out.println("Yay!");
                                    break;
                                    
                                    case 'N':
                                    case 'n':
                                        System.out.println("Well, I'm sorry then...");
                                    break;
                                    
                                    default:
                                        System.out.println("That is not a valid input.");
                                    break;
                                }
                            break;
                            
                            case 'N':
                            case 'n':
                                //level 4 [1,7]
                                System.out.print("Is it greater than 5? ");
                                char answer9 = myScanner.next().charAt(0);
                                switch ( answer9 ) {
                                    case 'Y':
                                    case 'y':
                                        //level 5 [7]
                                        //FINISH
                                        System.out.print("Is your number 7? ");
                                        char answerF7 = myScanner.next().charAt(0);
                                        switch ( answerF7 ) {
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            
                                            case 'N':
                                            case 'n':
                                                System.out.println("Well, I'm sorry then...");
                                            break;
                                            
                                            default:
                                                System.out.println("That is not a valid input.");
                                            break;
                                        }
                                    break;
                                    
                                    case 'N':
                                    case 'n':
                                        //level 5 [1]
                                        //FINISH
                                        System.out.print("Is your number 1? ");
                                        char answerF1 = myScanner.next().charAt(0);
                                        switch ( answerF1 ) {
                                            case 'Y':
                                            case 'y':
                                                System.out.println("Yay!");
                                            break;
                                            
                                            case 'N':
                                            case 'n':
                                                System.out.println("Well, I'm sorry then...");
                                            break;
                                            
                                            default:
                                                System.out.println("That is not a valid input.");
                                            break;
                                        }
                                    break;
                                    
                                    default:
                                        System.out.println("That is not a valid input.");
                                    break;
                                }
                            break;
                            
                            default:
                                System.out.println("That is not a valid input.");
                            break;
                        }
                    break;
                    
                    default:
                        System.out.println("That is not a valid input.");
                    break;
                }
            break;
            
            default:
                System.out.println("That is not a valid input.");
            break;
        }
    }
}