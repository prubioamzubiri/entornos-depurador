package src.Ejercicios;

import java.util.Scanner;

public class EjercicioUltimoAlfabeticamente {
    
    //Recoge Strings hasta que se escriba por pantalla "."" 
    //y muestra de todos los Strings el que iría último por orden alfabetico.
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();

        String elUltimoAlfabeticamente = entrada;

        while (!entrada.equals(".")) {
            
            if(elUltimoAlfabeticamente.compareTo(entrada) > 0)
            {
                elUltimoAlfabeticamente = entrada;
            }

            entrada = scanner.nextLine();
        }

        System.out.println(elUltimoAlfabeticamente);

        
    }
}
