"""Question 4: Given a string and an integer number n, remove characters
from a string starting from zero up to n and return a new string"""

def removeChars(word, cantidad):
    return word[cantidad:len(word)]

palabra=input("Inserte cadena al cual se le borraran los primeros caracteres: ")
value=int(input("Cuántos caracteres desea borrar?: "))
print("La nueva palabra es: ", removeChars(palabra, value))
