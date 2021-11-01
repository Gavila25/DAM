<p align="justify">
 
# Listado de Personas
  
  <p align="center">
    <img src="https://camo.githubusercontent.com/cd9c14c5ea6ad713eaf95484f8f298056acf80f1f344c61c798dfaf2578d0362/68747470733a2f2f36643031333166392d612d36326362336131612d732d73697465732e676f6f676c6567726f7570732e636f6d2f736974652f746f646f786d6c6474642f656a6572636963696f732f656e756e636961646f732f33352d656a6572636963696f732d786d6c736368656d612d6176616e7a61646f732f656a6572636963696f2d786d6c736368656d612d6176616e7a61646f2d342d6f6274656e65722d736368656d612d612d7061727469722d64652d756e612d6a65726172717569612d64652d6461746f732f65737175656d612e6a70673f617474616368617574683d414e6f593763704175336239616c68655a626f576e5a44625a686666714c303059533076326856654646764a65353468306367305856376e4a716b386a2d546932736932506f667456515942744634667065666936395a394b733148633077524b596b5163356a466b6b33626f53384c317270466c734c794530545f36583377746f6378343637745778436578457468396d597351486b4448314e63446469495654344f723865335f7679566832586c5748596a526c347a494a79656e6f6e656f4c48704651354159354c6a3155756a704661693373645874766e31303846774d306876675376467946677a3635462d774141755264386c774d366a3556517551664464735648327744316b6144734e7a514e6e6942346d765741533251715f686f717866355a447852797a34524a756733716a474b4a61424e456e456e7839304a7358374f44444e316b437867685652773650454552464f536742426659543846684555776d4a39462d4e5a533673794e68744a346f7a6a2d783775574e2d7364484d614f55775f4f4c464b5875426a665533326a52626461427a434872304a41253344253344266174747265646972656374733d30" witdh="300px">
   </p>
   
# Índice
- [Título](#Listado-de-Personas)

- [Índice](#Índice)

- [Enunciado y Solución](#Enunciado-y-Solución)

# Enunciado y Solución

### Se pide
Proporcionar un XML schema que refleje esta jerarquía suponiendo que nacimiento es un elemento opcional y hay al menos una dirección. Para la jerarquía de datos que se muestra a continuación, y teniendo en cuenta los siguientes requisitos:

Dependiendo de si la persona es hombre o mujer, aparecerá en el documento elemento varón (como en el gráfico) o el elemento hembra.

Los valores del atributo dia están comprendidos entre 1 y 31. Definir el tipo tipoDia para ello. Los valores del atributo mes son de tipo cadena y tienen que coincidir con uno de los meses del año. Definir el tipo tipoMes para ello.

Los valores del atributo anyo están comprendidos entre 1900 y 2011. Definir el tipo tipoAnyo para ello.

Los valores de nombre, calle, población y provincia tienen como máximo 50 caracteres. Definir el tipo tipoNombre para ello.

El código postal es un entero de 5 dígitos. Definir el tipo tipoCodPostal para ello.

Generar un fichero XML instancia que referencie al schema y contenga los siguientes datos:

### Elemento 1:
- Juan Pardo.
- Fecha de nacimiento: 10 de Abril de 1982
- Dirección: Caoba, 1, Madrid
- 28005 Madrid
### Elemento 2:
- María López.
- Dirección1: Roncato,1, Illescas
- 45200 Toledo
- Dirección2: Paseo de la Esperanza 15, 1º A, Madrid
- 28005 Madrid

### Solución
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>

<xsd:schema
	xmls:xsd="http://www.w3.org/2001/XMLSchema">
	<xsd:element name="nombre" type="tiponombre">
	<xsd:element name="fechaDeNacimiento"
				 type="tipodia"
				 type="tipomes"
				 type="tipoanyo">
	<xsd:simpleType name="tipodia">
		<xsd:restriction base="xsd:integer">
			<xsd:minInclusive value="01"/>
			<xsd:maxInclusive value="31"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="tipomes">
		<xsd:restriction base="xsd:integer">
			<xsd:minInclusive value="Enero"/>
			<xsd:maxInclusive value="Diciembre"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="tipoanyo">
		<xsd:restriction base="xsd:integer">
			<xsd:minInclusive vale="1900"/>
			<xsd:maxInclusive value="2011"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="tiponombre">
		<xsd:restriction base="xsd:integer">
			<xsd:minLength value="0"/>
			<xsd:maxLength value="50"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:element name="direccion"
				 type="tipocalle"
				 type="tipopoblación"
				 type="tipoprovincia"
				 type="tipoCpostal">
	<xsd:simpleType name="tipocalle">
		<xsd:restriction base="xsd:integer">
			<xsd:minLength value="0"/>
			<xsd:maxLength value="50"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="tipopoblación">
		<xsd:restriction base="xsd:integer">
			<xsd:minLength value="0"/>
			<xsd:maxLength value="50"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="tipoprovincia">
		<xsd:restriction base="xsd:integer">
			<xsd:minLength value="0"/>
			<xsd:maxLength value="50"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="tipoCpostal">
		<xsd:restriction base="xsd:integer">
			<xsd:minLength value="0"/>
			<xsd:maxLength value="50"/>
		</xsd:restriction>
	</xsd:simpleType>

	<xsd:element name="varon" type="xsd:boolean"/>
	<xsd:element name="hembra" type="xsd:boolean"/>
</xsd:schema>


<persona>
	<nombre> Juan Padro </nombre>
	<fechaDeNacimiento dia="10" mes="Abril" anyo="1982"/>
	<direccion>
		<calle> Caoba,1 </calle>
		<poblacion> Madrid </poblacion>
		<provincia> Madrid </provincia>
		<cPostal> 28005 </cPostal>
		<varon/>
	</direccion>
</persona>

<persona>
	<nombre> María Lopez </nombre>
	<direccion>
		<direccion numero="1">
			<calle>Roncato,1</calle>
			<poblacion> Illescas </poblacion>
			<provincia> Toledo </provincia>
			<cPostal> 45200 </cPostal>
		</direccion>
		<direccion numero="2">
			<calle> Paseo de la Esperanza,15</calle>
			<portal> 1ºA </portal>
			<provincia> Madrid </provincia>
			<poblacion> Madrid </poblacion>
			<cPostal> 28005 </cPostal>
		</direccion>
	</direccion>
</persona>
```
