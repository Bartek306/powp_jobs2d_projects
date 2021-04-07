package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * Driver manager provides means to setup the driver. It also enables other
 * components and features of the application to react on configuration changes.
 */
public class DriverManager {

	private final MacroProxyDriver currentDriver = new MacroProxyDriver();

	/**
	 * @param driver Set the driver as current.
	 */
	public synchronized void setCurrentDriver(Job2dDriver driver) {
		currentDriver.setDriver(driver);
	}
	/**
	 * @return Current driver.
	 */
	public synchronized MacroProxyDriver getCurrentDriver() {
		return currentDriver;
	}
}
