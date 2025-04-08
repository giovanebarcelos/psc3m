package aula05;
/*
M001 Faça um algoritmo que informe a quantidade total de calorias da refeição a partir da
escolha do usuário que deverá informar o prato, a sobremesa e bebida, conforme tabela
abaixo:
PRATO SOBREMESA BEBIDA
Vegetariano 180cal Abacaxi 75cal Chá 20cal
Peixe 230cal Sorvete diet 110cal Suco de Laranja 70cal
Frango 250cal Mousse diet 170cal Suco melão 100cal
Carne 350cal Mouse chocolate 200cal Refrigerante diet 65cal
 */
/*
PlantUML
@startuml
class M001App {
  + main()
}

interface ItemComanda {
}

class Comanda {
  + Comanda()
  - ArrayList<ItemComanda> menu;
  - ArrayList<ItemComanda> comanda;

  + void fazerPedido()
  - int getTotalCalorias()
  - void lerItemComanda(
         Class ItemComanda)
  - void listarItemsComanda(
         Class tipoItemComanda)
  - ItemComanda getItemComanda(
         Class tipo, int codigo)

}

class Prato {
  + String descricao
  + int calorias
  + int codigo

  + Prato( int codigo, String descricao,
          int calorias )
}

class Sobremesa {
  + String descricao
  + int calorias
  + int codigo

  + Sobremesa( int codigo, String descricao,
          int calorias )
}

class Bebida {
  + String descricao
  + int calorias
  + int codigo

  + Bebida( int codigo,String descricao,
          int calorias )
}


Prato ..|> ItemComanda
Sobremesa ..|> ItemComanda
Bebida ..|> ItemComanda
Comanda --> ItemComanda
M001App --> Comanda : usa


@enduml
 */

public class M001App {
    public static void main(String[] args) {
        Comanda comanda = new Comanda();

        comanda.fazerPedido();

        System.out.printf("Quantidade Total de Calorias: %dcal",
                comanda.getTotalCalorias());
    }
}
