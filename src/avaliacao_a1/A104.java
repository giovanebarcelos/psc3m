package avaliacao_a1;

/*
A104) (1,5 ptos) Escreva um algoritmo que leia ou
preencha de qualquer forma uma matriz quadrada de
terceira ordem M(3,3), 3 linhas e 3 colunas, e
faça a média de todos os valores desta matriz.
Depois de calculado mostre a média da matriz.
A média é a soma de todos os elementos dividido
pela quantidade de posições da matriz.
Ex: matriz = {{1,2,3},{1,2,3},{1,2,3}}
Total = 18, portanto a média é → 18/9 = 2
*/

public class A104 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{1,2,3},{1,2,3}};

        int somaMatriz = 0;
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                somaMatriz += matriz[lin][col];
            }
        }

        float mediaMatriz = somaMatriz /
                (matriz.length * matriz.length);

        System.out.printf("\nMédia matriz é %.2f",
                mediaMatriz);
    }
}
