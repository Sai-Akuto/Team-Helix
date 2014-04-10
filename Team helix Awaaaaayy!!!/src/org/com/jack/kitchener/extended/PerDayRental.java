package org.com.jack.kitchener.extended;

public class PerDayRental extends PerKmRental {

	double costPerDay =100;


	
	public void setAll(int days, double dist){
		this.days = days;
		this.dist = dist;
	}
	
	public double getRent(){
		return dist*costPerDay;
	}
	
	public void setCost(double costPerDay, double costPerKm){
		this.costPerDay = costPerDay;
		this.costPerKm = costPerKm;
	}
	
}
