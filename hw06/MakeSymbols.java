//Braeden Benedix
//HW06
//MakeSymbols
//CSE002
//Prof Chen

/*
Use do-while loops and the RNG to generate an integer between 0 and 100
    I assume this means 0 to 100 inclusive as it is not specified
First print out the number
If it is even, then print that many * characters
If it is odd, then print that many & characters
*/

public class MakeSymbols {
    
    public static void main(String[] args) {
        
        //Initialize random number 0-100
        int num = (int) (Math.random() * 101);
        
        //Output 1
        System.out.println("Random number generated: "+num);
        System.out.println("Output pattern: ");
        
        //Symbol generator and output 2
        if (num % 2 == 0) { //even
            //test for 0 because a do while loop will print once,
                //which you don't want if the number is 0
            if (num != 0) {
                do {
                    System.out.print("*");
                    num--;
                } while(num > 0);
                System.out.println();
            }
        } else { //odd
            do {
                System.out.print("&");
                num--;
            } while(num > 0);
            System.out.println();
        }
    }
}