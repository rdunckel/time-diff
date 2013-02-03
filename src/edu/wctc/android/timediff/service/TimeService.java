package edu.wctc.android.timediff.service;

/**
 * An interface for TimeService objects, used to perform operations on time
 * Strings.
 * 
 * @author Ryan Dunckel
 * 
 */
public interface TimeService {

	String calculateDuration(String startTime, String endTime);

}
