package edu.wctc.android.timediff.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.wctc.android.timediff.service.DateTimeService;
import edu.wctc.android.timediff.service.TimeService;

/**
 * Test the TimeService to ensure it calculates accurate results.
 * 
 * @author Ryan Dunckel
 * 
 */
public class TimeDiffTest {

	/**
	 * A simple test to ensure the difference between two times is accurate.
	 */
	@Test
	public void dateTimeDurationIsAccurate() {
		TimeService service = new DateTimeService();
		assertEquals(service.calculateDuration("08:37", "10:40"), "02:03");
	}

}
