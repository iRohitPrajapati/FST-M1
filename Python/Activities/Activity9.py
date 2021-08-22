# Given lists
listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]
 
# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)

# Declare 3rd list
listThree = []

# Add first list
for num in listOne:
    if(num % 2 != 0):
        listThree.append(num)

# Append second list
for num in listTwo:
    if(num % 2 == 0):
        listThree.append(num)

# Print result
print("Final list: ", listThree)
