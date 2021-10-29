Funcion resultado<- mcd (n,m)
	
	Definir resto, resto1, resultado Como Entero;

	resto=1;
	divisor = m;
	dividendo=n;
	resultado=0;
	mientras resto <>0 Hacer
		
		resto= dividendo mod divisor;
		
		si resto = 0 Entonces
			
			resultado=divisor;
			
		SiNo
			dividendo=divisor;
			divisor=resto;
			
		FinSi
		
	FinMientras
FinFuncion







Algoritmo PracticaMinimosyMaximoComunDivisor
	
	Escribir mcd(20,30);
	
FinAlgoritmo
