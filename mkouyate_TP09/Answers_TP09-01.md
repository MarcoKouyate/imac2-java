_MARCO KOUYATE
IMAC 2 - 2019 / 2020_
https://igm.univ-mlv.fr/ens/IR/IMAC2/2018-2019/Java/td09.php

# JAVA - TP09

## Exercice 1 - Les listes chaînées
Le but de cet exercice est d'écrire une implantation de listes chaînées.

Pour la suite de l'exercice, l'ensemble des classes créées devront être dans le paquetage fr.umlv.data. Les fichiers sources (.java) doivent être dans le répertoire src et les fichiers destinations (.class) doivent être dans le répertoire classes. 
Si ce n'est pas le cas, configurer votre Eclipse dans Window > Preferences > Java > Build Path et dans project > Properties > Java > Build Path.

Nous allons dans un premier temps créer une liste chaînée d'entiers.

1. Créer une classe Link dans le paquetage fr.umlv.data correspondant à un maillon de la liste chaînée stockant des entiers. 
En aucun cas, l'utilisateur de la classe ne devra lui-même manipuler des maillons. 
Quelle doit être la visibilité de la classe fr.umlv.data.Link ainsi que la visibilité de ses champs ?
```
Nous utilisons un package pour isoler la classe et ses outils de l'utilisateur. 
L'utilisateur va pouvoir utiliser notre API sans fouiller dedans et faire n'importe quoi. 
Pas besoin de getter ni de setter puisqu'il s'agit de notre propre outil
```
Écrire un main de test dans cette classe créant deux maillons contenant les valeurs 13 et 144.

2. Quelle est la commande pour exécuter le main de la classe fr.umlv.data.Link à partir d'un terminal (pas dans Eclipse) ?
```
depuis le dossier de destination :
> java fr.umlv.data.Link
```

3. Créer une classe fr.umlv.data.LinkedLink qui permettra de manipuler une liste chainée par son premier maillon.
	- add(int value) qui ajoute un élément en tête de la liste.
	- toString() qui affiche le contenu de la liste.

Pour tester la classe fr.umlv.data.LinkedLink, créer une classe Main dans le package fr.umlv.data.main.