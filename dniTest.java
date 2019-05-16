package dni;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class dniTest {

	@Test
	public void formatoErroneo() throws Exception {
		assertEquals(dni.dni("0000L"), true);
	}
	
	@Test
	public void formatoCorrecto() throws Exception {
		assertEquals(dni.dni("00000022T"), true);
	}
	
	@Test
	public void letraCorrecta() throws Exception {
		char letra = 'T';
		assertEquals(dni.letra(00000000), letra);
	}
	
	@Test
	public void letraIncorrecta() throws Exception {
		char letra = 'T';
		assertEquals(dni.letra(00000022), letra);
	}
	
}
