package com.monje;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LectorDatos {
    public static int IngresarNumeroEntero(String mensaje){
        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try{
            int numero= lector.nextInt();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("Ingrese un numero entero");
            return IngresarNumeroEntero(mensaje);
        }
    }

    public static double IngresarNumeroDouble(String mensaje){
        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try{
            double numero= lector.nextDouble();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("Error. Ingrese un numero decimal");
            return IngresarNumeroDouble(mensaje);
        }
    }
}

