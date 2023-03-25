/**
 * Program prints FizzBuzz numbers starting
 * from start in a range of _range
 * @start: starting number
 * @_range: range of numbers
 *
 * Author: Kolawole Andrew
 */

import java.util.Scanner;

class fizzbuzz {
    public static void main(String[] args) {
        // initializing and declaring counter variable
        int start, _range;
	
	// create Scanner object
	Scanner sc = new Scanner(System.in);
       
       // recieve user input
        System.out.println("Enter start number: ");
	start = sc.nextInt();

        System.out.println("Enter range: ");
  	_range = sc.nextInt();

        // checking condition continously
        for (int i = start; i <= _range; i++){
	    // check if i % 3 and i % 5 = 0
	    if (i % 3 == 0 && i % 5 == 0){
		    System.out.println("FizzBuzz");
	    }else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                // check if i is perfectly divisible by 5
                System.out.println("Buzz");
            } else{
                // check if i is not perfectly divisible by 3 or 5
                System.out.println(i);
            }
        }
    }
}


/**
 * if you noitced I used a for loop instead of a while loop as in the
 * tutorial excercise, you can replace the for loop with a while loop BUT DO NOT FORGET TO INCREASE the COUNTER variable
 */

