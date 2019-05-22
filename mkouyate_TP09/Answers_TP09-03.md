_MARCO KOUYATE
IMAC 2 - 2019 / 2020_
https://igm.univ-mlv.fr/ens/IR/IMAC2/2018-2019/Java/td09.php

# JAVA - TP09

## Exercice 3 - Générification de LinkedLink

_Le but de cet exercice est de "générifier" les classes fr.umlv.data.LinkedLink et fr.umlv.data.Link_

1. Rappeler quel est l'intérêt d'utiliser un type paramétré ici ?
**Cela permet de ne pas avoir à spécifier une methode pour chaque type d'objet. Java va les générer en fonction du paramètres indiqué au moment de l'instanciation de la classe** 

2. Paramétrer la classe fr.umlv.data.LinkedLink pour que celle-ci soit générique.
**DONE**

3. Modifier la classe fr.umlv.data.main.Main en conséquence.
**DONE**

4. Dans la classe fr.umlv.data.LinkedLink, implanter la méthode boolean contains(Object o) indiquant si un objet est ou non contenu dans la liste chaînée.
**DONE**
 
Pourquoi contains prend un Object en paramètre et pas un T ou un E ?
**Parce que nous utilisons la fonction equals de Object pour comparer, cela évite donc de devoir faire un cast si nous passons directement l'objet.**