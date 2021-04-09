package es.antrob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroTest {

	private Carro herbie;
	
	@BeforeEach
	void setUp() throws Exception {
		herbie = new Carro();
	}

	@Test
	void testarConstrucaoCarro() {
					
		assertEquals( 40.0, herbie.getCapacidadeDeposito(), "A capacidade do dep�sito deve ser igual a 40.0");
		
		assertEquals( 0, herbie.getQuantidadeCombustivel(), "A quantidade de combust�vel deve ser igual a 0" );
			
	}
	
	
	
	

}
