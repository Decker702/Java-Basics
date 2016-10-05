package _16_Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TODO create CD & DVD object
			// call some of the methods on those objects
		CD zeppelin = new CD();
		zeppelin.play();
		zeppelin.skip();
		zeppelin.turnUpToEleven(11);
		
		
		DVD beaches = new DVD();
		beaches.play();
		beaches.skip();
		beaches.pause();
		beaches.exclusive();
	
		
		Bluray blackSheep = new Bluray();
		blackSheep.play();
		blackSheep.skip();
		blackSheep.unique();
	

	}

}
