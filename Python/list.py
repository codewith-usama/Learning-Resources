# list in python are mutable we can change the list
names = ["Usama", "Ahmed", "Arham", "Taha", "Bilal", "Ali"]
first_name = "Mohammad"
for name in names:
    print(first_name + ' ' + name)

Matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
for row in Matrix:
    for col in row:
        print(col)
    print()

number = [1, 2, 4, 12, 43, 1, 5, 6, 7, 8, 9,12, 33]
print(number)
number.append(12) #insert at the end of lost
print(number)
number.insert(0, 22) # insert at given position
print(number)
number.pop() # delete the last element

unique = []
for i in number:
    if i not in unique:
        unique.append(i)
unique.sort()
print(unique)
unique.reverse()
print(unique)
number2 = unique.copy()
print(number2)