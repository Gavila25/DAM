Algoritmo sin_titulo
	Definir usuario Como Caracter
	Definir contrasenia Como Caracter
	
	usuario<- "alumno"
	contrasenia<- "1q2w3e4r"
	
	Escribir " Cual es tu usuario";
	leer user
	
	Escribir " Cual es tu contraseña";
	leer password
	
	mientras user <> usuario o password <> contrasenia Hacer
		Escribir "No podras pasar!"
		
		Escribir " Cual es tu usuario";
		leer user
		
		Escribir " Cual es tu contraseña";
		leer password
	FinMientras
	
	si user = usuario o password = contrasenia Entonces
		Escribir " Si podras pasar!"
	FinSi
FinAlgoritmo
