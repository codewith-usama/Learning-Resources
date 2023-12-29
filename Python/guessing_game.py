# Guessing Game in Python
import random
import os
from time import sleep

number = 0
random_number = 0
while(True):
    random_number = random.randint(1, 50)
    numbers = int(input("Guess(1-50): "))
    if numbers > random_number:
        print("Entered num is greater than Secret num.")
    elif numbers < random_number:
        print("Entered num is smaller than Secret num.")
    else:
        print("Congrats!! You Won the game")
        break
    sleep(2)
    os.system('cls')


