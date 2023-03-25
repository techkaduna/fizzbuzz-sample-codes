'use strict'

/**
 * Program prints first 100 FizzBuzz numbers
 *
 * Author: Kolawole Andrew
 */

// initialize and decliare counter variable
let i = 1;

// using while loop to continously check condition
while (i <= 100){
    // check if i is perfectly divisble by 3
    if (i % 3 == 0){
        console.log("Fizz");
    } else if (i % 5 == 0){
        // check if i is perfectly divisble by 5
        console.log("Buzz");
    } else{
        // check if i is not perfectly divisble by 3 nor 5
        console.log(i);
    }
    // increment counter variable
    i++;
}

