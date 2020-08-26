def sumar(a, b):
    c=a+b
    return c
def restar(a, b):
    c=a-b
    return c
def multiplicar(a, b):
    c=a*b
    return c
def dividir(a, b):
    c=a/b
    return c
def main():
    print("-------------------------------------------")
    print("Desea realizar otro càlculo?")
    print("[1] Si")
    print("[2] No")
    operacion = int(input(": "))
    if(operacion==1):
        print("-------------------------------------------")
        operar()
    else:
        finalizar()
def operar():
    num1 = int(input("Ingrese numero 1: "))
    num2 = int(input("Ingrese numero 2: "))
    print("-------------------------------------------")
    print("Seleccione operacion")
    print("[1] sumar")
    print("[2] restar")
    print("[3] multiplicar")
    print("[4] dividir")
    operacion = int(input(": "))

    if(operacion==1):
        resultado = sumar(num1, num2)
    elif(operacion==2):
        resultado = restar(num1, num2)
    elif(operacion==3):
        resultado = multiplicar(num1, num2)
    elif(operacion==4):
        resultado = dividir(num1, num2)
    else:
        resultado = "null"
        
    if(operacion==1):
        operacion="+"
    elif(operacion==2):
        operacion="-"
    elif(operacion==3):
        operacion="•"
    elif(operacion==4):
        operacion="%"
        
    print("-------------------------------------------")
    print(num1, operacion, num2, "=", resultado)
    main()
def finalizar():
    print("-------------------------------------------")
    print("Gracias por usar esta calculadora")
    print("-------------------------------------------")
    
print("-------------------------------------------")
print("Bienvenido a la calculadora bàsica")
operar()

