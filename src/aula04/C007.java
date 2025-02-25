package aula04;
/*
C007 Faça um algoritmo que leia dois números quaisquer e informe
     se o primeiro é menor, é igual ou maior que o segundo número digitado.
 */

import java.util.Scanner;

public class C007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2){
            System.out.println("O numero "+numero1+ " é menor que "+numero2);
        } else if (numero1 == numero2){
            System.out.println("O numero "+numero1+ " é igual ao "+numero2);
        } else  {
            System.out.println("O numero "+numero1+ " é maior que "+numero2);
        }
    }

}
