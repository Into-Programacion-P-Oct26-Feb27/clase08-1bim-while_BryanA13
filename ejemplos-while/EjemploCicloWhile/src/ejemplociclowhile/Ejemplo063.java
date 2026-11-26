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
public class Ejemplo063 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        String pais;
        String capital;
        String reporte = "Los paises y sus capitales ingresados son:\n";
        
        while (bandera == true) {
            System.out.println("ingrese un pais");
            pais=entrada.nextLine();
            
            System.out.println("ingrese la capital");
            capital=entrada.nextLine();
            
            reporte = String.format("%s%s\t%s\n", reporte, pais, capital);
            
            String salir;
            System.out.println("Desea salir del ciclo ingrese si.");
            salir = entrada.nextLine();
            if (salir.equals("si")){
                bandera = false;
            }
        }
        
        System.out.printf("%s\n", reporte);

    }
}
/*
Acabamos de crear un ciclo infinito con una variable boleana que vale como 
verdadera y para salir de este ciclo creamos otra variable, salir, para 
finalizar el ciclo cambiando el valor de la variable boleana a falso, para de
esa manera salir del ciclo
*/

