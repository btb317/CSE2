//Braeden Benedix
//lab06
//SmileGenerator
//CSE002
//Prof Chen

/*

*/

public class SmileGenerator {
    
    public static void main(String[] args) {
        
        //Step 1
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print(":)");
        }
        System.out.println("");
        
        i=0;
        while (i<5) {
            System.out.print(":)");
            i++;
        }
        System.out.println("");
        
        i=0;
        do {
            System.out.print(":)");
            i++;
        } while(i<5);
        System.out.println("\n");
        
        //Step 2
        int rng = (int) (Math.random() * 100) + 1;
        for (i=0; i<rng; i++) {
            System.out.print(":)");
        }
        System.out.println("\n");
        
        //Step 3
        int lineCounter = 0;
        for (i=0; i<rng; i++) {
            System.out.print(":)");
            lineCounter++;
            if (lineCounter == 30) {
                System.out.println();
                lineCounter = 0;
            }
        }
        System.out.println("\n");
        
        //Step 4
        lineCounter = 0;
        int lineSize = 1;
        for (i=0; i<rng; i++) {
            System.out.print(":)");
            lineCounter++;
            if (lineCounter == lineSize) {
                System.out.println();
                lineCounter = 0;
                lineSize++;
            }
        }
        System.out.println();
    }
}