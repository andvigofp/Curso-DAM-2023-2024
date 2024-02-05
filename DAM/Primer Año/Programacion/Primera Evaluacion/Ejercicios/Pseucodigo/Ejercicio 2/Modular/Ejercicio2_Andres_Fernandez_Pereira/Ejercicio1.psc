//**Funcion**//
Subproceso numeroDobleTriple()
	//Variable**//
	Definir Numero1, Double, Triple Como Entero;
	//**Inicio**//
	Escribir ("Introduce un número");
	Leer numero1;
		//*Operaciones*//
		Double=Numero1*2;
		Triple=Numero1*3;
		//*Operaciones*//
	Escribir ("El resultado de double es "), (Double) (" El resultado del triple es "), (Triple);
	//*Fin*//
FinSubProceso
	
Proceso NumeroDoubleTriple
	//*Para Iniciciar la funcion de Subprocesso*//
	numeroDobleTriple();
FinProceso
