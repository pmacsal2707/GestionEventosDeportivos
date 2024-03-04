# GESTION EVENTOS DEPORTIVOS

## Samuel Pérez Pérez
## Pablo Macías Salguero

## Duo dinámico

### **Descripción del proyecto**

Este proyecto consiste en un sistema para gestionar eventos deportivos, para almacenar y gestionar información sobre los 
eventos, los participantes y los resultados. Para ello se han creado las siguientes clases e interfaces:

La clase Participante, que será cada participante que participa en el torneo y cuyos atributos serán el dni, el nombre,
los apellidos y la edad. Esta clase será la clase padre de la clase ParticipanteCarrera la cual será exclusivamente para 
aquellos participante que participen en las carreras, para poder decidir el ganador y cuanto ha tardado en completarla 
le hemos añadido el atributo tiempo. 

Además de esto también se ha creado una interfaz llamada ganador, esta interface solo tiene el método público obtenerGanador
el cual devolverá un ArrayList de participantes, que solo va a tener el participante que ha ganado.
Esta interfaz será implementada por la clase llamada EventoDeportivo, la cual es abstracta ya que queremos que las clases hijas de 
esta sean las que implementen el método obtenerGanador. En esta clase EventoDeportivo también nos encontramos con el método
inscribirParticipante, que como su propio nombre indica será el método encargado de añadir los participantes que reciba, devolviendo
false en caso de que no sea posible añadirlo o true en el caso de que si lo sea.

Como ya se ha mencionado anteriormente la clase EventoDeportivo tiene varias clases hijas: la clase Carrera y la clase EventoDeFutbol.
Dichas clases son los diferentes eventos que tiene el festival. Primero de todo hablaremos de la clase Carrera, 



