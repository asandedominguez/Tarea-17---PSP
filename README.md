# TAREA 17 - CONTADOR DE CARACTERES

## Escribe un programa que pida por teclado 5 consonantes y un texto. Cada consonante tendrá un hilo que cuenta cuántas veces aparece una de las consonantes y suma sus apariciones a un contador total compartido. Al final se muestra lo que ha contado cada hilo y el total. Para que se note el problema, repite el texto 2.000 veces: texto.repeat(2000). 

### USO DE LA IA

En la clase "Lanzador" tenía la variable "contador_total" declarada sin añadir el modificador "static", debido a esto era una variable de objeto, es decir, se ejecutaba individualmente en cada hilo. Está es común a todos los hilos. El error se econtraba en que cada hilo tenía su propia versión que daba un resultado que no se sumaba entre los valores de la otra. Le consulte a la IA como resolverlo sin afectar a la estructura con el siguiente PROMPT:

"Tengo 2 variables, las cuales son generales para varios hilos, pero al ejecutarse solo sale el valor de la última, que puedo añadirles a estas variables para resolvber este problemas y aparezca el valor de todas"

Me respondio con dicho elemento, el cual resolvió el problema. Lo añadí a mayores a la variable "valido" para dar un punto mas de precisión, ya que del mismo modo esta también es común a todos los hilos.


### Para este ejercicio utilice 2 clases: CONTADOR Y LANZADOR

## CONTADOR

Aquí tendremos nuestro main para ejecutar el programa.

Como las consonantes y texto que se mencionan en el enunciado se piden al usuario, utilizaremos el método Scanner para pedirlas. Añadiremos las consonantes a una nueva lista vacía llamada "consonante".

Hacemos un bucle que durará 5 iteraciones, y en cada una se pedirá una consonante.

Se añadirán a la lista "consonante" ignorando espacios en blanco y mayúsculas.

Fuera del bucle se pedirá el texto, el cual se añadira a una varible "texto" con las misma especificaciones.

Se crea una lista vacia de objetos "Lanzador" llamada "hilos".

Se vacia el objeto Lanzador con null.

Se recorre la lista de consonantes.

Se crea un nuevo objeto "Lanzador" con dichas consonante y el texto, y se añadirá a la lista "hilos".

Se lanzará cada objeto "Lanzador" en su respectivo hilo.

Se crea otro bucle que recorre cada hilo del objeto "Lanzador".

Se crea una estructura "try/catch" en la que se van deteniendo uno por uno cada hilo.

Si algo salió mal se mostrará un mensaje conforme al error.

Se recorrerá de nuevo cada hilo del objeto "Lanzador", donde se mostrará la consonante introducida y su contador propio.

Para finalizar, fuera de este último se mostrará el contador total.

![1](/Capturas/1.png)

## LANZADOR

En esta clase se implementará la lógica del programa.

Se extiende de Thread.

Se crean dos variables String "consonante" y "texto".

Se inician en el constrcutor.

Se crea la lógica del método run.

Se recorre la variable texto mientras que tenga caracteres, ya que punto lenght mide su longitud y asi la variable puede saber cuantos caracteres tiene que recorrer hasta que se termine.

Si la variable consonante tiene 1 solo valor, contiene uno de los valores de la variable valido (que en la estructura está debajo del run, por tanto explicaré lo que contiene y hace después) y contiene alguna de las consonantes que aparecen en la posicion correspondiente del texto, aumentará el valor del contador individual que tiene cada hilo, llamado "contador_texto". También aumentará el valor de la variable "contador_total", que como su nombre indica, sumará los valores de todos los hilos. Este valor lo establecemos mediante el método "setContador_total", que veremos ahora.

Se crea la variable tipo int "contador_texto" con la función que mencionamos.

Se crea la variable "contador_total", incializada en 0. Tendrá el modificador "static" para que opere como mencionamos en la ayuda de IA. Esta variable se modificará en un método que tendrá el modificador "synchronized", que hará que solo un hilo pueda ejecutar una operación a la vez.

Por último se crea la variable "valido", que contendrá una cadena de texto con todas las consonantes posibles para que se pueda comprobar si un valor es valido o no en la comprobación de seguridad dentro del for del método run.

![2](/Capturas/2.png)

### Con todo esto hecho el resultado será el siguiente:

## PRUEBA 1

![1](/Capturas/3.png)

## PRUEBA 2

### Aparece como 0 ya que las vocales no se contabilizan.

![1](/Capturas/4.png)

