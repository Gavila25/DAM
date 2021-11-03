<p align="justify">

# Ejemplos en Git

  <p align="center">
    <img src="https://marcas-logos.net/wp-content/uploads/2020/03/GITHUB-LOGO-600x338.png" width="500px">
    </p>

# Índice
- [Título](#Ejemplos-en-Git)

- [Índice](#Índice)

- [Ejercicios](#Ejercicios-a-realizar)


# Ejercicios a realizar

### Paso previo para realizar el trabajo:

Primero debemos clonar el repositorio usando el comando:

```console
git clone https://github.com/jpexposito/libro.git
cd libro
```

Y nos dará este resultado:

 <p align="center">
    <img src="https://i.gyazo.com/3cd27f0d19c4bafbd886d5633a9b2112.png">
    </p>

### Ejercicio 1:
- Mostrar el historial de cambios del repositorio.
- Crear la carpeta capítulos y crear dentro de ella el fichero capitulo1.txt con el siguiente texto.
- 
```console
Git es un sistema de control de versiones ideado por Linus Torvalds.
```

- Añadir los cambios a la zona de intercambio temporal.
- Hacer un commit de los cambios con el mensaje Añadido capítulo 1.
- Volver a mostrar el historial de cambios del repositorio.

Para resolver esté ejercicio debemos poner en la consola esta seríe de comandos:

```console
> git log
> mkdir capitulos
> cat > capitulos/capitulo1.txt
Git es un sistema de control de versiones ideado por Linus Torvalds.
Ctrl+D
> git add .
> git commit -m "Añadido capítulo 1."
> git log
```
Output del primer git log:

 <p align="center">
    <img src="https://i.gyazo.com/d075a57cc0b7224eaf034c773fac0353.png">
  </p>
  
Output del mkdir capitulos:
<p align="center">
    <img src="https://i.gyazo.com/d3d053f6114604a35be6cda0bf24e2e0.png">
  </p>

Output del commit -m "Añadido del capítulo 1"
<p align="center">
    <img src="https://i.gyazo.com/da9e74a1a7f2a0ed133599f1cebfb250.png">
  </p>

Output del último git log:
<p align="center">
    <img src="https://i.gyazo.com/5141de528c347b5a30bd0d873e99e1c2.png">
  </p>

### Ejercicio 2
- Crear el fichero capitulo2.txt en la carpeta capítulos con el siguiente texto.

```console
El flujo de trabajo básico con Git consiste en: 1- Hacer cambios en el repositorio. 2- Añadir los cambios a la zona de intercambio temporal. 3- Hacer un commit de los cambios.
```
- Añadir los cambios a la zona de intercambio temporal.
- Hacer un commit de los cambios con el mensaje Añadido capítulo 2.
- Mostrar las diferencias entre la última versión y dos versiones anteriores.

La solución de este ejercicio serían esta serie de comandos:

```console
 > cat > capitulos/capitulo2.txt
 El flujo de trabajo básico con Git consiste en:
 1- Hacer cambios en el repositorio.
 2- Añadir los cambios a la zona de intercambio temporal.
 3- Hacer un commit de los cambios.
 Ctrl+D
 > git add .
 > git commit -m "Añadido capítulo 2."
 > git diff HEAD~2..HEAD
```
Output del cat > capitulos/capitulo2.txt:

<p align="center">
   <img src="https://i.gyazo.com/a6279b4babdd4ddbf33af6b871b2a98e.png">
</p>

Output del git commit:

<p align="center">
  <img src="https://i.gyazo.com/7a96c7df29a2edf14319448b9f413588.png">
</p>

Output del diff HEAD~2..HEAD

<p align="center">
  <img src="https://i.gyazo.com/0f5bf03d166f2d4c8c55b52ad36cf5b6.png">
  </p>

### Ejercicio 3:

- Crear el fichero capitulo3.txt en la carpeta capítulos con el siguiente texto.
```console
Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.
```

