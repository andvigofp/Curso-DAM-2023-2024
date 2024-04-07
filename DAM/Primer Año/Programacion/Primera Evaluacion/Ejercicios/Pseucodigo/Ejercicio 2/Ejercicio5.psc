Algoritmo valorNumerico
	//*Variable*//
	Definir x, i, aux Como Entero;
	//*Inicio*//
	Escribir "Dime un número 1";
	Leer x;
	Escribir "Dime el número 2";
	Leer i;
	Escribir ("El valor de "), (x), (" y de la "), (i) 
		//*Para guardar un valor en en la variable auxiliar*//
		aux=x;
		x=i;
		i=aux;
	Escribir ("El intercambio de la variable "), (x), (" y de la "), (i);
	//*Fin*/
FinAlgoritmo
