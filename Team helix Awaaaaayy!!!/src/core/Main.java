package core;

import java.util.*;

import org.com.jack.kitchener.extended.Vehicle;
//comments by josh
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Ford", "T812", 2014); //only vehicle so far

		
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextDouble()*100);
			System.out.println("\n\n");
			
			v.printDetails();
		}
		
		
	}

}
