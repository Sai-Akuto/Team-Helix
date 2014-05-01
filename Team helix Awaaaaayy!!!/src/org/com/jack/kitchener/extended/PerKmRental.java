package org.com.jack.kitchener.extended;

public class PerKmRental {
	//comments by josh
	protected int days;
	protected double dist;
	protected double costPerKm = 1; //cost per kms is set at 1
	
	public void setDays(int days){ //set days
		this.days = days;
	}
	
	public double getDist(){ //get days
		return dist;
	}
	
	public void setDist(double dist){ //set distance
		this.dist = dist;
	}
	

	public void setCost(double cost){ //set cost
		this.costPerKm = cost;
	}
	
	public double getRent(){ // get rent per kms
		return dist * costPerKm;
	}

}
