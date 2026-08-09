
# DOSW-Lab1-2026-2-PaulaDiaz-JuanMunar
El contenido de este repositorio es la solución del laboratorio 1 realizado por Paula Díaz y Juan Munar.
Hoja de vida de cada candidato.




Juan David Munar 
- Soy un gran candidato para DOSW Company, tal vez no por mi nivel técnico o de programación sino por las ganas de aprender cosas nuevas, por mi capacidad de resolución de problemas y la comunicación que tengo.  
<img width="1154" height="650" alt="Captura de pantalla 2026-07-30 a la(s) 9 34 58 a m" src="https://github.com/user-attachments/assets/f54f74e8-8040-446f-9ecf-90e151855824" />
<img width="1148" height="638" alt="Captura de pantalla 2026-07-30 a la(s) 9 35 09 a m" src="https://github.com/user-attachments/assets/ddc21235-7cd7-4d3f-b45a-3d4e035f8856" />





Paula Alejandra Díaz Arredondo

Considero que soy una buena candidata para DOSW Company porque disfruto aprender, crear y enfrentar retos nuevos. Tengo una curiosidad constante por entender cómo funcionan las cosas y encontrar diferentes maneras de resolver problemas utilizando mi creatividad.

<img width="1600" height="1545" alt="WhatsApp Image 2026-07-30 at 9 28 18 AM" src="https://github.com/user-attachments/assets/c8ceae86-c291-4b5f-9ae5-e25a9b05fccd" />
<img width="1600" height="1419" alt="WhatsApp Image 2026-07-30 at 9 28 18 AM (1)" src="https://github.com/user-attachments/assets/d8ca4645-3ae1-44b6-9101-d974c1c2d411" />
<img width="1600" height="1533" alt="WhatsApp Image 2026-07-30 at 9 28 18 AM (2)" src="https://github.com/user-attachments/assets/2422213a-6523-407c-90f5-74975aa992e8" />




PARTE 4 - CUESTIONARIO:


01 ¿Cuál es la diferencia entre git merge y git rebase?
- git merge sirve para unir los cambios de una rama con otra y mantiene el historial de las dos ramas
- git rebase toma los cambios de una rama y los coloca encima de otra

02 Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
- Git no sabe automáticamente cuál de las dos versiones debe conservar por lo que tenemos que revisar las dos versiones y decidir cuál queremos conservar.

03 ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola? Se puede utilizar:
- git log --oneline --graph --all
- Esto muestra los commits y las ramas

04 Explica la diferencia entre un commit y un push.
- git commit guarda los cambios que hiciste en tu computador dentro del historial de Git y permite agregar un comentario
- git push toma esos commits y los sube, sin push no se refleja el commit

05 ¿Para qué sirven git stash y git stash pop?
- git stash sirve para guardar temporalmente los cambios que todavía no quiero hacer commit, como una copia de seguidad
- git stash pop recupera eso guardado y vuelve a mostrarlo

06 ¿Qué diferencia hay entre HashMap y HashTable?
- HashMap permite guardar una clave null y valores null
- Hashtable No permite claves ni valores null

07 ¿Cuál es la diferencia entre StringBuilder y StringBuffer?
- StringBuilder es más rápido pero no es seguro para hilos (no sincronizado), ideal para trabajar en un solo hilo.
- StringBuffer es seguro para hilos (sincronizado) al manejar concurrencia, aunque es ligeramente más lento.

08 ¿Qué diferencia existe entre un HashSet y un TreeSet?
- HashSet almacena elementos sin ningún orden específico y ofrece operaciones de búsqueda e inserción muy rápidas.
- TreeSet almacena los elementos ordenados automáticamente de forma ascendente y no permite duplicados.

09 ¿Qué es una Expresión Lambda y para qué se utiliza en Java?
- Es una función anónima que permite escribir código más corto y claro para pasarlo como parámetro a otros métodos.
- Se utiliza para facilitar la programación funcional y procesar colecciones de datos junto con el API Stream.

10 ¿Cómo funcionan las operaciones filter() y collect() en el API Stream?
- filter() evalúa una condición booleana y deja pasar únicamente los elementos del Stream que la cumplen.
- fcollect() transforma los elementos procesados por el Stream y los guarda en una nueva colección como List o Set.

11 ¿Por qué es preferible usar un Dispatch Map (Map<String, Runnable>) en lugar de un switch-case largo?
- Permite agregar nuevos comandos sin modificar el código existente, respetando el principio de diseño Abierto/Cerrado (OCP).
- Elimina bloques de código extensos, desacoplando la lógica de ejecución al invocar las acciones con el método .run().

12 ¿Qué es un conflicto de merge y cuáles son los pasos para resolverlo?
- Es una situación que ocurre cuando Git no puede fusionar cambios automáticamente porque dos ramas modificaron las mismas líneas de un archivo.
- Se resuelve editando manualmente las marcas de conflicto en el archivo, guardando la versión correcta y ejecutando git add seguido de git commit.
