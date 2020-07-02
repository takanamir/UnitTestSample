package jp.co.bbreak.sokusen.test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {
	@Test
	public void testIsLeapYear() {
		LeapYear lYear = new LeapYear();
		assertTrue(lYear.isLeapYear(2000));
	}
}