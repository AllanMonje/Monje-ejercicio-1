package com.monje;

public class Matematicas {

    public static double elevar (double potencia,double numero){
        double resultado=0;

            resultado = Math.pow(potencia,numero) ;

        System.out.println("El resultado es :"+resultado);
        return resultado;
    }

    public static double raizNumero (double numero){
        double resultado=0;

        resultado = Math.pow(numero,0.5);
        System.out.println("El resultado es :"+resultado);
    return resultado;
    }

    public static boolean numeroPrimo (double numero){
        int contador = 2;
        boolean primo=true;

        if (numero==2){
            System.out.println("Es primo");
        }

        while ((primo) && (contador!=numero)){
            if (numero % contador == 0) {
                primo = false;
                System.out.println("No es primo");
            }else{
                System.out.println("Es primo");
            }
            contador++;
        }
        return primo;
    }


}
