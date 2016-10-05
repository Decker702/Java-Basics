package _15_Inheritance_Polymorphism;

public class Bear extends Animal{
	//"extends Animal" above -  allows this file access to the whole Animal Class
	//Inherit from the Animal Class
	
	public boolean isHibernating;
	

	//James teaching at 3:30pm
	@Override
	public void speak() {
		System.out.println("ROOOOOAAARR");
	}
	
	

}
