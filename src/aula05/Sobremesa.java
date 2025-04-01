package aula05;

public class Sobremesa implements ItemComanda {
    public String descricao;
    public int calorias;
    public int codigo;

    Sobremesa (int codigo, String descricao, int calorias){
        this.descricao = descricao;
        this.calorias = calorias;
        this.codigo = codigo;
    }
}
