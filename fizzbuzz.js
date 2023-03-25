'use strict'

/**
 * Program prints FizzBuzz numbers starting
 * from start in a range of _range
 * @start: starting number
 * @_range: range of numbers
 *
 * Author: Kolawole Andrew
 */

// recieve user inputs
let start = parseInt(prompt("Enter start number: "));
let _range = parseInt(prompt("Enter range: "));

// using for loop to continously check condition
for (i = start; i <= _range; i++){
    // check if i is divisible by both 3 and 5
    if (i % 3 == 0 && i % 5 == 0){
	console.log("FizzBuzz");
    }
    // check if i is perfectly divisble by 3
    else if (i % 3 == 0){
        console.log("Fizz");
    } else if (i % 5 == 0){
        // check if i is perfectly divisble by 5
        console.log("Buzz");
    } else{
        // check if i is not perfectly divisble by 3 nor 5
        console.log(i);
    }
    
}

/**
 * if you noitced I used a for loop instead of a while loop as in the 
 * tutorial excercise, you can replace the for loop with a while loop BUT DO NOT FORGET TO INCREASE the COUNTER variable
 */

// Also Note: If you are running this program from node you will
// need to install promp because window.prompt is not implemented in node
