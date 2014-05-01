package shaye;
//Declare and initialize variables 

public class FuelPurchase {
	private double	fuelEconomy;
	//Constructor method 
	public FuelPurchase(double fuelEconomy) { 
		this.fuelEconomy = fuelEconomy; //Set this class as fuelEconomy on creation 
	}

	public double getFuelEconomy() {
		return fuelEconomy;
	}

	public void setFuelEconomy(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy; //Sets value 
	}
}
