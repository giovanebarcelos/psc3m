package aula10;

/*
1. Ordenação Crescente com Bubble Sort
   Implemente o algoritmo Bubble Sort
   para ordenar um vetor de números inteiros
   em ordem crescente.
*/

import java.util.Random;

public class BubbleSort {
    private int[] numbers;

    public BubbleSort(int size) {
        this.numbers = new int[size];

        this.fillNumbers();
    }

    private void fillNumbers() {
        Random random = new Random();

        for (int pos = 0; pos < this.numbers.length; pos++){
            this.numbers[pos] = random.nextInt(200);
        }
    }

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort(13);

        bubble.print();
        bubble.sort();
        bubble.print();
    }

    private void sort() {
        int size = this.numbers.length;
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++ ){
                if (this.numbers[j] > this.numbers[j + 1] ){
                    int temp = this.numbers[j];
                    this.numbers[j] = this.numbers[j + 1];
                    this.numbers[j+1] = temp;
                }
            }
        }

    }

    private void print() {
        System.out.print("\nNumbers: ");
        for (int number: this.numbers){
            System.out.printf("%d ", number);
        }
    }
}
