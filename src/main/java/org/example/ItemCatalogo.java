package org.example;

public abstract class ItemCatalogo {

    private String nome;

    public ItemCatalogo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String exibir();
}
