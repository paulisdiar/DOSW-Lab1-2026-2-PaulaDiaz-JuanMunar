Fundamentos de Programación Funcional y Manejo Colaborativo de Git/GitHub

Reto #1: La Bienvenida
ENUNCIADO TÉCNICO
Utilice una expresión lambda para imprimir el saludo de bienvenida con nombre, edad, correo y semestre de cada integrante. Los estudiantes deben almacenarse en una List y procesarse con stream(), map() y collect(). Cree las clases Estudiante y MensajeBienvenida.

Construimos un modelo POO con la clase Estudiante, clase MensajeBienvenida y una clase principal Reto1. Usando Programación Funcional, se procesó la lista de integrantes mediante .stream(), transformando los datos con .map() para generar un mensaje de saludo unificado recopilado con .collect() y estructurado para que coincida con el propuesto en el ejemplo.

Ejecución del programa 
<img width="1964" height="574" alt="image" src="https://github.com/user-attachments/assets/e2dacb55-b125-4bae-8635-8fd74e66987c" />



Reto #2: Carrera en paralelo

ENUNCIADO TÉCNICO
Estudiante A (Carril 2): Con expresión lambda, calcular el número más pequeño de un listado y la cantidad de datos ingresados.
Estudiante B (Carril 1): Con expresión lambda, calcular el número más grande de un listado.
Ambos — Choque 1: Crear la misma función que combine los resultados: máximo, mínimo y cantidad de datos. Resolver el conflicto de merge.
Ambos — Choque 2: Añadir verificación de si el mayor es múltiplo de 2 (Carril 1) y divisible entre 2 (Carril 2). Resolver conflicto.
Ambos — Meta final: Fusionar todo en una función que reciba dos listas y devuelva en el objeto Resultados: mayor por lista, menor por lista, cantidad, si el mayor es múltiplo/divisor de 2, si la cantidad es par/impar.

Construimos una solución donde el Estudiante A (Carril 2) calculó el valor mínimo y la cantidad de elementos usando expresiones Lambda y .stream(), mientras que el Estudiante B (Carril 1) calculó el mayor elemento, resolviendo los conflictos de merge en Git.

Ejecución del programa 
<img width="2192" height="446" alt="image" src="https://github.com/user-attachments/assets/84246192-b6ac-4d1f-8e39-cafa2d71137e" />


Reto #3:	La Máquina de los Códigos Secretos

ENUNCIADO TÉCNICO
Estudiante A — Canal A: Usando StringBuilder, implementar un método que reciba el mensaje cifrado (String) y lo repita 3 veces separado por un espacio, simulando la amplificación de la señal.
Estudiante B — Canal B: Usando StringBuffer, implementar un método que reciba el mensaje y lo invierta completamente, aplicando el protocolo de descifrado seguro.
Ambos — Descifrado final: Unificar ambos canales en una sola función que primero amplíe (repita 3 veces) y luego descifre (invierta) el mensaje. Usar lambda para invocar la función y stream() para procesar las repeticiones. Resolver el conflicto de merge al integrar los dos canales.

REQUISITOS TÉCNICOS
•	Canal A usa StringBuilder; Canal B usa StringBuffer.
•	Uso de lambda para invocar la función de descifrado combinada.
•	Uso de stream() para procesar las repeticiones del Canal A.

Implementamos una arquitectura de dos canales donde el Canal A utilizó StringBuilder para amplificar la señal repitiendo el mensaje 3 veces (Estudiante A) y el Canal B utilizó StringBuffer para invertir el texto (Estudiante B). Unificamos ambos canales invocando las funciones con expresiones Lambda y procesando las repeticiones con .stream() para generar el descifrado final.

Ejecución del programa
<img width="950" height="256" alt="image" src="https://github.com/user-attachments/assets/1b2eab3b-9eaf-416b-97db-3f314bfd7a98" />



Reto #4:	El Tesoro de las Llaves Duplicadas	

ENUNCIADO TÉCNICO
Estudiante A: Almacenar pares (clave, valor) en HashMap, ignorando claves duplicadas (conservar el primer valor).
Estudiante B: Almacenar los mismos pares en Hashtable, garantizando sincronización.
Ambos: Combinar ambos mapas. En conflicto de clave, priorizar el valor del Hashtable. Convertir claves a mayúsculas y ordenarlas ascendentemente. Usar Collectors.toMap(), stream(), map() y sorted().

REQUISITOS TÉCNICOS
•	Uso de stream(), map() y sorted() para ordenar e imprimir.
•	Resolución de conflictos en Git en al menos 1 merge.

Almacenamos pares clave-valor ignorando duplicados (Estudiante A). Combinamos ambas estructuras priorizando los valore ante conflictos y procesamos las entradas mediante .stream(), .map() y .sorted() para convertir las claves a mayúsculas y ordenarlas alfabéticamente.

Ejecución del programa
<img width="888" height="290" alt="image" src="https://github.com/user-attachments/assets/3ab6efc1-54aa-49a3-9f14-de054752fa56" />



#5	Batalla de Conjuntos	

ENUNCIADO TÉCNICO
Estudiante A (HashSet): Almacenar números sin orden y eliminar los múltiplos de 3.
Estudiante B (TreeSet): Almacenar números en orden ascendente y eliminar los múltiplos de 5.
Ambos — Choque: Unir ambas colecciones en una sola estructura ordenada sin duplicados. Usar stream().filter() y lambda para imprimir. Resolver el conflicto de merge.
REQUISITOS TÉCNICOS
•	Uso de stream().filter() para eliminar múltiplos.
•	Lambda para imprimir los resultados finales.


