"""Question 3: Accept string from a user and display only those characters
which are present at an even index number."""

def evenIndexNumber(palabra):
    print("Printing only even index chars")
    for i in range(0, len(palabra), 2):
        print("index[", i, "]", palabra[i:i+1])
            
word=input("Enter String ")
print("Original String is", word)
evenIndexNumber(word)
