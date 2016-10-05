package _16_Interface;

public class Bluray implements IFunctions{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Bluray is playing");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bluray has stopped");
		
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next trak");
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Here is the Bluray menu");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Bluray has paused");
	}
	
	public void unique (){
		System.out.println("This is unique to Blueray");
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Bluray Title");
		
	}

}
