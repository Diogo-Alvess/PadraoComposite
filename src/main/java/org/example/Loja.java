package org.example;

public class Loja {

    private ItemCatalogo catalogo;

    public void setCatalogo(ItemCatalogo catalogo) {
        this.catalogo = catalogo;
    }

    public String exibirCatalogo() {
        if (this.catalogo == null) {
            throw new NullPointerException("Loja sem catálogo definido");
        }
        return this.catalogo.exibir();
    }
}
