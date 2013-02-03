package edu.wctc.android.timediff.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple implementation of the TimeService interface, using the standard Java
 * Date class.
 * 
 * @author Ryan
 * @see Date
 * 
 */
public class DateTimeService implements TimeService {

	private DateFormat formatter;
	private static final Logger logger = Logger.getLogger(DateTimeService.class
			.getName());

	/**
	 * Constructor defaults the formatter to a "hh:mm" SimpleDateFormat. The
	 * formatter can be changed through a standard setter.
	 */
	public DateTimeService() {
		formatter = new SimpleDateFormat("hh:mm");
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
	}

	/**
	 * Calculate the duration between two time strings.
	 */
	@Override
	public String calculateDuration(String startTime, String endTime) {
		Date start = null;
		Date end = null;

		try {
			start = formatter.parse(startTime);
			end = formatter.parse(endTime);
		} catch (ParseException e) {
			logger.log(Level.SEVERE, "Error parsing the specified time");
		}

		long difference = end.getTime() - start.getTime();
		return formatter.format(new Date(difference));
	}

	/**
	 * Standard getter.
	 * 
	 * @return
	 */
	public DateFormat getFormatter() {
		return formatter;
	}

	/**
	 * Standard setter.
	 * 
	 * @param formatter
	 *            The DateFormat object to use for parsing String dates.
	 */
	public final void setFormatter(DateFormat formatter) {
		this.formatter = formatter;
	}

}
