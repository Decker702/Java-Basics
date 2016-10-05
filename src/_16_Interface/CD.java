package _16_Interface;

public class CD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD is now playing");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD is now stopped");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("CD has skipped to next song");
		
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("This is the CD menu");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("CD has paused");
		
		//This is only for CD, so not in interface.  But is here & exclusive to CD
	}	
	
	public void turnUpToEleven(int volume){
		System.out.println("Turn that up to " + volume);
		
	}
		
	

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("CD Title");
		
	}
	

}
