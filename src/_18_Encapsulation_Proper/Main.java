package _18_Encapsulation_Proper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Player james = new Player("James", "Top Gun", 12354, 75);
		Player paul = new Player("Paul", "Goose", 2134);
		Player l = new Player("L", "Bad", 34);
		
		paul.getName();
		james.getStatus();
		paul.getHealthPoints();
		
		paul.setNewPlayerName("Paul O'Connor");
		paul.getName();
		
		paul.setNewStatus ("King of the Road");
		paul.getStatus();
		
	}

}
