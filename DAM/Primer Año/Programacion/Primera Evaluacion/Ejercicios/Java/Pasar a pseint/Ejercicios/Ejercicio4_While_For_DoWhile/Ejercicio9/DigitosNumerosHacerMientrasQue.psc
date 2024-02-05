SubProceso DigitosNumerosDoWhile()
	Definir esLong, esNegativo, salirBucle Como Logico;
    Definir numero1, contadorDigitos Como Entero;
	
	
	Escribir ("Ingresa un número: ");
	Leer numero1;
	
	esLong = Falso;
    contadorDigitos = 0;
    salirBucle = Falso;
	
	Si numero1 > 2147483647 O numero1 < -2147483648 Entonces
        esLong = Verdadero;
        Escribir("El número ingresado es demasiado grande para un int. Introduce un número más pequeño.");
        salirBucle = Verdadero;
    FinSi
	
	Si No esLong Entonces
        // Inicializar variables
        esNegativo = Falso;
		
        // Verificar si el número es negativo
        Si numero1 < 0 Entonces
            esNegativo = Verdadero;
            numero1 = -numero1;
        FinSi
		
        // Contador de dígitos
        Hacer
            contadorDigitos = contadorDigitos + 1;
			
            // Verificar si el número es demasiado grande para un int
            Si contadorDigitos = 2147483647 Y No esLong Entonces
                Escribir("El número ingresado es demasiado grande para un Long. Introduce un número más pequeño");
                salirBucle = Verdadero; // Salir del bucle
            FinSi
			
            numero1 = numero1 / 10; // Utilizamos la operación de división
			
        Mientras Que (numero1 > 0) Y (No salirBucle)
		
        Si esNegativo Entonces
            contadorDigitos = contadorDigitos - 1;
        FinSi
		
        // Mostrar los resultados
        Escribir("El número ingresado tiene "), (contadorDigitos), (" dígitos.");
    FinSi
FinSubProceso


Proceso DigitosNumeros
	DigitosNumerosDoWhile();
FinProceso
