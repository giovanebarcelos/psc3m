package aula06;

/*
M022 Faça um algoritmo que contenha números em um vetor,
verificar e escrever se existem números repetidos no vetor
e em que posições se encontram.
 */

public class M022 {
    public static void main(String[] args) {
        int[] numeros = {1,9,3,9,1,24,73,13,8,3,9};
        boolean[] visitados = new boolean[numeros.length];

        for (int pos = 0; pos < numeros.length; pos++){
            boolean eureka = false;
            visitados[pos] = true;
            for (int check = 0; check < numeros.length; check++){
                if (numeros[pos] == numeros[check]
                    && visitados[check] == false) {
                    if (!eureka){
                        System.out.printf("\n%d - Pos %d ", numeros[pos], pos);
                        eureka = true;
                    }
                    System.out.printf("%d ", check);
                    visitados[check] = true;
                }
            }
        }


    }
}
