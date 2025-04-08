package aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Comanda {
    private ArrayList<ItemComanda> menu = new ArrayList<ItemComanda>();
    private ArrayList<ItemComanda> comanda;

    public Comanda(){
        this.menu.add(new Prato(1, "Vegetariano", 180));
        this.menu.add(new Prato(2, "Peixe", 230));
        this.menu.add(new Prato(3, "Frango", 250));
        this.menu.add(new Prato(4, "Carne", 350));
        this.menu.add(new Sobremesa(5,"Abacaxi", 75));
        this.menu.add(new Sobremesa(6, "Sorvete diet", 110));
        this.menu.add(new Sobremesa(7, "Mouse diet", 170));
        this.menu.add(new Sobremesa(8, "Mouse chocolate", 200));
        this.menu.add(new Bebida(9, "Chá", 20));
        this.menu.add(new Bebida(10, "Suco Laranja", 70));
        this.menu.add(new Bebida(11, "Suco Melão", 100));
        this.menu.add(new Bebida(12, "Refrigerante Diet", 65));
    }

    public void fazerPedido() {
        Prato prato = (Prato) this.lerItemComanda(Prato.class);
        Sobremesa sobremesa = (Sobremesa) this.lerItemComanda(Sobremesa.class);
        Bebida bebida = (Bebida) this.lerItemComanda(Bebida.class);

        this.comanda = new ArrayList<ItemComanda>();
        this.comanda.add(prato);
        this.comanda.add(sobremesa);
        this.comanda.add(bebida);
    }

    private ItemComanda lerItemComanda(Class itemComanda) {
        String rotulo = itemComanda.getSimpleName();
        System.out.println("\nMenu " + rotulo + ": ");
        this.listarItemsComanda(itemComanda);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Escolha %s: ", rotulo);
        int codigo = scanner.nextInt();

        return this.getItemComanda(itemComanda, codigo);
    }

    private ItemComanda getItemComanda(Class itemComanda, int codigo) {
        ItemComanda itemRet = null;

        for (ItemComanda item: this.menu){
            if ( item.getClass() == itemComanda
                 && item.getCodigo() == codigo){
                itemRet = item;
            }
        }

        return itemRet;
    }

    private void listarItemsComanda(Class itemComanda) {
        for (ItemComanda item: this.menu){
            if ( item.getClass() == itemComanda){
                System.out.printf("- %d - %s - %dcal\n",
                        item.getCodigo(), item.getDescricao(),
                        item.getCalorias());
            }
        }
    }

    public int getTotalCalorias() {
        int totalCalorias = 0;

        for (ItemComanda escolha: this.comanda){
            totalCalorias += escolha.getCalorias();
        }

        return totalCalorias;
    }
}
