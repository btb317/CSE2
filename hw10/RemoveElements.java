//Braeden Benedix
//HW10
//RemoveElements
//CSE002
//Prof Chen


import java.util.Random;
import java.util.Scanner;

public class RemoveElements {
    
    public static void main(String[] arg) {
        
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
    	String answer="";
    	
    	do{
          	System.out.println("Random input 10 ints [0-9]");
          	num = randomInput();
          	String out = "The original array is:";
          	out += listArray(num);
          	System.out.println(out);
            
          	System.out.print("Enter the index ");
          	index = scan.nextInt();
          	newArray1 = delete(num,index);
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
            
            System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2="The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
          	
    	}while(answer.equals("Y") || answer.equals("y"));
    }
    
    public static String listArray(int num[]){
    	String out="{";
    	
    	for(int j=0;j<num.length;j++){
            
            if(j>0){
            	out+=", ";
            }
            
            out+=num[j];
    	}
    	out+="} ";
    	return out;
    }
    
    public static int[] randomInput() { //generates an array of 10 random integers from 0 to 9
        Random rand = new Random(); //declare RNG
        int[] num = new int[10];    //declare and allocate array
        for (int i = 0; i <= 9; i++) {  //loop to initialize variables
            num[i] = rand.nextInt(9);   //assigns random integer values from 0 to 9
        }
        return num; //returns array
    }
    
    public static int[] delete(int[] list, int pos) {   //takes an integer array called list and
    //an integer called pos; returns a new array with all members except the one at position pos
        if (pos < 0 || pos > 9) {   //checks for position bounds
            System.out.println("The index is not valid.");
            return list;
        }
        System.out.println("Index "+pos+" element is removed.");
        int[] num = new int[9]; //declare and allocate new array
        int i = 0, j = 0;   //create counters
        while (i < 9) {
            if (i == pos) { //finds position pos
                j++;    //and skips it
            }
            num[i] = list[j];
            i++;
            j++;
        }
        return num;
    }
    
    public static int[] remove(int[] list, int target) {    //deletes all elements that are
    //equal to target; returns new array without those elements
        int size=0;
        for (int i=0; i < list.length; i++) {   //measures the size of the new array by
            if (list[i] == target) {            //skipping elements equal to target
                continue;                       //thereby counting elements in new array
            }
            size++;
        }
        
        if (size == list.length) {  //tests if list contains target element
        //if list and new array are same size, then no elements are deleted
            System.out.println("Element "+target+" was not found.");
            return list;
        }
        System.out.println("Element "+target+" has been found.");
        
        int[] num = new int[size];  //declare and allocate new array
        int k = 0;  //counter for new array
        for (int j=0; j < list.length; j++) {   //goes through list assigning values not
            if (list[j] != target) {            //not equal to target to the new array
                num[k] = list[j];
                k++;
            }
        }
        return num;
    }
}