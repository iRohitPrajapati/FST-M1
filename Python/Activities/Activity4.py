# Get the users names
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")

# While loop
while True:
    # Get the users choices
    user1_ans = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
    user2_ans = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

    # Algorithm to see who wins
    if user1_ans == user2_ans:
        print("It's a tie")
    elif user1_ans == 'rock':
        if user2_ans == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_ans == 'scissors':
        if user2_ans == 'paper':
            print("Scissors wins!")
        else:
            print("Rock wins!")
    elif user1_ans == 'paper':
        if user2_ans == 'rock':
            print("Paper wins!")
        else:
            print("Scissors wins!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    # Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()

     # If they say yes, don't do anything
    if(repeat == "yes"):
        pass
    # If they say no, exit the game
    elif(repeat == "no"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit