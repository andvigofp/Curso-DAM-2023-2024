#Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.


# Leer la cadena y la subcadena introducidas por el usuario
cadena = input("Ingrese una cadena: ")
subcadena = input("Ingrese una subcadena para comprobar si la cadena comienza con ella: ")

# Comprobar si la cadena comienza con la subcadena
if cadena.startswith(subcadena):
    print("La cadena comienza con la subcadena.")
else:
    print("La cadena no comienza con la subcadena.")