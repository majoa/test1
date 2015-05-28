package test5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ejercicio5.ejercicio5;

public class ejerc5 {

public ejercicio5 ejer5;

	String hola="hola";
	String adios="adios";
	String nuevo="nuevo";
	
	
	@Test
	public void test() {
		assertTrue(ejer5.compararcaracteres(hola,adios).contentEquals("hl"));  
	}

	@Test
	public void test2() {
		assertTrue(ejer5.compararcaracteres(adios,hola).contentEquals("dis"));  
	}
	
	@Test
	public void testigual() {
		assertTrue(ejer5.compararcaracteres(nuevo,nuevo).contentEquals(""));  
	}
	
	
}
