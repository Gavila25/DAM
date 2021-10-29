# Instalación de Sublime Text en Ubuntu

## Índice
1. Índice
2. Pasos a realizar

## Pasos a realizar
- Primer paso:
```
sudo apt-get upgrade
```

<img src="sudo apt get upgrade.png" width="50%" height="60%">

- Segundo paso:
```
wget -qO - https://download.sublimetext.com/sublimehq-pub.gpg | sudo apt-key add -
```

<img src="wget -q0 -.png" width="50%" height="60%">

- Tercer paso:
```
sudo apt-get install apt-transport-https
```

<img src="sudo apt get install apt-transport-https.png" width="50%" height="60%">

- Cuarto paso:
```
echo "deb https://download.sublimetext.com/ apt/stable/" |sudo tee/etc/apt/sources.list.d/sublime-text.list
```

<img src="echo deb.png" width="50%" height="60%">


- Quinto paso:
```
sudo apt update
```

<img src="Maven/sudo apt update.png" width="50%" height="60%">

- Sexto paso:
```
sudo apt install sublime-text
```

<img src="Maven/sudo apt install maven.png" width="50%" height="60%">


-Septimo paso:

Ahora buscaremos el programa en el cajón de aplicaciones de Ubuntu

<img src="Cajon de apps Ubuntu.png" width="50%" height="60%">
