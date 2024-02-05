SubProceso  MultiplosCincoZeroWhile()
	Definir numero1 Como Entero;
	numero1=0;
	Mientras numero1<=100 Hacer
		numero1=numero1+1;
		Si numero1 % 5==0
			Escribir ("Los multiplos de 5 son "),(numero1);
		FinSi
	FinMientras
FinSubProceso
	
Proceso MultiplosCincoZero
	MultiplosCincoZeroWhile();
FinProceso
