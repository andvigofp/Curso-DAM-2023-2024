SubProceso MostrarNumeroWhile()
	Definir numero1 Como Entero;
	numero1=320;
	
	Mientras numero1>=160 Hacer
		Escribir ("Los números son: "),(numero1);
		numero1 = numero1-20;
	FinMientras
FinSubProceso
	
Proceso MostrarNumero
	MostrarNumeroWhile();
FinProceso
