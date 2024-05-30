# Crea un programa que pida dos números enteros al usuario y diga si alguno de ellos es múltiplo del
# otro. Crea una función EsMultiplo que reciba los dos números, y devuelve si el primero es múltiplo
# del segundo.

def es_multiplo(num1, num2):
    # verificar si num1 es múltiplo de num2
    if num2 !=0 and num1 % num2 == 0:
        return True
    else:
        return False

# Solicitar al usuario que ingrese dos números enteros
num1 = int(input("Ingrese el primer número entero: "))
num2 = int(input("ingrese el segundo número entero: "))

# Verificamos si alguno de los números es múltiplo del otro
if es_multiplo(num1, num2):
    print(f"(num1) es múltiplo de (num2).")
elif es_multiplo(num2, num1):
    print(f"(num2) es múltiplo de (num1).")
else:
    print("Ninguno de los números es múltiplo del otro.")