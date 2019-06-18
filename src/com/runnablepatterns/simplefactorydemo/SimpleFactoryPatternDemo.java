package com.runnablepatterns.simplefactorydemo;

import com.runnablepatterns.simplefactorypattern.LaptopCenter;
import com.runnablepatterns.simplefactorypattern.LaptopSimpleFactory;
import com.runnablepatterns.simplefactorypattern.LaptopTypeEnum;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Demo class to demonstrate Simple Factory Pattern usage
 *
 */
public class SimpleFactoryPatternDemo {

	public static void main(String[] args) {
		// create laptop center using the simple factory instance
		LaptopCenter center = new LaptopCenter(new LaptopSimpleFactory());
		
		System.out.println("Processing laptop started \n");
		// process the laptop
		center.processLaptop(LaptopTypeEnum.MEDIUM);
	}
}
