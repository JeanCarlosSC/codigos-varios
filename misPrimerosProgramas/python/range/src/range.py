print("Printing current and previous number sum in a given range(10)")
b=0
for i in range(10):
    if(i>0):
        b=i-1
    c=i+b
    print("Current Number", i,"Previous Number", b, "Sum:", c)
