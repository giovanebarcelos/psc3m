package aula04;
/*
  C002 Leia um número inteiro e informar se ele
   é par ou impar.
 */

import java.util.Scanner;

public class C002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número "+numero+" é par!");
        } else {
            System.out.println("O número "+numero+" é impar!");
        }
        scanner.close();
    }
}
