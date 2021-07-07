package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {

    //ALGORITMO : Número de la suerte
    //1. Solicita fecha de nacimienti en formato String
    //2. Extraer las porciones que hacen referencia al día, mes, año(split)
    //3. Cada porción convertirla en un valor numérico
    //4. Sumar los pedazos y almacenarlos
    //5. Extraer las cifras de la sumatoria
    //6. Sumar esas cifrass y retornar el numeroDeLaSuerte

    //Generar el código java

    //INTERACCION
    public static void saludo() {
        System.out.println("APLICACION NUMERO DE LA SUERTE");
    }

    public static String leerFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la fecha DD/MM/AAAA: ");
        String fecha = sc.next();
        return fecha;
    }

    //LOGICA

    public static int obtenerNumeroSuerte(String fecha){
        //Variable que contiene resultado número de la suerte
        int numeroSuerte = 0;

        //2. Extraer las porciones que hacen referencia al día, mes, año(split)
        String [] arregloFecha = fecha.split("/",3);
        
        //Variable para las versiones numéricas de las partes del año
        int datoDia = Integer.parseInt(arregloFecha[0]);
        int datoMes = Integer.parseInt(arregloFecha[1]);
        int datoAno = Integer.parseInt(arregloFecha[2]);


        //Salida de prueba
        
        System.out.println(datoDia);
        System.out.println(datoMes);
        System.out.println(datoAno);
        
        //4. Sumar los pedazos y almacenarlos
        int sumaPartesFecha  = datoDia + datoMes + datoAno;

        //Convertir a String sumaPartesFecha
        String sumaPartesFechaCadena = Integer.toString(sumaPartesFecha);

        for(int i = 0; i < sumaPartesFechaCadena.length(); i++){
            numeroSuerte = numeroSuerte + Character.getNumericValue(sumaPartesFechaCadena.charAt(i));

        }


        return numeroSuerte;
    }


    public static void main(String[] args) {
        saludo();

        String fecha = leerFecha();
        System.out.println(obtenerNumeroSuerte(fecha));



    }
    
}
