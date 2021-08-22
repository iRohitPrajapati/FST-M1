def fibonacci(number):
    if(number<=1):
        return number
    else:
        return (fibonacci(number-1) + fibonacci(number-2))

nterm = int(input("Enter a number: "))
if(nterm<=0):
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for item in range(nterm):
        print(fibonacci(item))