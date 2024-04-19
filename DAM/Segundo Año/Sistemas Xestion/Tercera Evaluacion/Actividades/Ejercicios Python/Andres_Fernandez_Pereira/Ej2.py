#Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

# Solicitar al usuario que ingrese el nombre y los apellidos
nombre = input("Ingrese su nombre: ")
apellido1 = input("Ingrese su primer apellido: ")
apellido2 = input("Ingrese su segundo apellido: ")

# Obtener la inicial de cada parte del nombre y los apellidos
inicial_nombre = nombre[0]
inicial_apellido1 = apellido1[0]
inicial_apellido2 = apellido2[0]

# Mostrar las iniciales
print("Las iniciales son:", inicial_nombre + inicial_apellido1 + inicial_apellido2)