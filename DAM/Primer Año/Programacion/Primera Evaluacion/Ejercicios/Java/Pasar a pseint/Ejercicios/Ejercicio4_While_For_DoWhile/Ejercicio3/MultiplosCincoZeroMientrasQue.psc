SubProceso MultiplosCincoZeroDoWile()
	Definir numero1 Como Entero;
	numero1=0; //Contador
	//Bucle Repetir
	Hacer
		Si numero1 %5==0
			Escribir ("Los múltiplos de 5 son "),(numero1);
		FinSi
		numero1 = numero1+1;
	Mientras Que (numero1<=100) 
FinSubProceso
	
Proceso MultiplosCincoZero
	MultiplosCincoZeroDoWile();
FinProceso
