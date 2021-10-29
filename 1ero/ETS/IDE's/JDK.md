<p align="justify">

# Instalación JDK en Ubuntu
<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/OpenJDK_logo.svg/1280px-OpenJDK_logo.svg.png" width="300px">
  </p>


## Índice
1. [Introducción](#Introducción)
2. [Pasos a realizar](#Pasos-a-realizar)
3. [¿Como instalar una versión específica de Java?](#¿Como-instalar-una-versión-específica-de-Java?)
4. [Como cambiar de versión de Java](#Como-cambiar-de-versión-de-Java)

## 1- Introducción
Con esta simple y corta guía que encontraras a continuación podras realizar la instalación de Java JDK, al igual, que cambiar la versión de este para el sistema operativo Ubuntu (20.04)

## 2- Pasos a realizar

- Lo primero que debemos realizar es averiguar si tenemos instalado el Java mediante este comando:
```consola
java -version
 ```

- Acto seguido procederemos a comenzar la instalción de Java con este comando:
```consola
  sudo apt-get update
```  

- Instalamos Java con este comando y se nos instalará la ultima versión de Java:
```consola
  sudo apt-get install default-jdk
```  

- Comprobamos la versión de java una vez instalada.


## 3- ¿Cómo instalar una versión específica de Java?

Para instalar una versión especifica

- OpenJDK

- Versión 11
```consola
  sudo apt install openjdk-11-jdk
```  
- Versión 9
```consola
  sudo apt install openjdk-9-jre
```  
- Versión 8
```consola
  sudo apt install openjdk-8-jre
```

La versión con la que vamos a trabajar es la versión 8. Para ello debemos verificar la versión de java que se esta ejecutando con el comando:
```consola
  java -versión
```  
## 4- Como cambiar de versión de Java

Para saber las versiones con las que podemos contar usaremos este comando:

```consola
sudo update-alternative --config java
```
