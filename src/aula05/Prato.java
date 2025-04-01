package aula05;

public class Prato implements ItemComanda{
    public String descricao;
    public int calorias;
    public int codigo;

    Prato (int codigo, String descricao, int calorias){
        this.descricao = descricao;
        this.calorias = calorias;
        this.codigo = codigo;
    }
}
