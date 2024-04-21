#Realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
#(comprendidas entre 0 y 10). A continuación, debe mostrar: todas las notas, la nota media,
#la nota más alta que ha sacado y la menor.

# Leer las 5 notas obtenidas por el alumno
notas = []
for i in range(5):
    nota = float(input(f"Ingrese la nota {i+1} (entre 0 y 10): "))
    while nota < 0 or nota > 10:
        print("La nota debe estar comprendida entre 0 y 10.")
        nota = float(input(f"Ingrese la nota {i+1} (entre 0 y 10): "))
    notas.append(nota)

# Mostrar todas las notas
print("Todas las notas obtenidas:", notas)

# Calcular la nota media
nota_media = sum(notas) / len(notas)
print("La nota media es:", nota_media)

# Encontrar la nota más alta y la menor
nota_mas_alta = max(notas)
nota_menor = min(notas)
print("La nota más alta obtenida es:", nota_mas_alta)
print("La nota menor obtenida es:", nota_menor)