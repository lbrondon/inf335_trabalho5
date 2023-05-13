package br.unicamp.ic.inf335.app.TRABALHO4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {

	@Test
	void testCompareTo() {
		ProdutoBean prod1 = new ProdutoBean("0001", "Ede 20 Pro", "256GB", 20000.00, "SP");
		ProdutoBean prod2 = new ProdutoBean("0002", "Ede 40+", "256GB", 10000.00, "SP");
		
		if (prod1.getValor() > prod2.getValor()) {
			assertEquals(prod1.compareTo(prod2), (int)1);
			System.out.println("valor: " + 1);		
		} 
		
		prod1.setValor(5000.00);
		if (prod1.getValor() < prod2.getValor()) {
			assertEquals(prod1.compareTo(prod2), (int)-1);
			System.out.println("valor: " + -1);
		}
		
		prod1.setValor(10000.00);
		if (prod1.getValor() == prod2.getValor()){

			assertEquals(prod1.compareTo(prod2), (int)0);
			System.out.println("valor: " + 0);
		}
	}

}
