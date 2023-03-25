#include <stdio.h>
#include <stdlib.h>

/**
 * main - Entry point
 * Program outputs the first 100 FizzBuzz numbers
 * @i: counter
 *
 * Return: Always (0) success
 */

int main()
{
	// declaring and initializing counter variable
	int i = 1;

	//using while loop to check condition continously
	while (i <= 100)
	{
		// check if i is perfectly divisible by 3
		if (i % 3 == 0)
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
		// increment counter
		i++;
	}

	return (0);
}
