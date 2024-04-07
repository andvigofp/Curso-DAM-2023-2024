SubProceso MostrarNumeroDoWhile()
	Definir numero1 Como Entero;
	numero1=320;
	Hacer
		Escribir ("Los números son: "), (numero1);
		numero1=numero1-20;
	Mientras Que (numero1>=160)
FinSubProceso
	
Proceso MostrarNumero 
	MostrarNumeroDoWhile();
FinProceso
