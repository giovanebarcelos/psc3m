package aula08;

/*
M007 Dado uma matriz quadrada de ordem 3 de valores reais
faça um algoritmo que imprima os seguintes relatórios:
a) Qual a Soma dos valores de cada coluna da matriz;
b) Listar os valores que são menores que a média dos valores;
c) Qual a soma dos elementos da diagonal secundária;
 */

public class M007 {
    public static void main(String[] args) {
        float[][] matriz = {{13.8f, 8.13f, 9.16f}, {73.8f, 81.9f, 2.8f},
                {6.13f, 9.3f, 8.21f}};

        float[] somaCol = new float[matriz.length];
        float totalMatriz = 0f;
        float somaDiagonalSecundaria = 0f;
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                somaCol[col] += matriz[lin][col];
                totalMatriz += matriz[lin][col];

                if ((lin+col) == matriz.length-1){
                    somaDiagonalSecundaria += matriz[lin][col];
                }
            }
        }

        // Soma valores colunas: [0] = 13.00; [1] = 8.01; [n] = 9.99f
        System.out.printf("a) Soma dos valores colunas:");
        for (int col = 0; col < somaCol.length; col++){
            System.out.printf(" [%d] = %6.2f;", col, somaCol[col] );
        }

        float mediaValoresMatriz = totalMatriz / (matriz.length * matriz.length);
        System.out.printf("\nb) Valores menores que a média (%6.2f):",
                mediaValoresMatriz);
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                if (matriz[lin][col] < mediaValoresMatriz){
                    System.out.printf("\nmatriz[%d][%d] = %6.2f",
                            lin, col, matriz[lin][col]);
                }
            }
        }

        System.out.printf("\nc) Soma diagonal secundária: %6.2f",
                somaDiagonalSecundaria);
    }
}
