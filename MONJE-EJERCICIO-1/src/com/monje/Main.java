package com.monje;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("\tBienvenido");
        System.out.println("*************************");
        while (true) {

            System.out.println("**Elija la operacion a realizar**");
            System.out.println("1.  Elevar un numero");
            System.out.println("2.  Encontrar raiz cuadrada");
            System.out.println("3.  Verificar si el numero es primo");
            System.out.println("4.  Salir");
            int opcion = LectorDatos.IngresarNumeroEntero("Ingrese opcion: ");

            switch (opcion) {
                case 1:
                    Matematicas digito = new Matematicas();
                    int numero = LectorDatos.IngresarNumeroEntero("Ingrese el numero: ");
                    int potencia = LectorDatos.IngresarNumeroEntero("Ingrese la potencia: ");

                    digito.elevar(potencia, numero);

                    break;
                case 2:
                    Matematicas digito2 = new Matematicas();
                    System.out.println();
                    double numero2 = LectorDatos.IngresarNumeroDouble("Ingrese el numero: ");
                    digito2.raizNumero(numero2);
                    break;
                case 3:
                    Matematicas digito3= new Matematicas();
                    double numero3 = LectorDatos.IngresarNumeroDouble("Ingrese el numero: ");
                    digito3.numeroPrimo(numero3);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            if (opcion == 4) {
                break;
            }
        }
    }

}


