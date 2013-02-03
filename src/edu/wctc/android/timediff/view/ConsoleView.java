package edu.wctc.android.timediff.view;

import java.util.Scanner;

/**
 * A sample implementation of a UIView to be used with the standard System
 * console.
 * 
 * @author Ryan Dunckel
 * 
 */
public class ConsoleView implements UIView {

	private Scanner keyboard;

	/**
	 * Sets the keyboard as an input device (Scanner with System.in)
	 */
	public ConsoleView() {
		keyboard = new Scanner(System.in);
	}

	/**
	 * Get the start time from the user, via the keyboard.
	 */
	@Override
	public String getStartTime() {
		System.out.println("What is the start time? ");
		return keyboard.next();
	}

	/**
	 * Get the end time from the user, via the keyboard.
	 */
	@Override
	public String getEndTime() {
		System.out.println("What is the end time? ");
		return keyboard.next();
	}

	/**
	 * Display a message to the user, via the System console.
	 */
	@Override
	public void display(String time) {
		System.out.println("The difference in time is: " + time);
	}
}
