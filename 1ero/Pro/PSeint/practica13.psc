Algoritmo practica13
		Definir num1, num2, num4, num6, num10 Como Entero;
		Escribir "presiona F para iniciar el programa";
		Definir f Como Caracter;
		leer f;
		Escribir " Escribe los numeros que necesitas";
		leer num1;
		leer num2;
		leer num4;
		leer num6;
		leer num10;
		
		Definir distancia12, distancia24, distancia26, distancia210  Como Entero;
		
		distancia12<- abs(num2-num1);
		distancia24<- abs(num4-num2);
		distancia26<- abs(num6-num2);
		distancia210<- abs(num10-num2);
		
		Si distancia12<=1 Entonces
			Escribir "Esta es la distancia más corta es =" , distancia12;
		SiNo
			
			si distancia24 <=1 Entonces
				Escribir "Esta es la distancia más corta es =", distancia24;
			SiNo
				
				si distancia26 <= 1 Entonces
					Escribir "Esta es la distancia más corta es =", distancia26;
				SiNo
					
					si distancia210 <= 1 Entonces
						Escribir "Esta es la distancia más corta es =", distancia210;
					FinSi
				FinSi
			FinSi
		FinSi
		
FinAlgoritmo
