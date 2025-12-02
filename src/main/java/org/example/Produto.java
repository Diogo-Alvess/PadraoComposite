package org.example;

public class Produto extends ItemCatalogo {

    private double preco;

    public Produto(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String exibir() {
        return "Produto: " + this.getNome() + " - R$ " + this.preco + "\n";
    }
}
