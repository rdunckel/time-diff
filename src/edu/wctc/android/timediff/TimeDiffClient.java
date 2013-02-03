package edu.wctc.android.timediff;

import edu.wctc.android.timediff.controller.TimeDiffController;
import edu.wctc.android.timediff.service.DateTimeService;
import edu.wctc.android.timediff.view.ConsoleView;

/**
 * Demo client for the time-difference lab. The objective of the lab was to
 * write a program that asked the user for a start time and end time, then
 * display the time difference back to them.
 * 
 * @author Ryan Dunckel
 * 
 */
public class TimeDiffClient {

	/**
	 * Main method to execute the demo.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TimeDiffController controller = new TimeDiffController(
				new ConsoleView(), new DateTimeService());

		controller.executeTimeDiff();
	}
}
