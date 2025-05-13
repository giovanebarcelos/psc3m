package aula09;

import java.math.BigDecimal;
import java.util.Scanner;

public class Onibus {
    public void venderPassagem() {
        TabelaPreco tabelaPreco = new TabelaPreco();

        tabelaPreco.imprimirTabela();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o destino? ");
        int destino = scanner.nextInt();
        System.out.print("Ida e Volta (S/N)? ");
        char idaVolta = scanner.next().toUpperCase().charAt(0);

        BigDecimal preco = tabelaPreco.getPreco(destino,
                idaVolta == 'S');

        System.out.printf("O preço da passagem é %.2f",
                preco.floatValue());
    }
}
