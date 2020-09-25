# ISIFID-Test

Le test permet la création d'un endpoint rest GET prenant en "PathVariable" un nombre x :

Le endpoint retournera :

•	Un code http 400 si le nombre est négatif.
•	Fibonacci si ce nombre est impair.
•	La factorielle si ce nombre est pair et inférieur à 51.
•	Le nombre si ce nombre est pair et supérieur à 50.

Pour tester le programme, il suffit de taper "http://localhost:7000/api/number/calculate/x". on remplace x dans l'URL par un nombre.
On peut tester sur POSTMAN, ARC (Advanced Rest Client), ou bien tout simplement sur un navigateur.


