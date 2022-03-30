package com.revature.interface_example;

/* Interface is a contract.
 * Any class that implements this interface will have to take on the interface's methods.
 * Any attributes under interface become public static final
 */

public interface Boss {
    String name = "Steve";

    public void doWork();

    public void takeTimeOff();
}
