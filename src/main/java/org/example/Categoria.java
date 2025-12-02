package org.example;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemCatalogo {

    private List<ItemCatalogo> itens;

    public Categoria(String nome) {
        super(nome);
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemCatalogo item) {
        this.itens.add(item);
    }

    @Override
    public String exibir() {
        String saida = "Categoria: " + this.getNome() + "\n";
        for (ItemCatalogo item : itens) {
            saida += item.exibir();
        }
        return saida;
    }
}
