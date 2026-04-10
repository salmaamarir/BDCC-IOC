# TP : Inversion de Contrôle et Injection de Dépendances
**Réalisé par : Salma Amarir**

## 📝 Description
Ce projet illustre les concepts de **couplage faible** et d'**injection de dépendances (IoC)** en utilisant Java et le Framework Spring. L'objectif est de montrer comment séparer la logique métier de l'accès aux données.

## 📂 Structure du Projet
Le projet est organisé en plusieurs packages :
- **`dao`** : Contient l'interface `IDao` et son implémentation standard.
- **`metier`** : Contient la logique métier via l'interface `IMetier` (utilise `IDao`).
- **`ext`** : Nouvelle implémentation de `IDao` (ex: Capteurs) pour démontrer l'extensibilité.
- **`pres`** : Classes de présentation pour tester les différentes méthodes d'injection :
    - Version Statique (Instanciation directe).
    - Version Dynamique (Chargement par `Class.forName`).
    - Version Spring (Configuration via XML et Annotations).

## 🚀 Installation et Exécution
1. Cloner le projet :
   ```bash
git clone https://github.com/salmaamarir/BDCC-IOC.git