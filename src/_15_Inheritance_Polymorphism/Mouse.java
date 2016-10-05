package _15_Inheritance_Polymorphism;

public class Mouse extends Animal{
	
//properties
	int numFeet;
	boolean hasWhiskers;
	
	@Override
	public void speak() {
		System.out.println("Where's the cheese??");
	}

}
