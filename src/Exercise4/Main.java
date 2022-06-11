/*Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

 */

package Exercise4;

public class Main {

    public static void main(String[] args){

        Cliente marta = new Cliente(2200000);
        marta.setNombre("Marta López");
        marta.setEdad(22);
        marta.setTelefono("3005235855");
        System.out.println("Cliente: "+marta.getNombre()+"\nEdad: "+marta.getEdad()+"\nTelefono: "+marta.getTelefono()+"\nCrédito: "+marta.getCredito());

        Trabajador santiago = new Trabajador(2000000);
        santiago.setNombre("Santiago Torres");
        santiago.setEdad(35);
        santiago.setTelefono("3215236951");
        System.out.println("Trabajador: "+santiago.getNombre()+"\nEdad: "+santiago.getEdad()+"\nTelefono: "+santiago.getTelefono()+"\nCrédito: "+santiago.getSalario());




    }


}