Almacenamos números en un HashSet eliminando los múltiplos de 3, mientras que en un TreeSet eliminamos los múltiplos de 5. Unimos ambas colecciones en un conjunto ordenado sin duplicados y procesamos la salida aplicando .stream(), .filter() y expresiones Lambda para imprimir los sobrevivientes en la arena.

Ejecución del programa
<img width="726" height="338" alt="image" src="https://github.com/user-attachments/assets/1ca3a080-8362-4c53-8742-aa519b9e9c13" />


Reto #6:	La Máquina de Decisiones	

Lista de Comandos:

SALUDAR: ¡Saludos, viajero del Tiempo y del código!
DESPEDIR: Hasta la próxima compilación, viajero.
CANTAR: La la la... compilando melodías en tiempo real.
DANZAR: Girando en modo fiesta.
BROMEAR: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...
GRITAR: ¡¡¡STACK OVERFLOOOOOW!!!
SUSURRAR: psst... revisa el punto y coma de la línea 42.
ANALIZAR: Analizando datos... ¡Eres increíble!


ENUNCIADO TÉCNICO
Estudiante A — Fragmento 1: Implementar con switch-case los comandos: "SALUDAR", "DESPEDIR", "CANTAR", "DANZAR".
Estudiante B — Fragmento 2: Implementar con switch-case los comandos: "BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR".
Ambos — Choque: Unificar en un solo Map<String, Runnable>usando lambdas, de modo que el programa responda a cualquier comando de la lista. Cada acción se guarda como Runnable ( () -> acción() ) y se ejecuta llamando a .run().

REQUISITOS TÉCNICOS
•	Usar switch-case para la lógica individual de cada fragmento.
•	Implementar Map<String, Runnable> para unificar los 8 comandos con lambdas.
•	Invocar cada acción con accion.run()  ← el método de la interfaz Runnable.
•	Recorrer el Map con forEach((cmd, accion) -> accion.run()) para mostrar TODOS.
•	Demostrar los comandos de la salida esperada


Cada integrante implementó un fragmento de comandos mediante la estructura switch-case. Posteriormente, unificamos todos las acciones utilizando expresiones Lambda (`() -> accion()`), permitiendo ejecutar los comandos según las indicaciones 

Ejecución del programa
<img width="756" height="324" alt="image" src="https://github.com/user-attachments/assets/c19e424c-c37b-4da1-b0f8-1b55b0baeee3" />


Reto #7:	El Juego del Calamar	

CLASE JUGADOR  (ATRIBUTOS REQUERIDOS)
número  |  nombre  |  deuda  |  premio  |  estado (ACTIVO / ELIMINADO / GANADOR)

ENUNCIADO TÉCNICO
Prueba 1 — Luz Roja Luz Verde (Est. A): Eliminar jugadores con deuda > 170.000.000 de wones. Solo se puede usar stream(), filter() y collect(). Sin bucle for.
Prueba 2 — Los Dados (Est. B): Solo avanzan jugadores cuyo número de asignación sea PAR (dado aleatorio entre 1 y 6).
Prueba 3 — Puente de Cristal (Ambos): Solo pasan jugadores cuyo nombre tenga 5 o más caracteres. Usar únicamente lambdas.
Premio: +50.000.000 wones por cada jugador eliminado en pruebas 1 y 2; +100.000.000 por eliminado en prueba 3. Si hay más de un ganador, dividir el premio final en partes iguales.


Diseñamos el modelo POO con la clase Jugador y evaluamos tres pruebas eliminatorias mediante Programación Funcional. La Prueba 1 eliminó jugadores con deuda superior a 170M usando .stream(), .filter() y .collect(). La Prueba 2 filtró asignaciones pares y la Prueba 3 filtró por longitud del nombre, calculando finalmente el premio acumulado para el ganador.

Ejecución del programa
<img width="1146" height="522" alt="image" src="https://github.com/user-attachments/assets/c8b859aa-e977-4a6d-b1fa-764208d710aa" />
<img width="660" height="328" alt="image" src="https://github.com/user-attachments/assets/e987bb5d-7c04-422a-91ed-32f24cf7ee77" />

EVIDENCIAS DE CONFLICTO AL HACER MERGE:
Durante la integración en develop, se presentaron tres bloqueos clave: una interrupción inicial en git pull por cambios locales no confirmados (resuelta aislando el código con git stash), conflictos de contenido en los Retos 1 al 7 por trabajo en paralelo, y un rechazo de git push debido a commits concurrentes en el remoto (solucionado ejecutando un git pull de integración final antes del envío definitivo).

<img width="1626" height="1440" alt="image" src="https://github.com/user-attachments/assets/2476af17-af1b-4de3-93d4-604830ccd3c2" />
<img width="1094" height="602" alt="image" src="https://github.com/user-attachments/assets/4edc36f5-0bed-4ba8-a86e-6968a724f302" />
<img width="1496" height="1328" alt="image" src="https://github.com/user-attachments/assets/31ef2d19-2c17-42fe-9d82-900d30fd201a" />
<img width="1126" height="638" alt="image" src="https://github.com/user-attachments/assets/0b4f67ee-b061-4a14-9b15-c7b2b8294861" />
<img width="2574" height="1678" alt="image" src="https://github.com/user-attachments/assets/a64b52de-65c1-411b-a0f5-6df49af13b28" />






