01	¿Cuál es la diferencia entre git merge y git rebase?

git merge sirve para unir los cambios de una rama con otra y mantiene el historial de las dos ramas

git rebase  toma los cambios de una rama y los coloca encima de otra


02	Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Git no sabe automáticamente cuál de las dos versiones debe conservar por lo que tenemos que revisar las dos versiones y decidir cuál queremos conservar.


03	¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
Se puede utilizar:

git log --oneline --graph --all

Esto muestra los commits y las ramas 


04	Explica la diferencia entre un commit y un push.

git commit  guarda los cambios que hiciste en tu computador dentro del historial de Git y permite agregar un comentario

git push toma esos commits y los sube, sin push no se refleja el commit 


05	¿Para qué sirven git stash y git stash pop?

git stash sirve para guardar temporalmente los cambios que todavía no quiero hacer commit, como una copia de seguidad 

git stash pop recupera eso guardado y vuelve a mostrarlo 


06	¿Qué diferencia hay entre HashMap y HashTable?

HashMap permite guardar una clave null y valores null

Hashtable No permite claves ni valores `null`.


