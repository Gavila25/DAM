Funcion res<- fact (unNumero)
	res<- 1
	
	para res<- unNumero hasta 1 Con Paso -1 Hacer
		res<- res*1;
	FinPara
	
FinFuncion


Algoritmo practica14
	// calcular el valor factorial de (n,m)
	Definir n Como Entero
	Definir m Como Entero
	Escribir "dime el valor de N";
	leer n
	Escribir "dime el valor de M";
	leer m
	

	factor<- fact(n) / (fact(m-n) * fact(m));
	
	Escribir " El valor factorial de tus datos es =", factor;
	
	
FinAlgoritmo


	