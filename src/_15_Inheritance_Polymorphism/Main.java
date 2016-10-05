package _15_Inheritance_Polymorphism;

import _17_Encapsulation.Patriots;

public class Main {

	public static void main(String[] args) {
		// Suggest you make all instances at the top.
		
		Animal george = new Animal();//George is only an animal
		george.name = "George the Animal";//Former WWE wrestler
		george.printName();
		
		
		Bear barney = new Bear();// allows you to access items from Bear Class
		barney.name = "Barney";//barney is both an animal & a bear (pulls from both)
		barney.isHibernating = true;
		barney.printName();
		barney.habitat = "Woods";
	
		Kangaroo jack = new Kangaroo();
		jack.name = "Jack";
		jack.bigFeet = true;
		jack.printName();
		
		Mouse jerry = new Mouse();
		jerry.habitat = "House";
		jerry.hasWhiskers = false;
		
		barney.speak();
		jack.speak();
		jerry.speak();
		
		Patriots brady = new Patriots();
		brady.name = "Tom Brady";
		brady.cheaters = true;
		brady.numberOfSuperBowlGames = 5;
		
		
	}
}
/** from Paul
package _15_Inheritance;

import java.util.Scanner;
public class Animal {
	Scanner scan = new Scanner(System.in);
	//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	public boolean isWarmBlooded;
	public String name;
	public String habitat;
	
	//Methods
	public void getNumTeeth(){
		System.out.println("How many teeth does " + name + " have?");
		int numTeeth = scan.nextInt();
		System.out.println(name + " has " + numTeeth + " teeth.");
	}
	public void printName(){
		System.out.println("My name is " + name);
	}
	
	public void printHabitat(){
		System.out.println("Their habitat is: " + habitat);
	}**/