//**Funcion**//
SubProceso salarioEmpregado()
	//**Variable*//
	Definir salario, reducion Como Real;
	//*Inicio*//
	Escribir ("Dime un salario de un empleado");
	Leer salario;
		//*Calcular la redución del salario de un emplegado*//
		reducion=salario*0.8;
	Escribir ("La reteción del salario del empleado es: "), (reducion);
	//*Fin*//
FinSubProceso

Proceso reducionSalario
	//*Para Iniciciar la funcion de Subprocesso*//
	salarioEmpregado();
FinProceso
	