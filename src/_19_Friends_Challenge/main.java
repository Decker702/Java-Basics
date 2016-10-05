package _19_Friends_Challenge;

public class main {

	public static void main(String[] args) {
	
	
	Friends brooke = new Friends("Brooke", "Alexandria", 1990);
	Friends leslie = new Friends("Leslie", "Montecello", 1997);
	
	brooke.getName();
	brooke.getCity();
	brooke.getyearMet();
	
	leslie.getName();
	leslie.getyearMet();
	
		

	}

}

//James' work
/**package _19_NewFriends;

public class Friend {
	
	//Properties
	private String name;
	private int numFriends;
	private boolean isOnline;
	
	//Constructor
	public Friend(String name, int numFriends, boolean isOnline) {
		this.name = name;
		this.numFriends = numFriends;
		this.isOnline = isOnline;
	}
	
	//getters
	
	public String getName() {
		return name;
	}
	
	public int getFriendNum() {
		return numFriends;
	}
	
	public boolean getOnlineStatus() {
		return isOnline;
	}
	//setter
	public void setOnlineStatus(boolean status) {
		isOnline = status;
	}	
}**/
