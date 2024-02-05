SubProceso CajaFuerteFor()
	Definir CombinacionCorrecta, intentos Como Entero;
	Definir CombinacionCorrectaIngresada Como Logico;
	CombinacionCorrecta = 1234;
	intentos = 4;
	CombinacionCorrectaIngresada = Falso;
	
	Para intentos = 4 Hasta 1 Con Paso -1 Hacer
		Escribir("Introduce la combinación de la caja fuerte (4 cifras):");
		Leer intento;
		
		Si intento = combinacionCorrecta Entonces
			Escribir("La caja fuerte se ha abierto satisfactoriamente");
			combinacionCorrectaIngresada = Verdadero;
		Sino
			Si intento < combinacionCorrecta Entonces
				Escribir("Número demasiado bajo. Intenta con un número más alto.");
			Sino
				Escribir("Número demasiado alto. Intenta con un número más bajo.");
			FinSi
			
			Escribir("Te quedan "), (intentos - 1), (" intentos");
		FinSi
	FinPara

	
    Si intentos=0 Y No combinacionCorrectaIngresada Entonces
        Escribir("Se agotaron los intentos. La combinación correcta era: "), (combinacionCorrecta);
        Escribir("La caja fuerte permanece cerrada.");
    FinSi
	
FinSubProceso

Proceso CajaFuerte
	CajaFuerteFor();
FinProceso
	