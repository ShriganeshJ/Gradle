package com.nt.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nt.basic.Addition;

public class MathOperationTest {
	@Test
	public void testPositive() {
		int expected = 300;
		int actual = new Addition().sum(100, 200);
		assertEquals("Test Positive", expected, actual);

	}

	@Test
	public void testZero() {
		int expected = 0;
		int actual = new Addition().sum(0,0);
		assertEquals("Test Zero",expected, actual);

	}

	@Test
	public void testMixed() {
		int expected = -100;
		int actual = new Addition().sum(200, -300);
		assertEquals("Test Mixed",expected, actual);

	}
}
