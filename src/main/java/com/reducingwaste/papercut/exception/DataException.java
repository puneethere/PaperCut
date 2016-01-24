/**
 * 
 */
package com.reducingwaste.papercut.exception;

/**
 * Exception class for the application
 * @author Puneet Gandhi
 *
 */
public class DataException extends Exception{
	
    
    /**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 5676410350703509132L;

	/**
     *	Constructor
     * @param message
     */
    public DataException(String message) {
        super(message);
    }

    /**
     * Constructor
     * @param message
     * @param e
     */
    public DataException(String message, Throwable e) {
        super(message, e);
    }


}
