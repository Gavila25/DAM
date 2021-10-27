<p align="Justify">

# Instalación de Git en Linux

<p align="center">
  <img src="https://logos-marcas.com/wp-content/uploads/2020/11/GitHub-Logo.png" witdh="500px">
  </p>

# Índice
- [Título](#Instalacio-de-Git-en-Linux)
- [Índice](#Índice)
- [Pasos a Realizar](#Pasos-a-Realizar)
- [Requisitos previos](#Requisitos-previos)
- [Instalación de Git con paquetes predeteminados](#Instalación-de-Git-con-paquetes-predeteminados)
- [Configuración de git](#Configuración-de-git)

# Pasos a Relizar

En este repositorio, vamos a ver como se instala git en Linux mediante comandos de la consola.

### Requisitos previos
Se necesitará un servidor de Ubuntu 20.04 con una cuenta de super usuario no root.

Una vez tengamos el servidor y el usuario configurados, estará listo para comenzar.

### Instalación de Git con paquetes predeteminados

La opción de instalarlo de esta manera es recomendable si queremos activar y ejecutar con Git rápidamente.

Es problable que Git ya esté instalado en nuestro servidor de Ubuntu pero de todos modos podemos usar el comando:

```consola
git --version
```
Y la terminal debería devolvernos esto

```consola
git version 2.25.1
```
Antes de comenzar debemos instalar el software necesario para Git. Todo se encuentra disponible en los repositorio predeteminados, de modo que podemos actualizar nuestro índice local de paquetes y luego instalar los paquetes pertinentes.

```consola
sudo apt update
sudo apt install libz-dev libssl-dev libcur14-gnutls-dev libexpat1-dev gettext cmake gcc

```
Tras realizar estos pasos debemos crear un directorio temporal y vaya a él. Aquí descargaremos nuestro tarball de Git.

Usaremos el comando
```consola
mkdir tmp
cd /tmp

```
Desde el sitio web del proyecto Git, podemos navegar a la lista de tarball disponible en [<https://mirrors.edge.kernel.org/pub/software/scm/git/>](<https://mirrors.edge.kernel.org/pub/software/scm/git/>) y descargar la versión actual.

con este comando descargaremos el archivo:
```consola
curl -o git.tar.gz https://mirrors.edge.kernel.org/pub/software/scm/git/git-2.29.3.tar.gz

```
Descomprimiremos el archivo:
```consola
cd git-*
```
Ahora crearemos el paquete con el comando:
```consola
make prefix=/usr/local all
sudo make prefix=/usr/local install
```
Ahora substituimos el proceso de shell para que se utilice la versión de Git que acabamos de instalar:
```consola
exec bash
```
Una vez completado esto, puede estar seguro de que su instalación se realizó correctamente comprobando la versión, con el comando:
```consola
git --version
```
Y el output que nos dará es:

```consola
git version 2.29.3
```
Con Git instalado correctamente, ahora puede finalizar su configuración.

### Configuración de git
Una vez instalada la versión deseada de Git, debemos configurar Git de modo que los mensajes de confirmación que genere contengan la información correcta y lo respalden a medida que compile su proyecto de software.

Esta configuración es posible si aplicamos el comando git config. Específicamente, debemos proporcionar nuestro nombre y nuestra dirección de correo electrónico. Podemos hacerlo mediante este comando:
```consola
git config --global user.name "Your Name"
git config --global user.email "youremail@domain.com"
```
Podemos ver todos los elementos de configuración creados escribiendo lo siguiente:
```consola
git config --list
```
y nos responderá algo así
```
user.name=Tu nombre
user.email=tudirección@domain.como
```

La información que ingresa se almacena en el archivo de configuración de Git. Tendrá la opción de editarlo manualmente con el editor de texto que prefiera (en esté repositorio usamos el nano) como se muestra a continuación:

```consola
nano ~/.gitconfig
```

```consola
~/.gitconfig contents
[user]
  name = Your Name
  email = youremail@domain.com (Un correo personal que indique que es el creador de la tarea)
```

Para finalizar el tutorial deberas pulsar CTRL Y X, luego Y y, a continuación ENTER.

Con esto damos por finalizado el tutorial para instalar Git en Linux.
