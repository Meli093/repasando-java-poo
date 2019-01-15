/*tenemos la clase Persona, y a partir de esta
plantilla podemos crear objetos concretos para poder trabajar con sus
características y atributos. Por ejemplo hemos creado dos objetos de tipo Persona,
y cada uno tiene características similares pero con valores distintos.
 * 
 */
package ClasePoo;

/**
 *
 * @author MR
 */
public class PersonaPrueba {
    public static void main(String args[]){
        //Creacion de un objeto
        Persona p1 = new Persona();
        
        //LLamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        p1.desplegarNombre();
        
        //Modificar valores
        p1.nombre = "Juan";//El nombre de la variable puede ser cualquiera que elijamos.
        //pero no debe tener caracteres especiales, o espacios.
        //Para acceder a los atributos de nuestras clases vamos a utilizar el operador
        p1.apellidoPaterno = "Esparza";
        p1.apellidoMaterno = "Lara";
        
        //Volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto Persona");
        p1.desplegarNombre();
        
    }
}
    

