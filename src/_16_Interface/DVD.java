package _16_Interface;

public class DVD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play movie");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Movie stopped");
		
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("DVD will skip to the next track");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("DVD's menu");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("DVD is paused");
	}
		
	public void exclusive(){
		System.out.println("This is exclusive to DVD");
		
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("Title");
		
	}

}
