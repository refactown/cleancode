package refactown.cleancode.c06objects;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Pedido { // estado mutável
    private String numero;
    private LocalDate data;
    private List<Item> itens;

    public boolean isValido() {
        return data.plusDays(365).isBefore(LocalDate.now())
                && !itens.isEmpty();
    }

    public void addItem(Item item){ itens.add(item);}

    public void removeItem(Item item){ itens.remove(item);}

    public List<Item> getItens() { // cópia defensiva
        return Collections.unmodifiableList(itens);
    }

    public String getNumero() {
        return numero;
    }
    public LocalDate getData() {
        return data;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}

class Test{
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        if (pedido.getData().plusDays(365).isBefore(LocalDate.now())
                && !pedido.getItens().isEmpty() ){
            // feature envy
        }

        if (pedido.isValido()){
            // encapsulamento
        }

    }
}
