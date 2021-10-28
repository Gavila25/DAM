Algoritmo Practica8
	Definir num1,num2 Como Entero;
	Definir cuadrado1 como entero;
	
	Escribir "Dame el primer valor";
	leer num1;
	Escribir "Dame el segundo valor";
	leer num2;
	
	cuadrado1<-num1*num1;
	
	si cuadrado1=num2 Entonces
		Escribir "El segundo es el cuadrado exacto del primero";
	SiNo 
		si cuadrado1 < num2 Entonces
			Escribir "El segundo es menor que el cuadrado del primero";
		sino 
			si cuadrado1 > num2 entonces
				Escribir "El segundo es mayor que el cuadrado del primero";
			FinSi
			
		FinSi
	FinSi
	
	
FinAlgoritmo

