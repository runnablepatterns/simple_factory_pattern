package com.runnablepatterns.simplefactorypattern;

import com.runnablepatterns.decoratorpattern.BigLaptop;
import com.runnablepatterns.decoratorpattern.Laptop;
import com.runnablepatterns.decoratorpattern.MediumLaptop;
import com.runnablepatterns.decoratorpattern.SmallLaptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Simple Factory class to create Laptop instances
 *
 */
public class LaptopSimpleFactory {

	/**
	 * Creates a new Laptop according to the specific type
	 * @param laptopType The specific laptop to create
	 * @return The specific Laptop instance
	 */
	public Laptop createLaptop(LaptopTypeEnum laptopType) {
		// variable to store the laptop
		Laptop laptop = null;
		
		// depending on the type
		switch (laptopType) {
		case SMALL:
			laptop = new SmallLaptop();
			break;
		case MEDIUM:
			laptop = new MediumLaptop();
			break;
		case BIG:
			laptop = new BigLaptop();
			break;
		default:
			break;
		}
		
		// return the specific instance
		return laptop;
	}
}
