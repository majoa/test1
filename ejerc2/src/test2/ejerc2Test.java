package test2;

import static org.junit.Assert.*;

import org.junit.Test;

import ejerc2.Main;

public class ejerc2Test {
	public Main main;
	
	
	@Test
	public void testPositivo() {

		assertTrue(main.comprobarnumero(5)==true);  
		
	}


	@Test
	public void testNegativo() {

		assertTrue(main.comprobarnumero(-1)==false);  
		
	}
	

	@Test
	public void test0esPositivo() {

		assertTrue(main.comprobarnumero(0)==true);  
		
	}
}
