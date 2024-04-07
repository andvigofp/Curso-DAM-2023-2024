SubProceso NumeroCaptitua()
	Definir numero1, aux, inverso, cifra Como Entero;
	inverso =0;
	
	Escribir ("introduce números capitua");
	Leer numero1;
	
	aux = numero1;
	
	Mientras (aux <>0)
		cifra = aux Mod 10;
		inverso
	FinMientras
FinSubProceso

Proceso Capitua
	NumeroCaptitua();
FinProceso
