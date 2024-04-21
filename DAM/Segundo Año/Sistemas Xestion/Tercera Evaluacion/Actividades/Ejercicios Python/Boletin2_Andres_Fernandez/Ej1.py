# Escribe un programa que lea una cadena y devuelva un diccionario con la cantidad de apariciones
# de cada carácter en la cadena.

def contar_apariciones(cadena):
    # Creamos un diccionario vacío para almacenar las apariciones de cada carácter
    contador = {}

    # Recorremos cada carácter en la cadena
    for caracter in cadena:
        # Si el carácter ya está en el diccionario, aumentamos su contador
        if caracter in contador:
            contador[caracter] += 1
        # Si el carácter no está en el diccionario, lo agregamos con contador 1
        else:
            contador[caracter] = 1

    return contador

# Pedimos al usuario que ingrese una cadena
cadena = input("Ingresa una cadena: ")

# Llamamos a la función contar_apariciones y almacenamos el resultado en un diccionario
apariciones = contar_apariciones(cadena)

# Imprimimos el diccionario de apariciones
print("Aparaciones de cada caracter")
print(apariciones)