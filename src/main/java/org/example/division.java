package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {


            System.out.println("Bienvenido a la division: ");
            System.out.println("Ingrese el primer numero: ");
            Float numeroUno = sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese su segundo numero: ");
            Float numeroDos = sc.nextFloat();
            Float resultado = dividir(numeroUno, numeroDos);
            System.out.println(resultado);
        }catch (InputMismatchException error){
            System.out.println("El numero es invalido") ;
        }catch (ArithmeticException cero){
            System.out.println("ERROR: " + cero.getMessage());
        }
    }
    public static Float dividir (Float numeroUno, Float numeroDos){
        if (numeroDos == 0){
            throw new ArithmeticException("EL numero dos no puede ser 0");
        }
        return numeroUno/numeroDos;

    }
}
