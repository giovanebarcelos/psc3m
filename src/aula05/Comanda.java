package aula05;

import java.beans.BeanInfo;
import java.util.ArrayList;

public class Comanda {
    private ArrayList<ItemComanda> itemsComanda = new ArrayList<ItemComanda>();

    public Comanda(){
        this.itemsComanda.add(new Prato(1, "Vegetariano", 180));
        this.itemsComanda.add(new Prato(2, "Peixe", 230));
        this.itemsComanda.add(new Prato(3, "Frango", 250));
        this.itemsComanda.add(new Prato(4, "Carne", 350));
        this.itemsComanda.add(new Sobremesa(5,"Abacaxi", 75));
        this.itemsComanda.add(new Sobremesa(6, "Sorvete diet", 110));
        this.itemsComanda.add(new Sobremesa(7, "Mouse diet", 170));
        this.itemsComanda.add(new Sobremesa(8, "Mouse chocolate", 200));
        this.itemsComanda.add(new Bebida(9, "Chá", 20));
        this.itemsComanda.add(new Bebida(10, "Suco Laranja", 70));
        this.itemsComanda.add(new Bebida(11, "Suco Melão", 100));
        this.itemsComanda.add(new Bebida(12, "Refrigerante Diet", 65));
    }

    public void fazerPedido() {
        Prato prato = new Prato(0,"",0);
        Sobremesa sobremesa = new Sobremesa(0,"",0);
        Bebida bebida = new Bebida(0,"",0);

        this.lerItemComanda(prato);
        this.lerItemComanda(sobremesa);
        this.lerItemComanda(bebida);
    }

    private void lerItemComanda(ItemComanda itemComanda) {
        System.out.println("Menu " + itemComanda.getClass().getSimpleName()+": ");
        this.listarItemsComanda(itemComanda);
    }

    private void listarItemsComanda(ItemComanda itemComanda) {

    }
}
