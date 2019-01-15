package ClasePoo;

/*clase sólo estamos definiendo la plantilla con la que vamos a
trabajar, pero para poder usar esta plantilla necesitamos crear objetos.
a partir de esta plantilla. Definir la clase no crea un objeto en automático, tenemos que crearlos
 * 
 */
public class Persona {
//Atributos de una clase
    //No es necesario asignar valores
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    //Metodos de la clase
    //Los usaran los objetos de esta clase
    public void desplegarNombre() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido Paterno : " + apellidoPaterno);
        System.out.println("Apellido Materno : " + apellidoMaterno);
    }
      
}
