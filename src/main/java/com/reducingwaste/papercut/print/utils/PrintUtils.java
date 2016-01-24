package com.reducingwaste.papercut.print.utils;

import java.util.ArrayList;
import java.util.List;

import com.reducingwaste.papercut.Utils;
import com.reducingwaste.papercut.print.dataobject.PaperType;
import com.reducingwaste.papercut.print.dataobject.PrintingJob;
import com.reducingwaste.papercut.print.dataobject.PrintingType;

/**
 * Printing Utility
 * @author Puneet Gandhi
 */
public class PrintUtils {

	/**
	 * Creates printing job objects from the parsed records of the job file
	 * @param rows
	 * @return
	 */
	public static List<PrintingJob> convertToPrintingJobs(List<String[]> rows) {
		List<PrintingJob> printingJobs = new ArrayList<PrintingJob>();

		PrintingJob printingJob;
		
		Long totalNoOfPages;
		Long totalNoOfColoredPages;
		String firstElement;
		String secondElement;
		String thirdElement;
		boolean doubleSided;

		for (int j =0 ; j<rows.size();j++) {
			if (rows.get(j).length == 3) {
				printingJob = new PrintingJob();
				firstElement = rows.get(j)[0].trim();
				secondElement = rows.get(j)[1].trim();
				thirdElement = rows.get(j)[2].trim();
				
				if (!Utils.isNumeric(firstElement)
						|| !Utils.isNumeric(secondElement)
						|| !Utils.isBoolean(thirdElement)) {
					System.err.println("Invalid Job record in a File, postion in the file [" + j + "]");
					System.err.println(rows.get(j)[0] + "," + rows.get(j)[1] + "," + rows.get(j)[2]);
					System.err.println("====================================");
					continue;
				}
				
				totalNoOfPages = Long.valueOf(firstElement);
				totalNoOfColoredPages = Long.valueOf(secondElement);
				
				if (totalNoOfColoredPages < 0 || totalNoOfColoredPages < 0 || totalNoOfPages < totalNoOfColoredPages){
					System.err.println("Invalid Job record in a File, postion in the file [" + j + "]");
					System.err.println(rows.get(j)[0] + "," + rows.get(j)[1] + "," + rows.get(j)[2]);
					System.err.println("====================================");
					continue;
				}
					
				
				doubleSided = Boolean.valueOf(thirdElement);
				printingJob.setPaperType(PaperType.A4);
				printingJob.setNoOfColoredPages(totalNoOfColoredPages);
				printingJob.setNoOfBnWPages(totalNoOfPages
						- totalNoOfColoredPages);
				printingJob
						.setPrintingType((doubleSided == true) ? PrintingType.DOUBLE_SIDED
								: PrintingType.SINGLE_SIDED);
				printingJobs.add(printingJob);
			} else {
				System.err.println("Invalid record in a File, postion in the file [" + j + "]");
				for (int i=0;i<rows.get(j).length;i++){
					if (i+1 == rows.get(j).length){
						System.err.print(rows.get(j)[i]);
						System.err.println();
						System.err.println("====================================");
					}else{
						System.err.print(rows.get(j)[i] + ",");	
					}
				}
				continue;
			}
		}
		return printingJobs;

	}

}
