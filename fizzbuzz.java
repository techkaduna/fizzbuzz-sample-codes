/**
 * Program prints first 100 FizzBuzz numbers
 *
 * Author: Kolawole Andrew
 */


class fizzbuzz {
    public static void main(String[] args) {
        // initializing and declaring counter variable
        int i = 1;
        
        // checking condition continously
        while (i <= 100){
            // check if i is perfectly divisible by 3
            if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                // check if i is perfectly divisible by 5
                System.out.println("Buzz");
            } else{
                // check if i is not perfectly divisible by 3 or 5
                System.out.println(i);
            }
            // increment counter variable
            i++;
        }
    }
}
