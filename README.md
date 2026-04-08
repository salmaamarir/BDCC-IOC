# TP : Inversion de Contrôle et Injection de Dépendances
**Réalisé par : Salma Amarir**

## Description
Ce projet illustre les concepts de couplage faible et d'injection de dépendances (IoC) en utilisant le langage Java et le Framework Spring.

## Structure
- `dao` : Interface de données et implémentation standard.
- `metier` : Logique métier utilisant l'interface `IDao`.
- `ext` : Extension du projet (nouvelle implémentation de `IDao`).
- `pres` : Classes de test (Statique, Dynamique, Spring XML et Annotations).

## Résultats
L'exécution de `PresSpringAnnotation.java` affiche :
- L'appel à la version choisie (standard ou capteurs).
- Le résultat du calcul métier après injection automatique par Spring.