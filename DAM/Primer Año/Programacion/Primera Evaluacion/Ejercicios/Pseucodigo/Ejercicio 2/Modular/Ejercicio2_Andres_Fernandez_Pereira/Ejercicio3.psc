// **Funcion**//
SubProceso  areaFinca()
	// Variable
	Definir area,base,altura,perimetro,metros Como Real;
	// *Inicio*//
	Escribir ('Dime el area de una finca rectangular:')
	Escribir ('Dime el area')
	Leer base
	Escribir ('Dime el perimetro')
	Leer altura
	// **Operaciones**//
	area <- base*altura
	perimetro <- 2*base*2*altura
	metros <- perimetro
	// *Operaciones*//
	Escribir ('El resultado del aréa es: '),(area),(' del perimetro es: '),(perimetro),(' de los metros '),(metros)
	// *FIn*//
FinSubProceso

Proceso AreaDeFinca
	// *Para Iniciciar la funcion de Subprocesso*//
	areaFinca()
FinProceso

