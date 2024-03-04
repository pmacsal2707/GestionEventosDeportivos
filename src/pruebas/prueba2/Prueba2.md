## Prueba 2: Añadir participantes a eventos

Para esta prueba usaremos un punto de ruptura en el participante que participará en la carrera y otro en el siguiente participante 
para comprobar que la comprobación sea correcta.

![PuntosDeRuptura.png](captura%2FPuntosDeRuptura.png)

Luego de esto al iniciar la prueba vemos como se va al metodo inscribirParticipante de la clase EventoDeportivo, como es el primero 
en inscribirse el método devuelve true ya que no tiene nada con que comparar:

![MetodoDevuelveTrue.png](captura%2FMetodoDevuelveTrue.png)

Ahora pasaremos al siguiente participante. En este caso nos devuelve un error:

![Error.png](captura%2FError.png)

Esto se debe a que la expresión regular de la clase gestionEventosDeportivos con la que se válida el dni, obliga a que entre los números 
y la letra exista un espacio, un guion o una barra. Así que existen dos formas de solucionar este error, poner los dni en el formato que admite 
el método checkDni o cambiar la expresión regular para que el espacio, el guion o la barra sea opcional. En este caso cambiaré la expresión regular.
Para ello solo debemos añadir un signo de interrogación detrás de los paréntesis que contienen el espacio, el guion y la barra, tal y como se muestra 
en la siguiente imagen:

![CorreccionError.png](captura%2FCorreccionError.png)

Ahora usaremos un punto de ruptura en el segundo jugador en inscribirse de nuevo y así comprobaremos que se ha corregido el error.
Como vemos luego de comparar el dni devuelve true, así que el error se ha solucionado.

![ComprobarSolucionError.png](captura%2FComprobarSolucionError.png)

Y tras terminar no da ningún error más así que con esto concluye la prueba 2.
