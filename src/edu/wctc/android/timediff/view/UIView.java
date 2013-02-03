package edu.wctc.android.timediff.view;

/**
 * An interface for the UIView of the TimeDiff demo.
 * 
 * @author Ryan Dunckel
 * 
 */
public interface UIView {

	/**
	 * Get's the start time from the User.
	 * 
	 * @return The start time.
	 */
	public abstract String getStartTime();

	/**
	 * Get's the end time from the User.
	 * 
	 * @return The end time.
	 */
	public abstract String getEndTime();

	/**
	 * Displays a message to the user.
	 * 
	 * @param message
	 *            The message to be displayed.
	 */
	public abstract void display(String message);

}