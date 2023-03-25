'''
Program outputs the first 100 fizzbuzz numbers

Author: Kolawole Andrew
github: github.com/techkaduna

'''

# declare counter variable
i = 1

# using while loop to check condition continously
while (i <= 100):
    #checking if i is divisible by 3 and printing 'fizz'
    if (i % 3) == 0: # checking if i is perfectly divisible by 3
        print("Fizz")
    elif (i % 5) == 0: # checking if i is perfectly divisible by 5
        print("Buzz")
    else: # i is not divisible by 3 nor 5
        print(i)

    # increasing the counter
    i = i + 1

# Note: We could have used python's in-built range() method
