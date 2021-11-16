subAlgoritmo  mostrarArray ( matriz , SIZE)
	definir i como entero;
	escribir "contenido del array: ";
	Para i<-0 Hasta SIZE - 1 Con Paso 1 Hacer
		escribir  "[",i,"]=>",matriz[i];
	Fin Para	
	
Fin SubAlgoritmo


SubAlgoritmo rellenarArray( matriz, SIZE)
	definir i como entero;
	
	Para i<-0 Hasta SIZE - 1 Con Paso 1 Hacer
		matriz[i]=azar(30);
	Fin Para		
FinSubAlgoritmo


Algoritmo ProbandoMostrarArray
	
	definir array, SIZEARRAY Como Entero;
	definir txt como Texto;
	SIZEARRAY = 10;
	Dimension array[SIZEARRAY];
	
	rellenarArray(array,SIZEARRAY);
	mostrarArray(array, SIZEARRAY);
	
	
FinAlgoritmo