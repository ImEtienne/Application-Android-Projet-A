# Application-Mobile-Android-Projet-A

# 1 Instructions générales
Créez un nouveau projet en langage Java, nommé selon le schéma “TP5a_numéro”, où “numéro”
est votre numéro d’étudiant.
Assurez-vous que la “minSdk” soit bien 19 ! On peut soit choisir ce paramètre à la création du
projet, soit le changer dans le build.gradle a posteriori. Un projet qui ne compile pas, ou qui ne
peut pas être exécuté sur les appareils prêtés (Sdk = 19) recevera 0.
Une fois le projet terminé, exportez votre projet (File ! Export ! Export to Zip File), et
rendez ce fichier sur Eprel.
La Section 2 constitue le sujet du TP. La Section 3 détaille la procédure de notation. On pourra
s’y référer pendant la séance pour prendre connaissance des modalités d’évaluation.
# 2 Croissant clicker
L’objectif de ce TP est de réaliser une version épurée du jeu Croissant clicker 1. L’état du
jeu, au départ, est représenté en Figure 1.
Figure 1 – Aperçu de l’écran de départ du jeu.
L’idée du jeu est la suivante : l’interface contient une image de croissant, sur laquelle l’utilisateur
ou l’utilisatrice peut cliquer. Chaque clic augmente le compteur de croissants : au début, le
compteur de croissants augmente de 1 à chaque clic.
L’utilisateur peut à tout moment, pourvu qu’il ait suffisamment de croissants, augmenter sa
production. La production est le nombre de croissants ajoutés au compteur de croissants à
chaque clic sur l’image. La production commence donc à 1 au début de la partie.
# 1. Toute ressemblance avec un jeu existant est purement fortuite.

Pour augmenter sa valeur de production, il faut cliquer sur un bouton situé en bas de l’écran,
et dépenser un certain nombre de croissants (la valeur exacte sera précisée plus loin).
# 2.1 Fonctionnalités essentielles
Question 1 Créez le layout de l’ Activity . Comme on l’a vu, il devra être constitué d’une image,
de deux champs pour afficher du texte, et d’un bouton. Voici les valeurs de départ de ces View :
— Le premier champ de texte affichera (provisoirement) la chaîne “Nombre de croissants : 0”.
— Le deuxième champ affichera (pour l’instant) la chaîne “Production : 1”.
— L’image affichée sera croissant.png, qui est à télécharger sur Eprel. Pour ajouter une image
au projet, suivez les instructions de la Figure 2, puis allez chercher l’image en question dans
votre système de fichier.
— Le bouton affichera (pour l’instant) “Augmenter la production : 10”.
Figure 2 – Ajouter une image au projet.
Question 2 Faites en sorte que chaque clic sur l’image augmente le compteur de croissants
d’autant que la valeur de production, et que le nouveau résultat s’affiche à l’écran dans les bons
champs de texte, comme sur la Figure 1.
Note : les images peuvent être pourvues d’une méthode onClick() de la même manière que
les boutons.
On rappelle que la production commence à 1, et le compteur de croissants à 0.
# 2.2 Augmentation de la production
On va à présent implémenter l’accélération de la production. La règle du jeu stipule que pour
faire passer la production de n à n + 1, il faut dépenser 10n2 croissants.
# Question 3 Écrivez une méthode computeNextProd() qui renvoie le nombre de croissants à
dépenser pour augmenter le niveau de production actuel.
# Question 4 Faites en sorte qu’un clic sur le bouton d’augmentation de la production ait les
conséquences suivantes :
— Si le compteur de croissants est suffisamment élevé pour augmenter la production,
alors la production est incrémentée, les croissants sont dépensés, et les nouvelles valeurs
s’affichent dans les champs de texte et sur le bouton. Cette situation est représentée en
Figure 3.
— Autrement, un message ( Toast ) apparaît en bas de l’écran, indiquant “Pas assez de croissants”.
Cette situation est illustrée en Figure 4.

Figure 3 – Résultat d’un clic sur le bouton “Augmenter la production” : le compteur de
croissants est diminué de 10 fois le carré de la production, et la production est incrémentée.
# 2.3 Sauvegarde de l’état du jeu
Jusqu’ici, le jeu reprend de zéro à chaque fois que l’utilisatrice tourne l’écran.
Question 5 Faites en sorte que les valeurs courantes soient sauvegardées et que le jeu reparte de
ces valeurs quand l’ Activity n’est pas recrée de zéro (par exemple, dans le cas d’une rotation
d’écran).

Figure 4 – Message d’erreur affiché si la valeur du compteur de croissants n’est pas suffisante
pour augmenter la production. Ici, 27 < 90.
3 Notation
Au moment de corriger le TP de votre camarade, téléchargez le fichier zip qui vous a été attribué
sur Eprel, et importez le projet dans Android Studio (File ! New ! Import Project).
Merci de ne pas chercher à savoir à laquelle ou auquel de vos camarades appartient le numéro
d’étudiant présent dans le nom du projet.
Pour la notation, on se contentera de tester l’application sur un appareil, sans en regarder le
code. Un code qui ne compile recevra une note de 0.
La liste des éléments à vérifier sur l’application que vous avez à noter est donnée en Figure 5.
Pour chaque critère, on attribuera :
— 0, si le critère n’est pas du tout respecté.
— La moitié des points si le critère est partiellement respecté.
— L’intégralité des points si le critère est parfaitement respecté.
4
