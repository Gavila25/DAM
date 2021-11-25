<p align="justify">
  
# Agenda Telefónica con XML

## Índice
1. Título
2. Índice
3. Proceso de realización y argumentos

## Proceso de realización y argumentos

Dado el enunciado del ejercicio. Cito del mismo “Diseñar un documento válido en XML que permita estructurar la información de una agenda de teléfonos, suponer que la información que podemos tener de una persona es su nombre y apellidos, su dirección y sus teléfonos, que pueden ser el teléfono de casa, el móvil y el teléfono del trabajo.”

Yo entiendo que tenemos que crear una etiqueta llamada “agenda”, donde pondremos los campos nombre, apellidos, dirección en la cree tres atributos llamados calle, número y piso, población para así poder separar la información por poblaciones en caso de ser necesario, al igual que con el campo provincia, el código postal y después de ello tendríamos los campos de los teléfonos, donde están almacenados el teléfono de casa, móvil y trabajo.

Con estos campos creados, en caso de tener que buscar la información de alguna persona en la agenda, podemos filtrarla por provincia, población y código postal para buscar el contacto deseado. 

```xml
  <?xml version="1.0" encoding="iso-8859-1"?>
<agenda>
	<contacto>
		<nombre> Guillermo Fco. </nombre>
		<apellidos> Avila Martín </apellidos>
		<direccion calle="Calle Valois" numero="11" piso="1"/> 
		<poblacion> Puerto de la Cruz </poblacion>
		<provincia> Santa Cruz de Tenerife </provincia>
		<codigo_postal> 38400 </codigo_postal>
		<telefonos>
			<telefono_casa> 922 38 99 72 </telefono_casa>
			<telefono_movil> 630 89 54 32 </telefono_movil>
			<telefono_trabajo> 922 87 97 19 </telefono_trabajo>
		</telefonos>
	</contacto>
</agenda>
```
  
</p>
