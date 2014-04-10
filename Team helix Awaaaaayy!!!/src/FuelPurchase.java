//Declare and initialize variables ST

public class FuelPurchase {
	private double	fuelEconomy;
	//Constructor method ST
	public FuelPurchase(double fuelEconomy) { 
		this.fuelEconomy = fuelEconomy; //Set this class as fuelEconomy on creation ST
	}

	public double getFuelEconomy() {
		return fuelEconomy;
	}

	public void setFuelEconomy(double fuelEconomy) {
		this.fuelEconomy = fuelEconomy; //Sets value ST
	}
}
