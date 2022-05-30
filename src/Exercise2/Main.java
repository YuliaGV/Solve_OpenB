/*

En este ejercicio practicarás las estructuras de control, para ello deberás crear:

Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
el bloque de código que tendrá el bucle deberá:

Incrementar el valor de la variable en uno cada vez que se ejecute.

Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en
la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */


package Exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*If */

        System.out.println("Ejercicio If");

        int numeroIf;

        System.out.println("Ingrese un número entero");

        numeroIf = input.nextInt();

        if(numeroIf > 0){
            System.out.println("Es positivo");
        }else if(numeroIf < 0){
            System.out.println ("Es negativo");
        }else{
            System.out.println("Es cero");
        }

        /*While*/

        System.out.println("While");

        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        /*Do While*/

        System.out.println("Do While");

        int numeroDoWhile = 2;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);


        /*For*/

        System.out.println("Ejercicio For");

        for(int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        /*Switch*/

        System.out.println("Ejercicio Switch");

        System.out.println("Ingresa el nombre de tu estación favorita:");

        String estacion = input.next();

        switch(estacion.toUpperCase()){
            case "INVIERNO":
                System.out.println("Demasiado frio");
                break;
            case "PRIMAVERA":
                System.out.println("Todo florece");
                break;
            case "VERANO":
                System.out.println("Demasiado calor");
                break;
            case "OTOÑO":
                System.out.println("Caen las hojas de los árboles");
                break;
            default:
                System.out.println("Estación no válida");
        }







    }


}
