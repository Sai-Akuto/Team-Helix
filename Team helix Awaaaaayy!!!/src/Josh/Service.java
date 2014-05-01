package Josh;

import java.text.DecimalFormat;

public class Service {


//JL Instance variables or attributes
	double servicedat;
	boolean serviced = false;
	
	

//JL Constructors
public Service(double sa)
{
	servicedat=sa;
	serviced=true;
	
}
public Service()
{
	servicedat=0;	//JL set km service at 0
}

public String isServiced() 
{
	DecimalFormat format = new DecimalFormat("#.##"); //JL restrict answer to 2 decimals
	if(serviced && servicedat >=10){
	return"The vehicle was serviced at " +format.format(servicedat)+"km"; //JL how many kms ago was it serviced IF it has been serviced
}else{
	return "Error: Vehicle must be serviced first" +"\n"+ //JL If vehicle has not been serviced, show error and say so
			"The vehicle has not yet been serviced.";
	}
}

}

