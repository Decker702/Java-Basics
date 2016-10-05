package _11_Class_Properties;

public class BasicObjectives {

	public static void main(String[] args) {
		//use the class to make an object
		//This is an object or instance of the Car class (paulsDreamCar)
		//Think of the 'new' below as a base (raw cookie)
		//Humans think in classes
		Car paulsDreamCar = new Car(); 
		paulsDreamCar.make = "Tesla"  //the period/dot brought up the properties list from Car
		paulsDreamCar.model = "Model3" //click on the list to get the properties
		paulsDreamCar.isFAst = "true"
		paulsDreamCar.milesPerCharge = 300;
		
		//make another car that is your dream car and add 8 properties.
		Car LsDreamCar = new Car();
		LsDreamCar.color = "Silver";
		LsDreamCar.frontWheel = "true";
		LsDreamCar.leatherSeats = "false";
		LsDreamCar.year = 2017;
		LsDreamCar.mpgCity = 23.4;
		LsDreamCar.mpgHighway = 35.6;
		LsDreamCar.marketSegment = "Sport"
				
				
				//This is how we have seen it before
			Integer number = new Integer (5);
			System.out.println(number);
			System.out.print(number.toString());//this converts a number to a string
	
				
				
		
		
		
		

	}

}
