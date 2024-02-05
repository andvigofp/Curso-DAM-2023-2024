// /**Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for

SubProceso  MultiplosCincoZeroFor()
	Definir numero1,resultado Como Entero;
	
	Para numero1 Desde 0 Hasta 100 Hacer
		Si numero1 %5==0
			Escribir ("Los mútiplos de cinco son "),(numero1);
		FinSi
		
	FinPara
FinSubProceso
	
Proceso MultiplosCincoZero 
	MultiplosCincoZeroFor();
FinProceso
