package aula04;

/*
M013 Ler um vetor A de 15 números. Após, ler mais um número
e guardar em uma variável X.
Armazenar em um vetor M o resultado de cada elemento de A
multiplicado pelo valor X.
Logo após, imprimir o vetor M.
 */

public class M013 {
    public static void main(String[] args) {
        int[] vA = {6,9,3};
        int numero = 3;

        int[] vM = new int[vA.length];

        for (int pos = 0; pos < vA.length; pos++){
            vM[pos] = vA[pos] * numero;
            System.out.printf("vM[%d] = %d\n", pos, vM[pos]);
        }
    }
}
