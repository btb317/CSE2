//Braeden Benedix
//HW04
//Banking
//CSE002
//Prof Chen

/*
ATM-like program.
Starts user with random balance between $1000 and $5000.
Then allows user to deposit, withdraw, or view balance.
*/

import java.util.Scanner;

public class Banking {
    
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //Starting balance (1000-5000)
        long min$ = 1000,
        max$ = 5000;
        long range = max$ - min$ + 1;
        double balance = (double) (Math.random() * range + min$);
        
        //store initial balance for transparency
        int intBalance = (int) (balance * 100);
        double balanceCheck = (double) intBalance /100;
        
        //Banking actions
        System.out.println("Would you like to make a deposit, make a withdrawal, or view your balance?");
        System.out.println("(Please use D/d for deposit, W/w for withdrawal, or B/b for balance)");
        char actionChoice = myScanner.next().charAt(0);
        switch ( actionChoice ) {
            case 'D':
            case 'd':
                //Deposit
                System.out.print("How much would you like to deposit? $");
                double deposit = myScanner.nextDouble();
                if ( deposit >= 0 ) {
                    balance += deposit;
                    //reduce to 2 decimal places
                    int balanceInt = (int) (balance * 100);
                    balance = (double) balanceInt / 100;
                    int depositInt = (int) (deposit * 100);
                    deposit = (double) depositInt / 100;
                    System.out.println("Balance: $"+balanceCheck+" + $"+deposit+
                        " = $"+balance);
                }
                else {
                    System.out.println("ERROR: NEGATIVE INPUT");
                }
            break;
            
            case 'W':
            case 'w':
                //Withdrawal
                System.out.print("How much would you like to withdraw? $");
                double withdrawal = myScanner.nextDouble();
                if ( withdrawal > balance ) {
                    System.out.println("ERROR: UNAUTHORIZED OVERDRAFT");
                }
                else if ( withdrawal >= 0 ) {
                    balance -= withdrawal;
                    //reduce to 2 decimal places
                    int balanceInt = (int) (balance * 100);
                    balance = (double) balanceInt / 100;
                    int withdrawalInt = (int) (withdrawal * 100);
                    withdrawal = (double) withdrawalInt / 100;
                    System.out.println("Balance: $"+balanceCheck+" - $"+withdrawal+
                        " = $"+balance);
                }
                else {
                    System.out.println("ERROR: NEGATIVE INPUT");
                }
            break;
            
            case 'B':
            case 'b':
                //Balance
                int balanceInt = (int) (balance * 100);
                balance = (double) balanceInt;
                balance /= 100;
                System.out.println("Balance: $"+balance);
            break;
            
            default:
                System.out.println("ERROR: INVALID COMMAND");
            break;
        }
    }
}