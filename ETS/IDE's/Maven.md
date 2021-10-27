# Instalación de Maven en el SO Ubunut (20.04)

## Índice

- Titulo
- Índice
- Introducción
- Pasos a Realizar

## Introducción
Con este tutorial escrito acompañado de algunas imágenes, veremos cómo realizar la instalación de apache maven en Ubuntu. Esta es una herramienta de gestión y comprensión de código abierto que se utiliza principalmente para proyectos Java.

## Pasos a Realizar

- Primero para empezar la instalación usariamos el proceso apt:
```
sudo apt update
```  
   Y nos saldría algo como en esta imagen:
  
   <img src="Maven/sudo apt update.png"  width="70%" height="80%">
  
 - Luego usaremos el comando:
 ```
 sudo apt install maven
 ```
   En nustra consola se vería como la imagen adjunta:
    
   <img src="Maven/sudo apt install maven.png"  width="70%" height="80%">
   
  - Para verificar la instalación del programa y ver la versión instalada usamos el comando:
  ```  
  mvn -version 
  ```
  
   Y este nos diría que version tenemos instalada como en la imagen:
   
   <img src="Maven/mvn -version.png"  width="70%" height="80%">
   
 - Con estó dariamos por finalizada la instalación de Maven en el SO.
   
    
