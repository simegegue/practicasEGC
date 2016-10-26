package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
	
	@Test
	public void testSum(){
		assertEquals(6,sum(4,2));
		
	}
	
	@Test
	public void testSumWithZero(){
		assertEquals(3,sum(3,0));
		assertEquals(3,sum(0,3));
	}
	@Test
	public void testSumWithNeg(){
		assertEquals(4,sum(6,-2));
		assertEquals(4,sum(-2,6));
		assertEquals(-7,sum(-3,-4));
	}
	
	private int sum(int i, int j){
		return i+j;
	}
}
