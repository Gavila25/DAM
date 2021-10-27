# Instalación JDK en Ubuntu

### Realizado por: Guillermo Francisco Avila Martín

## Índice 
1. Introducción
2. Pasos a realizar
3. ¿Como instalar una versión especifica de Java?
4. Como cambiar de versión de Java

## 1- Introducción
Con esta simple y corta guía que encontraras a continuación podras realizar la instalación de Java JDK, al igual, que cambiar la versión de este para el sistema operativo Ubuntu (20.04)

## 2- Pasos a realizar

- Lo primero que debemos realizar es averiguar si tenemos instalado el Java mediante este comando:
```
java -version 
 ```
  <img src="JAVA JDK/Practica 1 JDK (2).png" alt="Captura de la función del comando" width="50%" height="60%">
  
- Acto seguido procederemos a comenzar la instalción de Java con este comando:
```
  sudo apt-get update
```  
  <img src="JAVA JDK/Practica 1 JDK (3).png" alt="Captura de la función del comando" width="50%" height="60%">
  
- Instalamos Java con este comando y se nos instalará la ultima versión de Java:
```
  sudo apt-get install default-jdk
```  
  <img src="JAVA JDK/Practica 1 JDK (4).png" alt="Captura de la función del comando" width="50%" height="60%">
  
- Comprobamos la versión de java una vez instalada.

  <img src="JAVA JDK/Practica 9 JDK lista de versiones (2).png" alt="Captura de la función del comando" width="50%" height="60%">
  
## 3- ¿Cómo instalar una versión específica de Java?

Para instalar una versión especifica

- OpenJDK

- Versión 11
```
  sudo apt install openjdk-11-jdk
```  
- Versión 9
```
  sudo apt install openjdk-9-jre
```  
- Versión 8
```
  sudo apt install openjdk-8-jre
``` 
  <img src="JAVA JDK/Practica 9 JDK lista de versiones (3).png" alt="Captura de la función del comando" width="50%" height="60%">
  
La versión con la que vamos a trabajar es la versión 8. Para ello debemos verificar la versión de java que se esta ejecutando con el comando:
```
  java -versión
```  
## 4- Como cambiar de versión de Java

Para saber las versiones con las que podemos contar usaremos este comando:
```
sudo update-alternative --config java
```
<img src="JAVA JDK/Solucion problema nano Practica 10 (2).png" alt="Captura de la función del comando" width="50%" height="60%">


  
