/**
 * 
 */
package com.reducingwaste.papercut.print.dataobject;

/**
 * Printing Type enum
 * @author Puneet Gandhi
 *
 */
public enum PrintingType {
	
	DOUBLE_SIDED (0,"Double Sided"), SINGLE_SIDED (1, "Single Sided");
	
	/**
	 * Index
	 */
	private final int index;
	
    /**
     * Printing type 
     */
	private final String printingType;

    
	/**
	 * Constructor
	 * @param index
	 * @param printingType
	 */
	PrintingType(int index, String printingType) {
        this.index = index;
        this.printingType = printingType;
    }
    /**
     * Getter
     * @return Index
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Getter
     * 
     * @return Printing type
     */
    public String getPrintingType() {
        return printingType;
    }

}
