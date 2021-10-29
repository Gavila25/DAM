<p align="justify">

# Tipos de Ficheros

  <p align="center">
    <img src="https://www3.gobiernodecanarias.org/medusa/edublog/iespuertodelacruztelesforobravo/wp-content/uploads/sites/408/2021/06/logotipo-fondo-transparente-4.png" width="500px">
  </p>

# Índice
- [Título](#Tipos-de-Ficheros)
- [Índice](#Índice)
- [Ejercicio 1](#Ejercicio-1)
- [Ejercicio 2](#Ejercicio-2)

# Ejercicio 1

¿Qué diferencia hay entre un fichero secuencial indexado y un fichero
de acceso calculado o hash ?

### Ficheros Secuenciales Indexados

son los ficheros en los que existe una zona de
índices y otra zona de registro de datos, pero esta última se encuentra dividida en
segmentos ordenados.
Sus principales características son:

- Permite el acceso secuencial.
- Permite el acceso directo a los registros.
- Se pueden actualizar los registros en el mismo fichero, sin necesidad de crear
otro nuevo.
- Ocupa más espacio en el disco que los ficheros secuenciales.
- Solo se puede utilizar soportes direccionables.
- Obliga a una inversión económica mayor, por la necesidad de programas e
incluso hardware más sofisticado.

### Ficheros de Acceso Calculado o Hash

Cuando utilizamos este tipo de ficheros
es necesario siempre tener que consultar una tabla para obtener la dirección de
almacenamiento a partir de la clave. Este permite accesos más rápidos, ya que en
lugar de una tabla, se utiliza una transformación o función matemática.
Para llevar a cabo la transformación existen multitud de métodos, siendo algunos:
Módulo: La dirección será igual al resto de la división entera entre la clave y el
número de registros.

### Extracción

La dirección será igual a una parte de las cifras que se extraen de la
clave. Una buena transformación o función de hash, será aquella que produzca el
menor número de colisiones.

# Ejercicio 2

Sistemas gestores de BBDD más conocidos

- Los sistemas de gestores de BBDD Relacionales son: MySQL, MariaDB, SQLite
(Biblioteca escrita en C que implementa un SGBD), PostgreSQL, Microsoft SQL
Server y Oracle.

- Los Sistemas Gestores de BBDD No Relacionales son: MongoDB, Redis y
Cassandra.
