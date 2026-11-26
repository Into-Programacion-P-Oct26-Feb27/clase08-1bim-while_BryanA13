/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;

        while (bandera == true) {
            System.out.println("Estoy en ciclo");

            int salir;
            System.out.println("Desea salir del ciclo ingrese -100.");
            salir = entrada.nextInt();
            if (salir == -100){
                bandera = false;
            }
        }

    }
}
/*
Acabamos de crear un ciclo infinito con una variable boleana que vale como 
verdadera y para salir de este ciclo creamos otra variable, salir, para 
finalizar el ciclo cambiando el valor de la variable boleana a falso, para de
esa manera salir del ciclo
*/

