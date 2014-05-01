package org.com.jack.kitchener.extended;

public class PerDayRental extends PerKmRental {
	//comments by josh
	double costPerDay =100; //cost per day is set at 100


	
	public void setAll(int days, double dist){//set days/distance for per day
		this.days = days;
		this.dist = dist;
	}
	
	public double getRent(){ //get rent per day
		return dist*costPerDay;
	}
	
	public void setCost(double costPerDay, double costPerKm){ //sets cost per day AND per kms
		this.costPerDay = costPerDay;
		this.costPerKm = costPerKm;
	}
	
}
