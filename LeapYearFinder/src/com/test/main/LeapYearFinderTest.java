package com.test.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.main.LeapYearFinder;

class LeapYearFinderTest {
	
	@Test
	void testLeapYear() {
		LeapYearFinder leapYearFinder = new LeapYearFinder();
		boolean expected = true;
		boolean actual = leapYearFinder.isLeapYear(2004);
		assertEquals(expected, actual,"The isLeapYear method should return leap year or not");
	}

}
