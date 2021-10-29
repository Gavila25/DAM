Algoritmo PracticaMCM
	Definir num1,num2, valormultiplicado como entero;
	Definir mcm Como Entero;
	
	Escribir "Dame el primer valor";
	leer num1;
	
	Escribir "Dame el segundo valor";
	leer num2;
	
	mcm=0;
	i=0;
	
	mientras mcm=0 Hacer
		i=i+1;
		si i mod num1 = 0 y i mod num2 = 0 Entonces
			mcm=i;
		FinSi
	FinMientras
	
	Escribir "El resultado es", " ", mcm;
	
FinAlgoritmo
