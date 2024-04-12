#Algoritmo que pida un número y diga si es positivo, negativo o 0.

# Pedir al usuario que ingrese un número
numero = float(input("Ingrese un número: "))

# Verificar si el número es positivo, negativo o igual a cero
if numero > 0:
    print("El número es positivo.")
elif numero < 0:
    print("El número es negativo.")
else:
    print("El número 0.")