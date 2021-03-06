package org.com.jack.kitchener.extended;

import java.text.DecimalFormat;

import shaye.FuelPurchase;

import core.Journey;

import Josh.Service;


public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;
	private PerKmRental 	rent;
	private Journey			journey;
	private Service servicerec;
	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;

	/**
	 * Class constructor
	 */
	public Vehicle() { 
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */																// added rental type
	public Vehicle(String manufacturer, String model, int makeYear, int RentalType, int daysRented) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
		//
		if(RentalType ==1)
		{rent = new PerDayRental();
		rent.setDays(daysRented);}
		else
		{rent = new PerKmRental();}
		//
	}
	
	public Vehicle(String manufacturer, String model, int makeYear) { //constructors
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
		//
		rent = new PerKmRental();
		//
	}


	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() { //Show all gathered info
		DecimalFormat format = new DecimalFormat("#.##");
		System.out.print("Manufacturer: " + manufacturer);
		System.out.print(" " + model);
		System.out.println(" " + makeYear);
		System.out.println(format.format(journey.getKilometers())+ "km travelled raised $"+format.format(rent.getRent()));
		System.out.println(""+servicerec.isServiced());

	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
		servicerec = new Service(distance);
		rent.setDist(distance);
	}

}
