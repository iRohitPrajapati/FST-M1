# function to return sum of numbers in list
def calc_Sum(numbers):
  sum = 0
  for num in numbers:
    sum += int(num)
  return sum

# take user input
list_number = list(input("Enter series of numbers, separated by comma(,): ").split(','))

result = calc_Sum(list_number)
print("Sum of number is list: " + str(result))