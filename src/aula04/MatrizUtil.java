package aula04;

public class MatrizUtil {
    public int[][] somar(int[][] matrizA, int[][] matrizB) {
        int[][] novaMatriz = new int[matrizA.length][matrizA.length];

        for (int lin = 0; lin < matrizA.length; lin++){
            for (int col = 0; col < matrizA.length; col++){
                novaMatriz[lin][col] = matrizA[lin][col] +
                        matrizB[lin][col];
            }
        }

        return novaMatriz;
    }

    public void mostrar(int[][] matriz) {
        System.out.printf("\n%6s %6d %6d %6d", "Matriz", 0, 1, 2);
        for (int lin = 0; lin < matriz.length; lin++){
            System.out.printf("\n%6d ", lin);
            for (int col = 0; col < matriz.length; col++){
                System.out.printf("%6d ", matriz[lin][col]);
            }
        }
        System.out.println();
    }
}
