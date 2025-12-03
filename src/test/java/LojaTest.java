package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveExibirCatalogoCompleto() {

        Categoria eletronicos = new Categoria("Eletrônicos");
        eletronicos.addItem(new Produto("Smartphone", 1500.0));
        eletronicos.addItem(new Produto("Fone Bluetooth", 120.0));

        Categoria vestuario = new Categoria("Vestuário");
        vestuario.addItem(new Produto("Camiseta", 39.90));
        vestuario.addItem(new Produto("Jaqueta", 199.90));

        Categoria catalogoGeral = new Categoria("Catálogo Geral");
        catalogoGeral.addItem(eletronicos);
        catalogoGeral.addItem(vestuario);

        Loja loja = new Loja();
        loja.setCatalogo(catalogoGeral);

        assertEquals(
                "Categoria: Catálogo Geral\n" +
                        "Categoria: Eletrônicos\n" +
                        "Produto: Smartphone - R$ 1500.0\n" +
                        "Produto: Fone Bluetooth - R$ 120.0\n" +
                        "Categoria: Vestuário\n" +
                        "Produto: Camiseta - R$ 39.9\n" +
                        "Produto: Jaqueta - R$ 199.9\n",
                loja.exibirCatalogo()
        );
    }


    @Test
    void deveRetornarExcecaoCatalogoNaoDefinido() {
        try {
            Loja loja = new Loja();
            loja.exibirCatalogo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Loja sem catálogo definido", e.getMessage());
        }
    }
}
