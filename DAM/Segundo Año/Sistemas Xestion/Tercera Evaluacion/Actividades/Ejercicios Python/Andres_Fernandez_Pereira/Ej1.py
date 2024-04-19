# Ejercicio 1
# Un alumno desea saber cual será su calificación final en la materia de Matemáticas. Dicha
# calificación se compone de los siguientes porcentajes:
#  55% del promedio de sus tres calificaciones parciales.
#  30% de la calificación del examen final.
#  15% de la calificación de un trabajo final.

# Definición de la función para calcular la calificación final
def calcular_calificacion_final(promedio_parciales, examen_final, trabajo_final):
    # Definición de los porcentajes para cada componente de la calificación final
    porcentaje_parciales = 0.55
    porcentaje_examen_final = 0.3
    porcentaje_trabajo_final = 0.15

    # Cálculo de la calificación final utilizando los porcentajes definidos
    calificacion_final = (promedio_parciales * porcentaje_parciales) + (examen_final * porcentaje_examen_final) + (trabajo_final * porcentaje_trabajo_final)

    # Se devuelve la calificación final calculated
    return calificacion_final

# Solicitar al usuario que ingrese las calificaciones de los parciales, examen final y trabajo final
parcial1 = float(input("Ingrese la calificación del primer parcial: "))
parcial2 = float(input("Ingrese la calificación del segundo parcial: "))
parcial3 = float(input("Ingrese la calificación del tercer parcial: "))
examen_final = float(input("Ingrese la calificación del examen final: "))
trabajo_final = float(input("Ingrese la calificación del trabajo final: "))

# Calcular el promedio de los parciales
promedio_parciales = (parcial1 + parcial2 + parcial3) / 3

# Llamar a la función para calcular la calificación final y almacenar el resultado
calificacion_final = calcular_calificacion_final(promedio_parciales, examen_final, trabajo_final)

# Imprimir la calificación final del alumno en Matemáticas
print("La calificación final del alumno en Matemáticas es:", calificacion_final)