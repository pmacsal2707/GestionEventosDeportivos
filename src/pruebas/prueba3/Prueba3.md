## Prueba 3: Inscribir equipos en los torneos

Para esta prueba usaremos dos puntos de ruptura al igual que en los demás, de esta forma podemos ver si se comprueba de manera
correcta que dos equipos no sean iguales:

![PuntosDeRuptura.png](captura%2FPuntosDeRuptura.png)

En este caso vemos como usa el método inscribirEquipo de la clase TorneoDeFutbol, este método usa el nombre para comprobar que 
un equipo ya existe dentro del ArrayList. Al igual que en los otros casos el primer equipo se añade directamente al ArrayList mostrando 
así el mensaje correspondiente:

![EquipoAnadido.png](captura%2FEquipoAnadido.png)

Tras pasar al segundo equipo y comparar el nombre con el primero nos devuelve true ya que se ha logrado inscribir al equipo de correctamente,
mostrando además, el mensaje correspondiente:

![SegundoEquipoAnadido.png](captura%2FSegundoEquipoAnadido.png)

Como ya hemos visto que el método inscribirEquipo funciona correctamente y se añaden de manera correcta al ArrayList, podemos dar la tercera y 
última prueba como terminada.