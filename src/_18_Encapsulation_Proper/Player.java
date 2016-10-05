package _18_Encapsulation_Proper;

public class Player {
	private String name;
	private String status;
	private int highScore;
	private int healthPoints;
	
	
	//Constructor - puts information in one line instead of many.
		//can put in as many parameters in as you want.
		//Constructor names are always public & the name matches the Class name
	public Player(String name, String status, int number){
		this.name = name;
		this.status = status;
		this.highScore = highScore;
		this.healthPoints = healthPoints;
		

	//Getters -- return distills information down to item you request.
	// Use private variables/properties in a public method below
	//Using 
	public String getName(){
		System.out.println(name);
		return name;
		
	public String getStatus();
		System.out.println(status);
		return status;
		
	public int getHealthPoints
		System.out.println(healthPoints);
		return healthPoints;
		
		//TODO Create a healthPoint property
		//add it to the constructor
		//create a getHealth methos
		//fix the objects that are in the main
		// - you can trace the work above and on Main
		

		//Setters - allows you to update your information, your items, set new value in the property
		public void setNewPlayerName(String newName);
			name = NewName
		public void setNewStatus(String newStatus);
			status = newStatus;
		

	}	

		
	}
	
	
	
	
	}


