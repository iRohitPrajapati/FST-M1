# Getting list input from users
numbers = list(input("Enter sequence of numbers seperated by comma: ").split(","))
print("Given list is: ", numbers)

# Validate if first & last numbers are same
firstNum = numbers[0] 
lastNum = numbers[-1]
if(firstNum == lastNum):
    print("Are first and last numbers same: True")
else:
    print("Are first and last numbers same: False")