numbers = list(input("Enter a sequence of numbers seperated by comma: ").split(","))
sum=0

for number in numbers:
    sum+= int(number)

print("Sum of all numbers are:",sum)