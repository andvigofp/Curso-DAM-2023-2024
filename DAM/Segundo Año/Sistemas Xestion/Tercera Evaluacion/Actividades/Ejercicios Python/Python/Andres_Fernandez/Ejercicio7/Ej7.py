#Suponiendo que hemos introducido una cadena por teclado que representa una frase
#(palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.

# Leer la cadena que representa una frase introducida por el usuario
frase = input("Ingrese una frase: ")

# Dividir la frase en palabras utilizando el espacio como delimitador y contar el número de palabras
palabras = frase.split()
cantidad_palabras = len(palabras)

# Imprimir la cantidad de palabras en la frase
print("La frase ingresada tiene", cantidad_palabras, "palabras.")