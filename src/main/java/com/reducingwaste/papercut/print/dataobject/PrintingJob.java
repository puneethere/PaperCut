package com.reducingwaste.papercut.print.dataobject;

import com.reducingwaste.papercut.dataobject.Job;

/**
 * Printing Job
 * @author Puneet Gandhi
 *
 */
public class PrintingJob extends Job {

	/**
	 * Paper Type A4 and others
	 */
	private PaperType paperType;

	/**
	 * Number of Colored Pages
	 */
	private long noOfColoredPages;

	/**
	 * Number of Black and White pages
	 */
	private long noOfBnWPages;
	
	/**
	 * Printing Type - Double sided or Single sided
	 */
	private PrintingType printingType;

	/**
	 * Getter
	 * @return Paper Type
	 */
	public PaperType getPaperType() {
		return paperType;
	}
	
	/**
	 * Setter
	 * @param paperType
	 */

	public void setPaperType(PaperType paperType) {
		this.paperType = paperType;
	}

	/**
	 * Getter 
	 * @return number of colored pages
	 */
	public long getNoOfColoredPages() {
		return noOfColoredPages;
	}

	/**
	 * Setter
	 * @param noOfColoredPages
	 */
	public void setNoOfColoredPages(long noOfColoredPages) {
		this.noOfColoredPages = noOfColoredPages;
	}

	/**
	 * Getter
	 * @return  number of black and white pages
	 */
	public long getNoOfBnWPages() {
		return noOfBnWPages;
	}

	/**
	 * Setter
	 * @param noOfBnWPages
	 */
	public void setNoOfBnWPages(long noOfBnWPages) {
		this.noOfBnWPages = noOfBnWPages;
	}

	/**
	 * Getter
	 * @return Printing Type
	 */
	public PrintingType getPrintingType() {
		return printingType;
	}

	/**
	 * Setter
	 * @param printingType
	 */
	public void setPrintingType(PrintingType printingType) {
		this.printingType = printingType;
	}

	/**
	 * Getter
	 * @return Cost of the printing job
	 */
	public double getCost() {
		if (this.cost != -1)
			return cost;
		
		switch (this.getPaperType()) {

		case A4:
			if (this.getPrintingType().equals(PrintingType.DOUBLE_SIDED)) {
				this.cost = (0.10 * noOfBnWPages) + (0.20 * noOfColoredPages);
			} else if (this.getPrintingType().equals(PrintingType.SINGLE_SIDED)) {
				this.cost = (0.15 * noOfBnWPages) + (0.25 * noOfColoredPages);
			}
			break;
		default:
			System.err.println("Invalid Paper Type");
			break;
		}
		return this.cost;
	}
	
	/**
	 * String representation of the job
	 */
	@Override
	public String toString(){
		return "Paper Type: " + this.getPaperType().getPaperType() 
				+ "\n" +
				"Printing Type: " + this.getPrintingType().getPrintingType()
				+ "\n" +
				"Number of Colored Pages: " + this.getNoOfColoredPages()
				+ "\n" +
				"Number of Black and White Pages: " + this.getNoOfBnWPages()
				+ "\n" +
				"Cost: " + this.getCost();
				
	}

}
