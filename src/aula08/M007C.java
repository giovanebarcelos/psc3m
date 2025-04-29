package aula08;

import java.util.Random;

public class M007C {
    private float[][] matriz;

    public M007C(int tamanhoMatrizQuadratica) {
        this.matriz = new float[tamanhoMatrizQuadratica][tamanhoMatrizQuadratica];

        this.preencherMatriz();
    }

    private void preencherMatriz() {
        Random random = new Random();
        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                this.matriz[lin][col] = random.nextInt(200);
            }
        }
    }

    public void imprimirRelatorio() {
        this.imprimirValoresColunasMatriz();
        this.listarValoresMenoresMedia();
        this.imprimirSomaDiagonalSecundaria();
    }

    private void imprimirSomaDiagonalSecundaria() {
        float somaDiagonalSecundaria = this.getSomaDiagonalSecundaria();

        System.out.printf("\nc) Soma diagonal secundária: %6.2f",
                somaDiagonalSecundaria);
    }

    private float getSomaDiagonalSecundaria() {
        float somaDiagonalSecundaria = 0f;

        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[lin].length; col++){
                if ((lin+col) == this.matriz.length - 1){
                    somaDiagonalSecundaria = this.matriz[lin][col];
                }
            }
        }

        return somaDiagonalSecundaria;
    }

    private void listarValoresMenoresMedia() {
        float mediaValoresMatriz = this.getMediaValoresMatriz();

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
    }

    private float getMediaValoresMatriz() {
        float totalMatriz = this.getTotalMatriz();

        return totalMatriz / (this.matriz.length * this.matriz.length);
    }

    private float getTotalMatriz() {
        float totalMatriz = 0f;

        for (int lin = 0; lin < this.matriz.length; lin++){
            for (int col = 0; col < this.matriz[lin].length; col++){
                totalMatriz += this.matriz[lin][col];
            }
        }

        return totalMatriz;
    }

    private void imprimirValoresColunasMatriz() {
        float[] somaColuna = this.getSomaColunas();

        System.out.printf("a) Soma dos valores colunas:");
        for (int col = 0; col < somaColuna.length; col++){
            System.out.printf(" [%d] = %6.2f;", col, somaColuna[col] );
        }
    }

    private float[] getSomaColunas() {
        float[] somaColunas = new float[this.matriz.length];

        for (int lin = 0; lin < this.matriz.length; lin++) {
            for (int col = 0; col < this.matriz[lin].length; col++) {
                somaColunas[col] += this.matriz[lin][col];
            }
        }

        return somaColunas;
    }
}
