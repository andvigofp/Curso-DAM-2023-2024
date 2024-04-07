SubProceso  CajaFuerteWhile()
	Definir combinacionCorrecta, intentos, intento Como Entero;
	Definir combinacionIncorrectaIngresada Como Logico;
	intentos = 4;
	combinacionCorrecta = 1234;
	combinacionCorrectaIngresada = Falso;
	
	Mientras (intentos > 0 y No combinacionCorrectaIngresada) Hacer
		Escribir ("Introduce la combinación de la caja fuerte (4 cifras): ");
		Leer intento;
		
		Si intento= combinacionCorrecta Entonces
			Escribir ("La caja fuerte se abierto satisfactoriamente");
			combinacionCorrectaIngresada = Verdadero;
			
		SiNo
			Si intento < combinacionCorrecta Entonces
				Escribir ("Número demasiado bajo. Intenta con número más alto.");
			SiNo
				Escribir ("Número demasiado alto. Intenta con número más bajo.")
			FinSi
			
			Si intentos <> combinacionCorrecta Entonces
				intentos = intentos -1;
			FinSi
			Escribir ("Te quedan "), (intentos), (" intentos");
		FinSi
		
	FinMientras
	
	Si (intentos = 0) Y (No combinacionCorrectaIngresada) Entonces
		Escribir ("Se agogarón los intentos. La combinación correcta era : "), (combinacionCorrecta);
		Escribir ("La caja fuerte permanece cerrada.");
		
	FinSi
FinSubProceso
	
Proceso CajaFuerte
	CajaFuerteWhile();
FinProceso
