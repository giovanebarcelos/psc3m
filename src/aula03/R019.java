package aula03;

import java.util.Scanner;

/*
   R019 Faça um programa que calcule e mostre a tabuada de um
        número digitado pelo usuário.
   Author: Samuel
 */

public class R019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = scanner.nextInt();

        int i;
        int resultado;
        for (i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.printf(numero+"X"+i + "=" + resultado + "\n");
        }
    }
}