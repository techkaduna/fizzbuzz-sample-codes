'''
 * Program prints FizzBuzz numbers starting
 * from start in a range of _range
 * @start: starting number
 * @_range: range of numbers
 *
 * Author: Kolawole Andrew
 '''


# declare counter variables
start = int(input("Enter start number: "))
_range = int(input("Enter range: "))

# printing a new line
print('\n')

# using a for loop with built-in range method
for i in range(start, (_range+1)):
    '''range function does will not include 100 by default 
    hence count+1 was used'''
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz") 
    else:
        print(i)

'''
 * if you noitced I used a for loop instead of a while loop as in the
 * tutorial excercise, you can replace the for loop with a while loop BUT DO NOT FORGET TO INCREASE the COUNTER variable
'''
