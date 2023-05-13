package br.unicamp.ic.inf335.app.TRABALHO4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {
	
	@Test
	void testGetValor() {
		ProdutoBean prod = new ProdutoBean("0001", "Ede 20 Pro", "256GB", 100.00, "SP");
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(prod);
		anuncio.setDesconto(0.2); // [0.0, 1.0]
		assertEquals(anuncio.getValor(), (double)80);
	}
	
	@Test
	void testSetDesconto() {
		ProdutoBean prod = new ProdutoBean("0001", "Ede 20 Pro", "256GB", 100.00, "SP");
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(prod);
		anuncio.setDesconto(0.2); // [0.0, 1.0]
		assertTrue(anuncio.getDesconto() >= 0.0 && anuncio.getDesconto() <= 1.0);		
	}
	
}
