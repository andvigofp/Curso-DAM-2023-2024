Algoritmo mostarOrdenCreciente
	//*Leer tres números y deducir si se han introducido en orden creciente.*//
	//*Variable*//
	Definir Numero1,Numero2,Numero3 Como Entero;
	//*Inicio*//
	Escribir ("Dimme tres Números");
	Leer Numero1,Numero2,Numero3;
	
	Si Numero1<Numero2 y Numero2<Numero3 Entonces
		Escribir ("En orden creciente"); //*Verdadero*//
	SiNo
		Escribir ("En orden no creciente"); //*Falso*//
	FinSi
	//*Fin*//
FinAlgoritmo
