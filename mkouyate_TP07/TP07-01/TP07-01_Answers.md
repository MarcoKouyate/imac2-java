__MARCO KOUYATE  
IMAC 2 - 2019 / 2020  
https://igm.univ-mlv.fr/ens/IR/IMAC2/2018-2019/Java/td07.php__


# JAVA - TP 07 

## EXERCICE 01

Le but de cet exercice est de construire un parseur d'expressions 
arithmétiques simples. Ces expressions sont représentées sous 
forme d'arbres. 
L'ensemble des classes devront être définies dans le paquetage 
fr.umlv.calc si aucun paquetage n'est indiqué.

La classe OpOrValue définit des objets qui peuvent être soit 
des valeurs soit des opérations (avec un membre gauche et un membre droit).



### Pourquoi le constructeur qui prend 4 arguments est déclaré private ?
Nous ne souhaitons pas que l'utilisateur puisse y avoir accès directement. Nous préférons le faire passer par un constructeur public qui va définir les éléments de bases dont nous avons besoin en fonction de si il s'agit d'une valeur ou d'un opérateur. 


### Quel est le problème du constructeur OpOrValue(int, OpOrValue, OpOrValue) ?
Il faut s'assurer que les paramètres indiquées rentrent bien dans l'ensemble défini pour construire notre objet. Dans le cas contraire, il faudrait lever une exception.

#### Corriger le problème.

### Écrire une méthode parse qui prend un Scanner en entrée et crée l'arbre d'expression correspondant sachant que l'arbre sera donné au scanner en utilisant la notation polonaise inverse. 
__Par exemple, au lieu de 2 + 3 - 4, la notation polonaise inverse est - + 2 3 4.__ 

__Indication: la méthode parse est naturellement récursive: si l’expression contient encore des symboles (et qu'elle est bien formée) 
__alors:
- soit le prochain symbole est un entier et il suffit d'en faire une feuille de l’arbre d'expression 
- soit le prochain symbole est un opérateur et il faut appeler parse() 2 fois pour obtenir le fils gauche et le fils droit et les combiner avec l'opérateur pour faire une nouvelle expression.__ 


### Enfin, pour rappel, scanner.next() renvoie le prochain mot, Integer.parseInt() permet de savoir si c'est un entier et il est 
possible de faire un switch sur des Strings en Java. Déplacer le main dans une nouvelle classe Main dans le package 
fr.umlv.calc.main.


### Écrire la méthode d'affichage de l'arbre d'expression pour que l'affichage se fasse dans l'ordre de lecture habituel. 
__Note: il va falloir ajouter des parenthèses !__

__Noter que prendre un Scanner en paramètre ne permet pas de ré-utiliser la méthode parse si, par exemple, l'expression à parser est stockée dans une List de String.__ 

### Quelle interface doit-on utiliser à la place de Scanner pour que l'on puisse appeler la méthode parse avec une List ou un Scanner ? 

