package aula05;

public class Prato implements ItemComanda{
    private String descricao;
    private int calorias;
    private int codigo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    Prato (int codigo, String descricao, int calorias){
        this.descricao = descricao;
        this.calorias = calorias;
        this.codigo = codigo;
    }
}
