package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt();

        var digitos = numeroDigitos(numero);
        System.out.println("El número tiene " + digitos + " cifras");

    }
    public static int numeroDigitos(int numero) {
        var cifras = 0;

        while (numero != 0) {
            numero /= 10;
            cifras++;
        }

        return cifras;
    }
    
}


