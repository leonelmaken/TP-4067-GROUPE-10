# TP-4067-GROUPE-10
Etude sur le patron State
Patron de Conception État (State Pattern) - Exemples pratiques en Java
Ce dépôt GitHub contient des exemples pratiques de l'utilisation du patron de conception État pour gérer les états de deux types d'objets : un ordinateur et une lampe. Le patron de conception État est utilisé pour permettre à un objet de changer son comportement lorsque son état interne change.

Problème
Dans de nombreux systèmes logiciels, il est courant de devoir gérer les états d'objets. Deux exemples classiques sont les états d'un ordinateur (allumé, éteint, en veille) et les états d'une lampe (allumée, éteinte). Gérer efficacement ces états tout en maintenant un code propre et maintenable peut être un défi.

Solution
Le patron de conception État fournit une solution élégante à ce problème en modélisant chaque état possible de l'objet en tant qu'objet séparé, et en définissant des transitions entre ces états. Cela permet à l'objet de déléguer le comportement spécifique à son état actuel à l'objet représentant cet état.

Étapes pour résoudre le problème
Définir les états et les actions : Identifiez les différents états possibles de l'objet ainsi que les actions qui peuvent être effectuées sur cet objet dans chaque état.

Implémenter les interfaces d'état : Créez des interfaces représentant les différents états et implémentez les méthodes correspondant aux actions possibles dans chaque état.

Implémenter le contexte : Créez la classe principale représentant l'objet à états et incluez-y les méthodes permettant de changer l'état de l'objet et d'effectuer des actions en fonction de l'état actuel.

Créer les classes d'état : Implémentez des classes représentant chaque état possible de l'objet et définissez le comportement spécifique à cet état.

Utiliser le patron État : Intégrez le patron de conception État dans votre code en changeant dynamiquement l'état de l'objet et en appelant les méthodes appropriées en fonction de cet état.

Exemple 1 : Gestion des états d'un ordinateur
Dans cet exemple, nous modélisons les états d'un ordinateur (allumé, éteint, en veille) en utilisant le patron de conception État. L'utilisateur peut choisir l'état initial de l'ordinateur et effectuer des actions telles que mettre en veille ou éteindre l'ordinateur en fonction de son état actuel.

Exemple 2 : Gestion des états d'une lampe
Dans cet exemple, nous utilisons également le patron de conception État pour gérer les états d'une lampe (allumée, éteinte). L'utilisateur peut allumer ou éteindre la lampe, et des vérifications sont effectuées pour garantir que l'action est valide en fonction de l'état actuel de la lampe.

Comment exécuter les exemples
Pour exécuter les exemples, assurez-vous d'avoir Java installé sur votre système. Clonez ce dépôt et exécutez les fichiers Main.java correspondants à chaque exemple.

Avec ces exemples pratiques et les instructions fournies, vous devriez être en mesure de comprendre et d'utiliser efficacement le patron de conception État dans vos propres projets pour gérer les états d'objets de manière claire et modulaire. Si vous avez des questions ou des suggestions, n'hésitez pas à ouvrir une issue ou à soumettre une pull request.

Auteur : GROUPE-10
Date : Samedi 3 Février 2024
