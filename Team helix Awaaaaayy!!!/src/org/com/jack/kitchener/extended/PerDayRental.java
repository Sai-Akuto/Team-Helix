package org.com.jack.kitchener.extended;

public class PerDayRental extends Rental {

	double costPerDay =100;

	PerDayRental(double dist, int days){
		this.dist = dist;
		this.days = days;
	}
	

	
	public void setAll(int days, double dist){
		this.days = days;
		this.dist = dist;
	}
	

	
	public void setCost(double costPerDay, double costPerKm){
		this.costPerDay = costPerDay;
		this.costPerKm = costPerKm;
	}
	
}
