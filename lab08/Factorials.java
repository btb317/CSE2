//Braeden Benedix
//lab08
//Factorials
//CSE002
//Prof Chen

import java.util.Scanner;

public class Factorials {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int sup = scan.nextInt();
        int sum = 0;
        for (int i=1; i<=sup; i++) {
            sum += factorial(i);
        }
        print(sup, sum);
    }
    
    public static int factorial(int input) {
        int mul = 1;
        for (int i=1; i<=input; i++) {
            mul *= i;
        }
        System.out.print(mul+" + ");
        return mul;
    }
    
    public static void print(int input, int sum) {
        System.out.println("\nThe superfactorial of "+input+" is "+sum);
    }
}