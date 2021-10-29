Algoritmo Practica15
	Definir SIZEARRAY Como Entero;
	Definir almacen como entero;
	Definir i Como Entero;
	definir minimo, maximo, suma Como Entero;
	Definir cantidadnotas, nota Como Entero;
	
	Escribir "Cuantas notas quieres escribir";
	leer cantidadnotas
	suma=0;
	
	Dimension almacen[cantidadnotas];
	
	para i=0 hasta cantidadnotas -1 Con Paso 1 Hacer
		Escribir "dame una nota: ";
		leer nota;
		almacen[i] = nota;
		suma= suma + almacen[i];
	FinPara
	
	minimo= almacen[0];
	maximo= almacen[0];
	suma=0;
	
	para i=0 hasta cantidadnotas -1 Con Paso 1 Hacer
		suma=suma + almacen [i];
		si almacen[i]< minimo Entonces
			minimo=almacen[i];
		FinSi
	FinPara
	
	Escribir "La media de las notas es: ", suma/cantidadnotas;
	Escribir "la nota mínima es:", minimo;
	Escribir "la nota máxima es:", maximo;
	
	
FinAlgoritmo
