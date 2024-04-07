SubProceso TablaMultiplicarTecladoDoWhile()
	Definir numero1, i, resultado Como Entero;
	i=1;
	
	Escribir ("Ingresa un número");
	Leer numero1;
	
	Hacer
		resultado = numero1*i;
		Escribir (numero1), ( " X "), (i), (" = "), (resultado);
		i = i+1;
	Mientras Que (i<=10) 
FinSubProceso
	
Proceso TablaMultiplicar
	TablaMultiplicarTecladoDoWhile();
FinProceso
