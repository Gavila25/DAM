Algoritmo Practica17
	Definir SIZEARRAY Como Entero;
	Definir i, j Como Entero;
	Definir num Como Entero;
	Definir array Como Entero;
	Definir  maximo1, maximo2, suma Como Entero;
	
	Escribir "Cuantos numeros quieres introducir?";
	leer j;
	SIZEARRAY=j;
	
	Dimension array[SIZEARRAY];
	
	i<-1;
	
	Mientras i <= SIZEARRAY Hacer
		
		Escribir "Introduce el numero " i;
		
		leer num;
		
		array[i]=num;
		
		i<- i+1;
		
	FinMientras
	
	maximo1=array[1];
	maximo2=array[2];
	
	si maximo2 > maximo1 Entonces
		maximo1=array[2];
		maximo2=array[1];
	FinSi
	
	Para i = 3 Hasta SIZEARRAY Con Paso 1 Hacer
		
		si array[i] > maximo1 Entonces
			
			maximo2=maximo1;
			
			maximo1=array[i];
			
		SiNo
			
			si array[i] > maximo2 Entonces
				maximo2=array[i];
			FinSi
			
		FinSi
		
		
	FinPara
	
	Escribir "El numero maximo es: ", maximo1, " y ", maximo2;
FinAlgoritmo
