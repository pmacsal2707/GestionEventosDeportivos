# GESTION EVENTOS DEPORTIVOS

## Samuel Pérez Pérez
## Pablo Macías Salguero

## Duo dinámico

### **Descripción del proyecto**

Este proyecto consiste en un sistema para gestionar eventos deportivos, para almacenar y gestionar información sobre los
eventos, los participantes y los resultados. Para ello se han creado las siguientes clases e interfaces:

La clase Participante, que será cada participante que participa en el torneo y cuyos atributos serán el dni, el nombre,
los apellidos y la edad. Esta clase será la clase padre de la clase ParticipanteCarrera la cual será exclusivamente para
aquellos participantes que participen en las carreras, para poder decidir el ganador y cuanto ha tardado en completarla
le hemos añadido el atributo tiempo.

Para poder comprobar que el dni de los participantes introducidos es correcto se ha creado la clase gestionEventosDeportivosUtils,
que usará el método checkDni para comprobar, mediante una expresión regular, que el dni que se le ha recibido es correcto.

Además de esto también se ha creado una interfaz llamada ganador, esta interface solo tiene el método público obtenerGanador
el cual devolverá un ArrayList de participantes, que solo va a tener el participante que ha ganado.
Esta interfaz será implementada por la clase llamada EventoDeportivo, la cual es abstracta ya que queremos que las clases hijas de
esta sean las que implementen el método obtenerGanador. En esta clase EventoDeportivo también nos encontramos con el método
inscribirParticipante, que como su propio nombre indica será el método encargado de añadir los participantes que reciba, devolviendo
false en caso de que no sea posible añadirlo o true en el caso de que si lo sea.

Como ya se ha mencionado anteriormente la clase EventoDeportivo tiene varias clases hijas: la clase Carrera y la clase EventoDeFutbol.
Dichas clases son los diferentes eventos que tiene el festival. Primero de todo hablaremos de la clase Carrera, esta clase solo añade el
atributo distancia, que se refiere a la distancia de la carrera, y usa el método obtenerGanador, pero usa como criterio el tiempo de los
jugadores que han participado en la carrera para poder sacar a un ganador. En el caso de la clase TorneoDeFutbol añade una ArrayList donde se
almacenarán todos los equipos que participarán en el torneo, además en este caso se usan los puntos de los equipos como criterio para obtener el
ganador mediante el método obtenerGanador, también añade el método inscribirEquipo que introducirá todos los equipos en el ArrayList que se ha 
mencionado antes, devolviendo true si se ha podido inscribir o false en caso contrario.

Finalmente, nos encontramos con la clase Equipo, esta clase implementa la interface Comparable, de esta manera podemos usar el método compareTo para
comparar si dos equipos son iguale. Además, esta clase también usará un ArrayList de participantes, estos participantes serán los jugadores del equipo.
También cuenta con los métodos añadirJugador y eliminarJugador, estos métodos reciben un objeto Participante y lo añaden o lo eliminan del array de jugadores 
devolviendo true, en caso de que se haya realizado con éxito o false en el caso contrario. 





 



