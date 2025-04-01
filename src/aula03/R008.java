package aula03;

/*
R008 Escreva um algoritmo que leia um valor inteiro,
calcule e mostre o seu fatorial.
 */

import java.util.Scanner;

public class R008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = scanner.nextInt();

        int fatorialFor = fatorialFor(numero);
        int fatorialWhile = fatorialWhile(numero);
        int fatorialDoWhile = fatorialDoWhile(numero);

        System.out.printf("Fatorial -> \nFor: %d\nWhile: %d\nDo While: %d",
                          fatorialFor, fatorialWhile, fatorialDoWhile);
    }

    private static int fatorialDoWhile(int numero) {
        int fatorial = 1,
                fator = 1;

        do {
            fatorial *= fator;
            fator++;
        } while (fator <= numero);

        return fatorial;
    }

    private static int fatorialWhile(int numero) {
        int fatorial = 1,
                fator = 1;

        while ( fator <= numero){
            fatorial *= fator;
            fator++;
        }

        return fatorial;
    }

    private static int fatorialFor(int numero) {
        int fatorial = 1;

        for (int fator = 1; fator <= numero; fator++){
            fatorial = fatorial * fator;
        }
        return fatorial;
    }
}
