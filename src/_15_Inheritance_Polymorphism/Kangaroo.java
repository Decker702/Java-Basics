package _15_Inheritance_Polymorphism;
	
	public class Kangaroo extends Animal{
		//"extends Animal" above -  allows this file access to the whole Animal Class
		//Inherit from the Animal Class
		
		public boolean bigFeet;
//Use polymorphism to override the speak methos from animal
		//make Kangaroo say somthing new
		
		@Override
		public void speak() {
			System.out.println("Hop Hop");
		}
}
