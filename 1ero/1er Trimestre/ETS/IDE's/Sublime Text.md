<p align="justify">
  
# Instalación de Sublime Text en Ubuntu

<p align="center">
  <img src="https://www.sublimehq.com/images/sublime_text.png" width="20%" height="30%">
  </p>
  
## Índice
- [Título](#Instalación-de-Sublime-Text-en-Ubuntu)
- [Índice](#Índice)
- [Pasos a realizar](#Pasos-a-realizar)

## Pasos a realizar
- Primer paso:
```
sudo apt-get upgrade
```

- Segundo paso:
```
wget -qO - https://download.sublimetext.com/sublimehq-pub.gpg | sudo apt-key add -
```

- Tercer paso:
```
sudo apt-get install apt-transport-https
```

- Cuarto paso:
```
echo "deb https://download.sublimetext.com/ apt/stable/" |sudo tee/etc/apt/sources.list.d/sublime-text.list
```

- Quinto paso:
```
sudo apt update
```

- Sexto paso:
```
sudo apt install sublime-text
```
  
</p>
