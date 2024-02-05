Algoritmo areaFinca
	//Variable
	Definir area, base, altura, perimetro, metros Como Real;
	//*Inicio*//
	Escribir ("Dime el area de una finca rectangular:");
	Leer  base, altura, perimetro;
		//**Formula para calcular el area de una finca rectangular**//
		area=base*altura;
		perimetro= 2*base*2*altura;
		metros=perimetro;
	Escribir ("El resultado del aréa es: "), (area), (" del perimetro es: "), (perimetro), ( " de los metros "), (metros);
	//*FIn*//
FinAlgoritmo
