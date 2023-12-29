try:
    age = int(input("Enter ur age: "))
    print(age)
except ZeroDivisionError:
    print("age cannot be zero")
except ValueError:
    print("Invalid Value")