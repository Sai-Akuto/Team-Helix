package Josh;

import java.text.DecimalFormat;

public class Service {


//Instance variables or attributes
	double servicedat;
	boolean serviced = false;
	
	

//Constructor
public Service(double sa)
{
	servicedat=sa;
	serviced=true;
	
}
public Service()
{
	servicedat=0;	
}

public String speak() 
{
	DecimalFormat format = new DecimalFormat("#.##");
	if(serviced && servicedat >=10){
	return"The vehicle was serviced at " +format.format(servicedat)+"km";
}else{
	return "Error: Vehicle must be serviced first" +"\n"+
			"The vehicle has not yet been serviced.";
	}
}

}
