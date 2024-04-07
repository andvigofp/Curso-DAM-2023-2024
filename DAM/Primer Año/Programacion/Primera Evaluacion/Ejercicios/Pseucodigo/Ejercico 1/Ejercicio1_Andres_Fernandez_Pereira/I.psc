Algoritmo diasSemanaConPara
	//*Repetir el ejercicio 8 pero utilizando un bucle FOR (PARA).*//
	//*Variable*//
	Definir dia Como Entero; //*Contador*//
	dia=0;
	//*Inicio*//
	Escribir ("Introduzca un número entre 1 y 7");
	Para dia <- 1 Hasta 7
		Leer dia;
		Segun dia Hacer
			caso 1:
				Escribir ("Lunes");
			Caso 2:
				Escribir ("Martes");
			Caso 3:
				Escribir ("Miercoles");
			Caso 4:
				Escribir ("Jueves");
			Caso 5:
				Escribir ("Viernes");
			Caso 6:
				Escribir ("Sabado");
			Caso 7:
				Escribir ("Domingo");
		FinSegun
		
	FinPara

	//*Fin*//
FinAlgoritmo
