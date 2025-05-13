package avaliacao_a1;

import java.util.Random;

public class C104 {
    private int[][] matriz;

    public C104(int dimensao) {
        this.matriz = new int[dimensao][dimensao];
        this.preencher();
    }

    private void preencher() {
        Random random = new Random();

        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                this.matriz[lin][col] = random.nextInt(200);
            }
        }
    }

    public static void main(String[] args) {
        C104 matriz = new C104(3);

        matriz.imprimirMediaMatriz();
    }

    private void imprimirMediaMatriz() {
        int media = this.getMedia();

        System.out.printf("A média da matriz é %d",
                media);
    }

    private int getMedia() {
        int total = this.getTotal(),
                qtdeElementos = this.getTamanho();

        return total / qtdeElementos;
    }

    private int getTotal() {
        int total = 0;
        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                total += this.matriz[lin][col];
            }
        }

        return total;
    }

    private int getTamanho() {
        return this.matriz.length * this.matriz.length;
    }
}
