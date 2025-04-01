package aula04;

/*
M008 Desenvolva um algoritmo que some duas matrizes 3x3
e coloque o resultado numa terceira matriz.
 */

public class M008 {
    public static void main(String[] args) {
        int[][] matrizA = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrizB = {{9,8,7}, {6,5,4}, {3,2,1}};

        MatrizUtil matrizUtil = new MatrizUtil();

        int[][] matrizC = matrizUtil.somar( matrizA, matrizB);
        matrizUtil.mostrar(matrizA);
        matrizUtil.mostrar(matrizB);
        matrizUtil.mostrar(matrizC);
    }
}
