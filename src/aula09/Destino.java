package aula09;

import java.math.BigDecimal;

public class Destino {
    public final int codigo;
    public final String destino;
    public final BigDecimal precoIda;
    public final BigDecimal precoIdaVolta;

    public Destino(int codigo,
                   String destino,
                   BigDecimal precoIda, BigDecimal precoIdaVolta) {
        this.codigo = codigo;
        this.destino = destino;
        this.precoIda = precoIda;
        this.precoIdaVolta = precoIdaVolta;
    }
}
