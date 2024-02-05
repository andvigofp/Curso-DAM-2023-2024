SubProceso CajaFuerteDoWhile()
    Definir combinacionCorrecta, intentos, intento Como Entero;
    Definir combinacionCorrectaIngresada Como Logico;
    combinacionCorrecta = 1234;
    intentos = 4;
    combinacionCorrectaIngresada = Falso;
	
    Hacer
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
			
            Si intento <> combinacionCorrecta Entonces
                intentos = intentos - 1;
            FinSi
			
            Escribir("Te quedan "), (intentos), (" intentos");
        FinSi
    Mientras Que (intentos > 0) Y (No combinacionCorrectaIngresada);
	
    Si intentos = 0 Y No combinacionCorrectaIngresada Entonces
        Escribir("Se agotaron los intentos. La combinación correcta era: "), (combinacionCorrecta);
        Escribir("La caja fuerte permanece cerrada.");
    FinSi
FinSubProceso

Proceso CajaFuerte
    CajaFuerteDoWhile();
FinProceso