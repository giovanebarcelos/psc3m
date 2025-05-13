package aula09;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TabelaPreco {

    private ArrayList<Destino> tabela;

    public TabelaPreco(){
        this.tabela = new ArrayList<Destino>();
        
        this.preencherTabela();        
    }

    private void preencherTabela() {
        this.tabela.add(
                new Destino(1, "Região Norte",
                        new BigDecimal(500), new BigDecimal(900))
        );
        this.tabela.add(
                new Destino(2, "Região Nordeste",
                        new BigDecimal(350), new BigDecimal(650))
        );
        this.tabela.add(
                new Destino(3, "Região Centro-Oeste",
                        new BigDecimal(350), new BigDecimal(600))
        );
        this.tabela.add(
                new Destino(4, "Região Sul ",
                        new BigDecimal(300), new BigDecimal(550))
        );

    }

    public void imprimirTabela() {
        System.out.printf("%6s %20s %15s %15s\n",
                "Codigo", "Destino", "Ida", "Ida e Volta");
        for (Destino destino: this.tabela){
            System.out.printf("%6d %20s %.2f %.2f\n",
                    destino.codigo,
                    destino.destino,
                    destino.precoIda.floatValue(),
                    destino.precoIdaVolta.floatValue());
        }
    }

    public BigDecimal getPreco(int codigo, boolean idaVolta) {
        for (Destino destino: this.tabela){
            if (destino.codigo == codigo){
                return idaVolta? destino.precoIdaVolta:
                        destino.precoIda;
            }
        }

        return new BigDecimal(0);
    }
}
