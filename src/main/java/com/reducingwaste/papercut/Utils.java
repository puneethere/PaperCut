/**
 * 
 */
package com.reducingwaste.papercut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Common utilities
 * 
 * @author Puneet Gandhi
 *
 */
public class Utils {

	/**
	 * Parse CSV file having comma separated records in following structure
	 * <Total Number of Pages>, <Total number of colored pages>, <Boolean to
	 * suggest whether the printing is double sided or single sided>
	 * 
	 * @param file
	 * @return List of records in the file.
	 * @throws IOException
	 */
	public static List<String[]> readCsvFile(final File file)
			throws IOException {

		final List<String[]> rows = new ArrayList<String[]>();

		BufferedReader buff = null;
		String currentLine;
		String[] singleRow;
		try {
			buff = new BufferedReader(new FileReader(file));
			while ((currentLine = buff.readLine()) != null) {
				if (currentLine.trim().length() != 0) {
					singleRow = currentLine.split(Constants.COMMA_SEPARATOR);
					rows.add(singleRow);
				}
			}
		} finally {
			if (buff != null) {
				buff.close();
			}
		}
		return rows;
	}
	/**
	 * Checks whether the string is numeric or not
	 * @param str
	 * @return boolean
	 */
	public static boolean isNumeric(String str) {
		try {
			Long.parseLong(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	/**
	 * Checks whether the string is boolean or not
	 * @param str
	 * @return boolean
	 */
	public static boolean isBoolean(String str) {
		if (str.toLowerCase().equals("true")
				|| str.toLowerCase().equals("false"))
			return true;
		else
			return false;
	}

}
