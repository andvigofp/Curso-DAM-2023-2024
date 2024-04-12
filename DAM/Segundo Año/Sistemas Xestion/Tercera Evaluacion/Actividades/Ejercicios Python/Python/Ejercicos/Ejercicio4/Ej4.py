#Algoritmo que pida tres números y los muestre ordenados (de mayor a menor)

# Pedir al usuario que ingrese tres números
num1 = float(input("Ingrese el primer número: "))
num2 = float(input("Ingrese el segundo número: "))
num3 = float(input("Ingrese el tercer número: "))

# Ordenar los números de mayor a menor utilizando la función sorted
numeros_ordenados = sorted([num1, num2, num3], reverse=True)

# Mostrar los números ordenados
print("Los números ordenados de mayor a menor son:", numeros_ordenados)