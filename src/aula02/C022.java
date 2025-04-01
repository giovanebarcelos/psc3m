package aula02;
/*
C022 Dados 3 valores referentes aos lados de um triângulo
     determinar se é EQUILÁTERO (todos os lados são iguais),
     ISÓSCELES (dois lados iguais) ou ESCALENO (todos os
     lados diferentes) .
     EQUILÁTERO → (A = B) E (B = C) ;
     ISÓSCELES → (A = B) OU (A = C) OU (B = C) ;
     ESCALENO → (A <> B) E (B <> C)
 */

import java.util.Scanner;

public class C022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lado A: ");
        int ladoA = scanner.nextInt();
        System.out.print("Lado B: ");
        int ladoB = scanner.nextInt();
        System.out.print("Lado C: ");
        int ladoC = scanner.nextInt();

        String tipoTriangulo = tipoTriangulo(ladoA, ladoB, ladoC);

        System.out.println("O tipo de triangulo é " + tipoTriangulo);
    }

    private static String tipoTriangulo(int ladoA, int ladoB, int ladoC) {
        String tipo;
        if ((ladoA == ladoB) && (ladoB == ladoC)){
            tipo = "Equilátero";
        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }
        return tipo;
    }
}
