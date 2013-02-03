package edu.wctc.android.timediff.controller;

import edu.wctc.android.timediff.service.TimeService;
import edu.wctc.android.timediff.view.ConsoleView;
import edu.wctc.android.timediff.view.UIView;

/**
 * Controls the flow of the TimeDiff activity.
 * 
 * @author Ryan Dunckel
 * @see UIView
 * @see TimeService
 */
public class TimeDiffController {

	private UIView ui = new ConsoleView();
	private TimeService timeService;

	/**
	 * Constructor, used to inject dependencies for the controller;
	 * 
	 * @param ui
	 *            The UIView to be used to render the result.
	 * @param timeService
	 *            The service to be used for timing methods.
	 */
	public TimeDiffController(UIView ui, TimeService timeService) {
		this.ui = ui;
		this.timeService = timeService;
	}

	/**
	 * Determine the difference between a start time and an end time.
	 */
	public void executeTimeDiff() {
		String startTime = ui.getStartTime();
		String endTime = ui.getEndTime();
		String difference = timeService.calculateDuration(startTime, endTime);
		ui.display(difference);
	}

}
