package br.unicamp.ic.inf335.app.TRABALHO4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {

    private AnuncianteBean anunciante;
    private AnuncioBean anuncio1;
    private AnuncioBean anuncio2;
    private AnuncioBean anuncio3;
    private ProdutoBean produto1;
    private ProdutoBean produto2;
    private ProdutoBean produto3;

    @BeforeEach
    public void setUp() {
        anunciante = new AnuncianteBean();
        anuncio1 = new AnuncioBean();
        anuncio2 = new AnuncioBean();
        anuncio3 = new AnuncioBean();

        produto1 = new ProdutoBean("0001", "Ede 20 Pro", "256GB", 100.00, "SP");
        produto2 = new ProdutoBean("0002", "Ede 30 Pro", "256GB", 200.00, "SP");
        produto3 = new ProdutoBean("0003", "Ede 40 Pro", "256GB", 300.00, "SP");

        anuncio1.setProduto(produto1);
        anuncio1.setDesconto(0.1);
        anuncio2.setProduto(produto2);
        anuncio2.setDesconto(0.1);
        anuncio3.setProduto(produto3);
        anuncio3.setDesconto(0.1);
    }

    @AfterEach
    public void tearDown() {
        anunciante = null;
        anuncio1 = null;
        anuncio2 = null;
        anuncio3 = null;
        produto1 = null;
        produto2 = null;
        produto3 = null;
    }

    @Test
    public void testAddAnuncio() {
        anunciante.addAnuncio(anuncio1);
        anunciante.addAnuncio(anuncio2);
        assertEquals(2, anunciante.getAnuncios().size());
    }

    @Test
    public void testRemoveAnuncio() {
        anunciante.addAnuncio(anuncio1);
        anunciante.addAnuncio(anuncio2);
        anunciante.addAnuncio(anuncio3);
        anunciante.removeAnuncio(2);
        assertEquals(2, anunciante.getAnuncios().size());
        assertFalse(anunciante.getAnuncios().contains(anuncio3));
    }

    @Test
    public void testValorMedioAnuncios() {
        anunciante.addAnuncio(anuncio1);
        anunciante.addAnuncio(anuncio2);
        anunciante.addAnuncio(anuncio3);
        double valorEsperado = (anuncio1.getValor() + anuncio2.getValor() + anuncio3.getValor())/3.0;
        assertEquals(valorEsperado, anunciante.valorMedioAnuncios());
    }
}
