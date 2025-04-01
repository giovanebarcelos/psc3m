package aula05;

public class Bebida implements ItemComanda{
    public String descricao;
    public int calorias;
    public int codigo;

    Bebida (int codigo, String descricao, int calorias){
        this.descricao = descricao;
        this.calorias = calorias;
        this.codigo = codigo;
    }
}
