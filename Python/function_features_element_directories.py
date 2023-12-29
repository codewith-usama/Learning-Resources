# tuple in python are immutable we cannot change them
name = ("Usama", "Ahmed", "Taha")
# name.append() # throw an error
#  only two methos index and count can be used in tuple
print("Tuples")
print(name.count("Usama"))
print(name.count("Ahmed"))
print(name.index("Taha"))

# unpacking
cordinates = (12, 32, 21)
x, y, z = cordinates
print("Unpacking in Tuples")
print(x,y,z)
print(' ')
# Dictionaries
person = {"Usama": 19, "Ahmed": 18, "Arham": 16, "Taha": 12}
print(' ')
print("Dictionaries in python")
print(person.values())
print(person["Ahmed"])
person["Bilal"] = 20
print(person.values())

print(' ')
num = input("Enter a number: ")
num_dict = {
    "0": "zero",
    "1": "one",
    "2": "two",
    "3": "three",
    "4": "four",
    "5": "five",
    "6": "six",
    "7": "seven",
    "8": "eight",
    "9": "nine"
}
output = ""
for i in num:
    output += num_dict.get(i, "!") + ' '
print(output)
print(' ')

# emoji converter
message = input(">")
words = message.split(' ')
emojis =  {
    ":)": "😊",
    ":(": "☹"
}
output = ""
for word in words:
    output += emojis.get(word, word) + ' '
print(output)


def greeting(fname, lname):
    print(f'Hello {fname} {lname}, welcome to our team')

print(' ')
print("Start")
greeting(lname="Usama", fname="Mohammad")
print("End")
print(' ')