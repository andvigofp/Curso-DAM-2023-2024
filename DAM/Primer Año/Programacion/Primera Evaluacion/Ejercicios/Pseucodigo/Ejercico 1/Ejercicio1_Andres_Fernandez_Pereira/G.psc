Algoritmo mostarqIgualesVerdadero
	//*Pedir dos valores y en caso de que no sean iguales indicar cuál es el mayor*//
	//**Variable//
	Definir Numero1,Numero2 Como Entero;
	//*Inicio*//
	Escribir ("Dime dos números");
	Leer Numero1,Numero2;
	Si Numero1==Numero2 Entonces
		Escribir ("Son Iguales");
	SiNo
		Si Numero1>Numero2 Entonces
			Escribir ("El número mayor es "), (Numero1);
		SiNo
			Escribir ("El número mayor es "), (Numero2);
		FinSi
	FinSi
	//*Fin*//
FinAlgoritmo
