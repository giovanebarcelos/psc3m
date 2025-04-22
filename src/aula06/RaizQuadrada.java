package aula06;

public class RaizQuadrada {
    public static void main(String[] args) {
        // Raiz quadrada de um número
        int numero = 5;

        System.out.printf("Raiz quadrada do número %d = %f",
                numero, Math.sqrt(numero));
        System.out.printf("Raiz quadrada do número %d = %f",
                numero, Math.pow(numero, 1/2.0));

    }
}
