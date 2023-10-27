package practica;

import java.util.Scanner;

/**
 *
 * @author Victor Suarez
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner abc = new Scanner(System.in);
        double[] cantidades = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        int numero;
        do {
            System.out.println("Selecciona una opcion para el arreglo");
            System.out.println("1- Sumar");
            System.out.println("2- Multiplicar");
            System.out.println("3- Salir del programa");
            numero = abc.nextInt();

            switch (numero) {
                case 1:
                    double res = 0;

                    for (int i = 0; i < cantidades.length; i++) {

                        res += cantidades[i];
                    }
                    System.out.println("La suma es " + res);
                    break;

                case 2:
                    double res2 = 1;
                    for (int i = 0; i < cantidades.length; i++) {

                        res2 *= cantidades[i];
                    }
                    System.out.println("La multiplicación es" + res2);

                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;
                    
                default:
                    System.out.println("opcion no vailda");

            }

        } while (numero != 3);
    }
}
