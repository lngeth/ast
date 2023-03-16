# Devoir Maison IPOO numéro 2

Réalisé par **Laurent Ngeth**, FISA 1A (S2) à l'ENSIIE.  
Dans le cadre d'un devoir maison pour le module IPOO. 
IDE utilisé : Visual Studio Code .  
  
[Lien pdf exercice du chargé de TD (Valentin Honoré)](http://web4.ensiie.fr/~valentin.honore/cours/22_23/fisa/ipoo/dm/devoir_maison2.pdf).  
[Lien Github](https://github.com/lngeth/ast) (Disponible après le 17 mars *-après deadline-*)

## Lancer le projet

**Dans le dossier ast**, exécuter la commande suivante en ligne de commande :
```|shell
make
```

## Choix d'implémentation

### Dans le Main

- Les instances de Scalars pouvaient être créés dans un tableau allant de 1 à 1000, mais vu qu'on utilise que certains d'autres eux, je trouvais plus pertinent de créer uniquement les variables dont on aurait besoin au cours du DM.

- Simplification en **classe anonyme** car :
Parfois, je jugeais que la visibilité du code ne serait pas altérer si je ne sauvegardais pas une instance d'une classe dans une variable.


### Améliorations possibles

Ranger les classes dans des **packages** :
- les classes ayant les "mêmes" fonctionnalités sont dans un même package.
- augmenter la visibilité de la structure du projet (dossiers).
