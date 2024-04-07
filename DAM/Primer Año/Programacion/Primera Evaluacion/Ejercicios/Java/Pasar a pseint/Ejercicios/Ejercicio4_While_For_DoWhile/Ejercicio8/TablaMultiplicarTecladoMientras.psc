SubProceso TablaMultiplicarTecladoWhile()
	Definir numero1, i, resultado Como Entero;
	i=1;
	
	Escribir ("Ingresa un número");
	Leer numero1;
	
	Mientras (i<=10) Hacer
		resultado = numero1*i;
		Escribir (numero1), (" x "), (i), (" = "), (resultado);
		i = i+1;
	FinMientras
FinSubProceso
	
Proceso TablaMultiplicarTeclado
	TablaMultiplicarTecladoWhile();
FinProceso
