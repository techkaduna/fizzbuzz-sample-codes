#include <stdio.h>
#include <stdlib.h>

/**
 * Program prints FizzBuzz numbers starting
 * from start in a range of _range
 * @start: starting number
 * @_range: range of numbers
 *
 * Author: Kolawole Andrew
 */


int main()
{
	// declaring and initializing counter variable
	int start, _range;

	// reading user input from stdin
	printf("Enter start number: ");
	scanf("%i", &start);

	printf("Enter range: ");
	scanf("%i", &_range);

	//using while loop to check condition continously
	for (int i = start; i <= _range; i++)
	{
		//check i
		if (i % 3 == 0 && i % 5 == 0){
			printf("FizzBuzz\n");
		}
		// check if i is perfectly divisible by 3
		else if (i % 3 == 0)
		{
			printf("Fizz\n");
		} else if(i % 5 == 0)
		{
			// check if i is perfectly divisible by 5
			printf("Buzz\n");
		} else{
			// i is not divisible by 3 nor 5
			printf("%i\n", i);
		}
		
	}

	return (0);
}
