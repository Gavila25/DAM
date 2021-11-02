<p align="justify">

# Manipulación básica en Git
  
  <p align="center">
    <img src="https://camo.githubusercontent.com/9fbedc2501abc815d658907b40c845ead488c349ba1d3a2c4e0c5b6fb8020290/68747470733a2f2f6c6f676f732d6d61726361732e636f6d2f77702d636f6e74656e742f75706c6f6164732f323032302f31312f4769744875622d4c6f676f2e706e67" width="500px">
  </p>
  
# Índice
- [Título](#Manipulación-básica-en-Git)
- [Índice](#Índice)
- [Pasos a Realizar](#Pasos-a-Realizar)

# Pasos a Realizar

### Tarea Configuración
Primero configuraremos Git con los comandos:

```console
  git config --global user.name "Your-Full-Name"
  git config --global user.email "your-email-address"
  git config --global color.ui auto
  git config --list
```
Output de la consola:

<p align="center">
  <img src="https://i.gyazo.com/4fb641de887534cd97040ba0f8607994.png" width="500px">
</p>

### Tarea: Creación de un repositorio

Ahora crearemos un repositorio a través de la consola con estos comandos:

```console
 mkdir dpl
 cd dpl
 git init
 ls -la
```
Output de la consola:

<p align="center">
  <img src="https://i.gyazo.com/b4744ee30a1cf8c58738f69e62a5f0f3.png" width="500px">
</p>

### Tarea Comprobar el estado del repositorio:

- Primero utilizaremos este comando para revisar el estado del repositorio:

```console
Git status
```
Output de la consola:

<p align="center">
  <img src="https://i.gyazo.com/5a557e059582f61fa65cc66ea64aabd7.png" width="500px">
</p>

- Crear un fichero indice.txt con el siguiente contenido:
  - Capítulo 1: Instalación de Git por el alumno XXX (donde XXX es el nombre del alumno)
  - Capítulo 2: Flujo de trabajo básico

Para esto usaremos:
```console
cat > indice.txt
Capítulo 1: Instalación de Git por el alumno XXX
Capítulo 2: Flujo de trabajo básico
```
Y debería aparecer lo siguiente:

<p align="center">
  <img src="https://i.gyazo.com/bfb950bea9fd01e3eee1075714745a27.png" width="500px">
</p>

- Comprobar de nuevo el estado del repositorio

Hacemos un git status

Y deberá decirnos esto:
<p align="center">
  <img src="https://i.gyazo.com/9cc046b7ac64f9a90910fabcbf99dac3.png" width="500px">
</p>

Añadir el fichero a la zona de intercambio temporal

Usamos el comando 
```console
git add indice.txt
```

Por último vemos el estado del repositorio

```console
Git status
```

Y deberá decirnos esto:
  
<p align="center">
  <img src="https://i.gyazo.com/7185e76df46366d558462fca9b5bc946.png" width="500px">
</p>

### Tarea Realizando Commit´s

- Realizaremos un Commit de los últimos cambios donde pondremos Añadido índice de la asignatura DPL.
```console
git commit -m "Añadido índice de la asignatura DPL."
git status
```
Output de la consola:

<p align="center">
  <img src="https://i.gyazo.com/836f5ba175a05ccd67b95646e396cb91.png" width="500px">
</p>

### Tarea Modificación de ficheros

- Cambiar el fichero indice.txt para que contenga lo siguiente:
  - Capítulo 1: Instalación de Git por el alumno XXX (donde XXX es el nombre del alumno)
  - Capítulo 2: Flujo de trabajo básico
  - Capítulo 3: Gestión de ramas
  - Capítulo 4: Repositorios remotos

- Mostrar los cambios con respecto a la última versión guardada en el repositorio.
- Hacer un commit de los cambios con el mensaje Añadido los capítulos 3 y 4.

Usamos el comando:

```console
cat > indice.txt
Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
Capítulo 2: Flujo de trabajo básico
Capítulo 3: Gestión de ramas
Capítulo 4: Repositorios remotos
Ctrl+D
```
y nos dará este output:

<p align="center">
  <img src="https://i.gyazo.com/091b54b76af0e6845e5ecc6275b0ef4b.png" width="500px">
</p>

Ahora usamos el
```console
git diff
```
Output de la consola:

<p align="center">
  <img src="https://i.gyazo.com/9ab5131053b7e18cbdf9166151f21991.png">
 </p>
 
Ahora utilizamos este comando:

```console
git add indice.txt
git commit -m "Añadido los capítulos 3"
```
Output de la consola:
<p align="center">
  <img src="https://i.gyazo.com/82b49c5d1e6a81e0cd575490042a52f4.png">
 </p>

### Tarea Historial
- Mostrar los cambios de la última versión del repositorio con respecto a la anterior.
- Cambiar el mensaje del último commit por Añadido el capitulo sobre gestión de ramas al índice.
- Volver a mostrar los últimos cambios del repositorio.

Usamos el comando:

```console
git show
```
<p align="center">
  <img src="https://i.gyazo.com/fa23a7fa4e0d4292eaf8776ead543938.png">
 </p>
 
Ahora con:
```console
git commit --amend -m "Añadido el capitulo sobre gestión de ramas al índice."
```
Output de la consola:

<p align="center">
  <img src="https://i.gyazo.com/242e511fb17c6127e44ca6aa094dbb8c.png">
 </p>

Por último pondremos:
```console
git show
```
Nos mostrará esto la consola:
<p align="center">
  <img src="https://i.gyazo.com/0823856e74cf709ef5dbe2fb1a7c16fd.png">
 </p>
 
Con esto damos por finalizado la tarea.

