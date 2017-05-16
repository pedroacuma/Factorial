import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void factorial0es1() {
		assertEquals(1,Factorial.calcular(0));
	}
	
	public void factorial1es1(){
		assertEquals(1,Factorial.calcular(1));
	}

}
