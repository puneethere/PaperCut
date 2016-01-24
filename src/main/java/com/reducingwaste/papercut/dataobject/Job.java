package com.reducingwaste.papercut.dataobject;

/**
 * Job Data object - abstraction for Printing Job Object
 * 
 * @author Puneet Gandhi
 *
 */
public class Job {

	/**
	 * Cost of the job
	 */
	protected double cost = -1;

	/**
	 * Getter
	 * 
	 * @return
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * Setter
	 * @param cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

}
