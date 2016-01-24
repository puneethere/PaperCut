package com.reducingwaste.papercut;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.reducingwaste.papercut.print.dataobject.PrintingJob;

/**
 * Unit test for Printing Cost Calculator
 * @author Puneet Gandhi.
 */
public class PrintingCostCalculatorTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public PrintingCostCalculatorTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(PrintingCostCalculatorTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		try {
			List<PrintingJob> printingJobs = PrintingCostCalculator
					.execute(this.getClass().getResource("/printjobs.csv")
							.getFile());
			assertEquals(printingJobs.size(), 4);
			assertEquals(new BigDecimal(4.75).setScale(2,
					BigDecimal.ROUND_HALF_UP),
					new BigDecimal(printingJobs.get(0).getCost()).setScale(2,
							BigDecimal.ROUND_HALF_UP));
			assertEquals(new BigDecimal(6.80).setScale(2,
					BigDecimal.ROUND_HALF_UP), new BigDecimal(printingJobs.get(1).getCost()).setScale(2,
					BigDecimal.ROUND_HALF_UP));
			assertEquals(new BigDecimal(52.40).setScale(2,
					BigDecimal.ROUND_HALF_UP), new BigDecimal(printingJobs.get(2).getCost()).setScale(2,
					BigDecimal.ROUND_HALF_UP));
			assertEquals(new BigDecimal(0.15).setScale(2,
					BigDecimal.ROUND_HALF_UP), new BigDecimal(printingJobs.get(3).getCost()).setScale(2,
					BigDecimal.ROUND_HALF_UP));
		} catch (IOException e) {
			assertFalse(false);
			e.printStackTrace();
		}

	}
}
