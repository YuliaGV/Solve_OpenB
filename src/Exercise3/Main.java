/*
Para practicar la encapsulación:


Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

 */

package Exercise3;

public class Main {

    public static void main(String[] args){

        Persona pipe = new Persona();

        pipe.setNombre("Felipe");
        pipe.setEdad(20);
        pipe.setTelefono(2762023);

        System.out.println("Este es "+pipe.getNombre()+", tiene "+pipe.getEdad()+" y su teléfono es "+pipe.getTelefono() );



    }


}
