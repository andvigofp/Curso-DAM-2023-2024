SubProceso CajaFuerteRandom()
	Definir combinacionCorrecta, intentos, intento Como Entero;
	Definir cominacionCorrectaIngresada Como Logico;
	//Generamos la combinación correcta de manera aleatoria entre 1000 y 9000
	combinacionCorrecta = Aleatorio(1000,9000);
	intentos = 4;
	cominacionCorrectaIngresada = Falso;
	
	Hacer
		Escribir ("Introduce la combinación de la caja fuerte (4 cifras):");
		Leer intento;
		
		Si intento = combinacionCorrecta Entonces
			Escribir ("La caja fuerte se ha abierto satisfactoriamente:");
			cominacionCorrectaIngresada = Verdadero;
		SiNo
			Si intento < combinacionCorrecta Entonces
				Escribir ("Número demasiado bajo. Intenta con ún número más alto.");
			SiNo
				Escribir ("Número demasiado alto. Intenta con número más bajo.")
			FinSi
			
			Si intento <> combinacionCorrecta Entonces
				intentos = intentos -1;
			FinSi
			Escribir ("Te quedan "),(intentos), (" intentos");
		FinSi
	Mientras Que (intentos > 0) y (No cominacionCorrectaIngresada)
	
	Si (intentos = 0) y (No cominacionCorrectaIngresada) Entonces
		Escribir ("Se agotarón los intentos. La combinación correcta era: "), (combinacionCorrecta);
		Escribir ("La caja fuerte permanece cerrada");
	FinSi
FinSubProceso

Proceso CajaFuerte 
	CajaFuerteRandom();
FinProceso
	