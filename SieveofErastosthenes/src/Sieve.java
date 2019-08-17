// Assignment-4: Sieve of Erastosthenes
// I reviewed Eddie Woo's video titled "The Sieve of Eratosthenes 
// that was published on November 9, 2014.
// That video can be found here: https://www.youtube.com/watch?v=Lj_SzTGr-G4
// The code below was written by me.

import java.util.*;
public class Sieve {
	
	public static void main(String[] args) {
		System.out.println("Enter an integer greater than 1: ");
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// prompt the user for valid input
			try {
				int num = input.nextInt();
				if(num < 2 ) {
		    		System.out.println("You must enter an integer greater than 1.");
		    	}
		    	else {
		    		runSieve(num);
		    	}
			}
			catch(InputMismatchException e) {
			     //Display Error message
				 input.next();
				 System.out.println("You must enter an integer greater than 1.");
			}
		input.close();
		}
	
	//sieve method
	public static void runSieve(int num) {
		int max = (int) Math.ceil(Math.sqrt(num));
		int[] intArray = new int[num+1];
		int start = 2;
		
		while (start <= max) {
			//mark all multiples of the start as one in the array
			for (int i = start*2; i < intArray.length; i+=start) {
				intArray[i] = 1;
			}
			//find the next prime to start the while loop with
			for (int i = start + 1; i < intArray.length; i++) {
				if (intArray[i] == 0) {
					start = i;
					break;
				}
			}
		}
		
		//display the results
		System.out.println("");
		System.out.println("The prime numbers less than or equal to " + num + " are:");
		for(int i = 2; i < intArray.length; i++) {
			if(intArray[i] == 0) {
				System.out.print(i+" ");
			}
		}
	}
}



 
