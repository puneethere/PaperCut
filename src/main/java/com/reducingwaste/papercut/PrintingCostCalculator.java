package com.reducingwaste.papercut;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.reducingwaste.papercut.print.dataobject.PrintingJob;
import com.reducingwaste.papercut.print.utils.PrintUtils;

/**
 * Calculates cost of the Printing
 *
 */
public class PrintingCostCalculator 
{
   
	/**
	 * Main method called by following mvn target:
	 * mvn exec:java
	 * @param Complete Location of the Job File
	 */
	public static void main(String[] args){
		try {
			execute(args[0]);
		} catch (IOException e) {
			System.err.println("Error Occured while reading the file " + args[0]);
			e.printStackTrace();
		}
	}
	
	/**
	 * Executes parsing of the file and calculating the costs for
	 * each of job listed in the file
	 * @param fileName
	 * @return List of printing jobs
	 * @throws IOException
	 */
	public static List<PrintingJob> execute(final String fileName) throws IOException{
		File jobs = new File(fileName);
		
		List<String[]> rows= Utils.readCsvFile(jobs);
		List<PrintingJob> printingJobs = PrintUtils.convertToPrintingJobs(rows);
		double totalCost = 0;
		
		for (PrintingJob printingJob: printingJobs){
			System.out.println("JOB Details:");
			System.out.println(printingJob);
			totalCost = totalCost + printingJob.getCost();
			System.out.println("====================================");
		}
		System.out.println("Total Cost of Jobs: " + totalCost);
		return printingJobs;
	}
	
	
}
