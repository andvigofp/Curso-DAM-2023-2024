Algoritmo numerosUnoHasta100
	//*Escribir los números del 1 al 100*//
	//*Variable/*/
	Definir Opciones, Numero1 Como Entero;
	//*Inicio*//
	Escribir ("Número 1 Hasta cien");
	Opciones=1; //*Contador*//
	Mientras Opciones=1 o Opciones=2 o Opciones=3  Hacer
		Escribir ("--------------------");
		Escribir ("1 - Blucle Mientras");
		Escribir ("2 - Blucle Repetir");
		Escribir ("3 - Blucle Para");
		Escribir ("4- Salir");
		Leer Opciones;
		
		segun Opciones Hacer
			Opcion 1:
			Numero1=1;//*Contador*//
			//*Blucle Mientras*//
			Mientras Numero1 <= 100 Hacer
				Escribir Numero1;
				Numero1=Numero1+1;
			FinMientras
		Opcion 2:
			//*Inicio*//
			Numero1=0; //*Contador*//
			//*Blucle Repetir*//
			Repetir
				Numero1=Numero1+1;
				Escribir Numero1;
			Hasta Que Numero1==100
			
		Opcion 3:
			//*Inicio*//
			Numero1=0; //*Contador*//
			//*Bucle Para*//
			Para Numero1 Desde 1 Hasta 100
				Escribir Numero1;
			FinPara
		Opcion 4:
			Opciones=4;
			Escribir "Salir";
	FinSegun
FinMientras



	
	
	
FinAlgoritmo
