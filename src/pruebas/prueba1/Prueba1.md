En esta prueba se comprobará que cuando sé instancian los eventos deportivos no ocurre ningún error
y funcione correctamente. Para ello usaremos dos puntos de ruptura uno en el objeto Carrera y otro en el objeto Torneo de futbol, 
de esta manera vemos que ambos objetos se crean correctamente, tal y como se muestra en la siguiente imagen.

![PuntosDeRuptura.png](capturas%2FPuntosDeRuptura.png)

Si iniciamos vemos como pasa desde el constructor de la Clase Carrera hasta el contructor de la clase EventoDeportivo (Clase padre de Carrera), 
para finalmente darle los valores a los atributos de EventoDeportivo:

![ConstructorCarrera.png](capturas%2FConstructorCarrera.png)

![ConstructorEventoDeportivo.png](capturas%2FConstructorEventoDeportivo.png)

Tras esto vuelve a la clase carrera para comprobar si el atributo distancia de la clase Carrera es negativo o no, en caso de que no lo sea 
le dará el valor que se le ha pasado.

![ComprobaciónAtrDistancia.png](capturas%2FComprobaci%F3nAtrDistancia.png)

Y con esto terminaría la de instanciar la clase carrera.

Ahora seguimos con el objeto tipo TorneoDeFutbol, en este caso al también ser una clase hija de EventoDeportivo, al igual que la clase Carrera,
usará el constructor de EventoDeportivo como ya hemos visto antes. Como todavía no tiene jugadores el tamaño del ArrayList de jugadores 
se inicializa a 0.

![ConstructorTorneoFutbol.png](capturas%2FConstructorTorneoFutbol.png)

Y con esto ya hemos comprobado que no da ningún error y que los constructores y los métodos de validación son correctos.