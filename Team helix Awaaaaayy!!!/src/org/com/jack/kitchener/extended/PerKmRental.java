package org.com.jack.kitchener.extended;

public class PerKmRental {
	
	protected int days;
	protected double dist;
	protected double costPerKm = 1;
	
	public void setDays(int days){
		this.days = days;
	}
	
	public double getDist(){
		return dist;
	}
	
	public void setDist(double dist){
		this.dist = dist;
	}
	

	public void setCost(double cost){
		this.costPerKm = cost;
	}
	
	public double getRent(){
		return dist * costPerKm;
	}

}
