package com.runnablepatterns.simplefactorypattern;

import com.runnablepatterns.decoratorpattern.Laptop;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle laptop shipment and assembly processe
 *
 */
public class LaptopCenter {
	
	/**
	 * Variable to store the laptop factory
	 */
	private LaptopSimpleFactory laptopFactory;
	
	/**
	 * Overloaded constructor that receives the specific factory to use
	 * @param _laptopFactory The factory to use to create objects
	 */
	public LaptopCenter (LaptopSimpleFactory _laptopFactory) {
		// set the factory
		laptopFactory = _laptopFactory;
	}
	
	/**
	 * Method that creates the specific laptop type and then process it before shipping it to client
	 * @param laptopType The specific laptop type to create
	 * @return The specific instance of Laptop
	 */
	public Laptop processLaptop (LaptopTypeEnum laptopType) {
		// variable to store the laptop type
		Laptop laptop = null;
		
		// create the laptop using the factory
		laptop = laptopFactory.createLaptop(laptopType);
		
		// process the laptop
		review(laptop);
		installOS(laptop);
		pack(laptop);
		destination(laptop);
		
		// the laptop instance type
		return laptop;
	}
	
	/**
	 * Perform review process
	 * @param laptop The laptop to review
	 */
	public void review(Laptop laptop) {
		System.out.println(String.format("Reviewing the laptop: %s", laptop.getDescription()));
	}
	
	/**
	 * Perform OS installation
	 * @param laptop The laptop to install OS
	 */
	public void installOS(Laptop laptop) {
		System.out.println(String.format("Installing OS to the laptop: %s", laptop.getDescription()));
	}
	
	/**
	 * Package the laptop for shipping
	 * @param laptop The laptop to pack
	 */
	public void pack(Laptop laptop) {
		System.out.println(String.format("Packing the laptop: %s", laptop.getDescription()));
	}
	
	/**
	 * Add destination details to the laptop
	 * @param laptop The laptop to ship
	 */
	public void destination(Laptop laptop) {
		System.out.println(String.format("Adding destination details to the laptop: %s", laptop.getDescription()));
	}

}
