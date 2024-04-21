#Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos.

# Inicializar variables para la suma y el contador de números
suma_numeros = 0
cantidad_numeros = 0

# Pedir al usuario que ingrese números hasta que se introduzca un cero
while True:
    numero = float(input("Ingrese un número (ingrese 0 para terminar): "))
    if numero == 0:
        break  # Salir del bucle si se ingresa un cero
    suma_numeros += numero
    cantidad_numeros += 1

# Calcular la media
if cantidad_numeros != 0:
    media = suma_numeros / cantidad_numeros
else:
    media = 0

# Imprimir la suma y la media de los números introducidos
print("La suma de los números es:", suma_numeros)
print("La media de los números es:", media)
