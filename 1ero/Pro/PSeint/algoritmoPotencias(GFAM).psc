Algoritmo algoritmoPotencias
	
	Definir num, divisor, i, contador Como Entero;

	Escribir "introduce un numero";
	leer num;
	divisor=2;
	Escribir "su numero descompuesto es:";

	para divisor=2 hasta num con paso 1 Hacer
		contador=0;
		Mientras  num mod divisor==0 Hacer
			
			num= num/divisor;
			
			contador=contador+1;
			
		FinMientras
		
		si contador >0 Entonces
			Escribir Sin Saltar divisor,"^", contador," * ",  ;
			divisor= divisor+1;
		FinSi
		
	FinPara
	
	Escribir 1;
FinAlgoritmo
