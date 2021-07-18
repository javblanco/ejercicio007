package es.cic.bootcamp.ejercicio007;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CrearCocheTest {
	
	private CrearCoche cut;

	@BeforeEach
	void setUp() throws Exception {
		this.cut = new CrearCoche();
	}

	@Test
	void testEncender() {
		
		int resultado = cut.encender();
		
		if (resultado > 3) {
			System.out.println("El coche se arrancó correctamente con una potencia de " +resultado);
			assertTrue( resultado > 3, String.format("El coche se ha encendido correctamente con una potencia de %d ", resultado));
		} else {
			System.out.println("\"El coche no se ha encendido correctamente, la potencia ha sido " +resultado);
			assertTrue( resultado < 3, String.format("El coche no se ha encendido correctamente, la potencia ha sido de %d ", resultado));
		}
		
	}

}
