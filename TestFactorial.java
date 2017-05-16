import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestFactorial {
	
	@Parameters
	public static Collection<Integer[]> valores(){
		Integer[][] val = {
				{0,1},{1,1},{2,2},{3,6},{4,24},{5,120} };
		return Arrays.asList(val);
	};
	
	private int entrada,salida;
	
	public TestFactorial(int e, int s){
		entrada = e;
		salida = s;
	}
	
	@Test
	public void factorialEntradaSalida() {
		assertEquals(new Integer(salida),
					 new Integer(Factorial.calcular(entrada)));
	}
}
