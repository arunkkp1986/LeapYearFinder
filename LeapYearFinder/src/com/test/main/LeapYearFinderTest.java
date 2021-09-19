package com.test.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.main.LeapYearFinder;

class LeapYearFinderTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testLeapYear() {
		LeapYearFinder leapYearFinder = new LeapYearFinder();
		boolean expected = true;
		boolean actual = leapYearFinder.isLeapYear(2003);
		assertEquals(expected, actual,"The isLeapYear method should return leap year or not");
	}

}
