package com.intiformation.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {
	
	private Calculatrice calcul;

	@Before
	public void setUp() throws Exception {
		calcul = new Calculatrice();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals("Est ce que l'addition est correcte",10, calcul.add(5, 5));
	}
	
	@Test
	public void testMul() {
		assertEquals("Est ce que la multiplication est correcte",10, calcul.mul(5, 2));
	}

}
