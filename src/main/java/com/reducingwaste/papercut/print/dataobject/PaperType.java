package com.reducingwaste.papercut.print.dataobject;

/**
 * Paper Type Enum
 * @author Puneet Gandhi
 *
 */
public enum PaperType {
	

	A4 (0,"A4");
	
	/**
	 * Enum Index
	 */
	private final int index;
    
	/**
     * Paper Type
     */
	private final String paperType;

    /**
     * Constructor
     * @param index
     * @param paperType
     */
	PaperType(int index, String paperType) {
        this.index = index;
        this.paperType = paperType;
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
     * @return Paper Type
     */
    public String getPaperType() {
        return paperType;
    }

}
