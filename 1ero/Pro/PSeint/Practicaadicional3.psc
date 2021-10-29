Algoritmo Practicaadicional3
	Definir i, cantidadnumeros Como Entero;
	Definir mejordistancia, numeromascercano como entero;
	Definir distanciapropuesta, numeropropuesto como entero;
	
	mejordistancia<- 1000000;
	numeromascercano<- 0;
	
	Escribir "¿Cuantos datos quieres introducir?"
	leer cantidadnumeros
	
	i<- 0
	mientras i < cantidadnumeros
		Escribir "dame el número ", i+1
		leer num
		i<-+ i+1
		
	FinMientras
	
	Escribir "¿Cual es el numero más cercano?"
	leer numeromascercano
	
	distancia1<- abs (numeromascercano - num)
	
	si distancia1<= mejordistancia Entonces
		Escribir "esta es la menor distancia = " distancia1
	FinSi
	
FinAlgoritmo
