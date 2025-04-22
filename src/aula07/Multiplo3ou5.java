package aula07;

/*
https://projecteuler.net/problem=1
 */

public class Multiplo3ou5 {
    public static void main(String[] args) {
        int limite = 1000;
        long soma = getSomaDosMultiplos3ou5MenoresQue(limite);

        System.out.printf("A soma dos múltiplos de 3 ou 5 menores que %d é %d",
                limite, soma);
    }

    private static long getSomaDosMultiplos3ou5MenoresQue(int limite) {
        long soma = 0;

        for (int numero = 1; numero < limite; numero++){
            if (numero % 3 == 0 || numero % 5 == 0){
                soma += numero;
            }
        }

        return soma;
    }
}
