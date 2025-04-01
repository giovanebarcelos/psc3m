package aula04;

/*
M006 Dado uma matriz quadrada de ordem 3 faça um algoritmo
que verifique se a matriz é simétrica (aij=aji).

Author: Luiz H.
 */

public class M006 {
    public static void main(String[] args) {
        int[][] matrizA = {{3,6,9},{6,4,5},{9,5,1}};
        int[][] matrizB = {{1,2,3},{4,5,6},{7,8,9}};

        Matriz matriz = new Matriz();
        System.out.println("Matriz A é Simétrica? " +
                matriz.ehsimetrica(matrizA));
        System.out.println("Matriz B é Simétrica? " +
                matriz.ehsimetrica(matrizB));
    }
}
