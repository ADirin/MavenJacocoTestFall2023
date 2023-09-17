package fi_maven_test;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalCulateTest {

	@Test
	public void laskSummaTest() {
		
		assertEquals(6, CalCulate.laskeSumma(4, 2));
		assertEquals(-1, CalCulate.laskeSumma(-2, 1));
	}
	
	@Test
public  void laskMinnusTest() {
		assertEquals(1, CalCulate.laskeMinnus(3, 2));
        assertEquals(-3, CalCulate.laskeMinnus(0, 3));
	}
	
	
	@Test
public  void laskKertausTest() {
		assertEquals(6, CalCulate.laskeKerta(2, 3));
        assertEquals(0, CalCulate.laskeKerta(0, 5));
}
	
}
