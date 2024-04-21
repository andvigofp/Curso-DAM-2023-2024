def contar_apariciones(cadena):
    contador = {}
    for caracter in cadena:
        if caracter in contador:
            contador[caracter] += 1
        else:
            contador[caracter] = 1
    return contador

cadena = input("Ingresa una cadena: ")
print("Cadena ingresada:", cadena)  # Imprimir la cadena ingresada para asegurarnos de que se captura correctamente

apariciones = contar_apariciones(cadena)
print("Apariciones de cada carácter:")
print(apariciones)