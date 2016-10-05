package _13_Friends;

public class BasicObjects {

	public static void main(String[] args) {
	
		
	//Linda's attempt
		
		Friends LsFriends = new Friends();
		
		LsFriends.name = "Brooke";
		LsFriends.yearsKnown = 20;
		
		
		
		
		
	//following is Paul's printout approach	for a switch & it should be in the fiends class, the printing of response for
		//individual friend - James, Daniel, are set up and printed here.
		
		public void printYearsFriends();
			swithch(numYearsFriends){
				case 5:
					response = "You have been friends with " + name + "for " + numYearsFriends + "years";
					break;
				case 10:
					response = "You have been friends with " + name + "for " + numYearsFriends + "years";
					break;
				case 20 = "You have been friends with " + name + "for " + numYearsFriends + "years"; 
					break;
					default:
						response = "White Castle is best!";
						
		sysem.out.println(response);
			
			}

//12:05 on Wednesday, September 28, 2015.  Further discussion
			// This allows you to use the method for each new friend.  Id error in class you only have to fix it once.
			// the . allows you access the items in the Friends folder
			Friends karl = new Friends();
			karl.name = "Karl";
			karl.numYearsFriends = 20;
			karl.printYearsFriends();
			
			
			
	}

}

 /* 
 * Paul provided this in slack
 * package _13_Friends;
 

public class BasicObjects {

	public static void main(String[] args) {
		
		
		Friends james = new Friends();
		//TODO: Comment this out.
		james.name = "James";
		james.isOnline = true;
		james.numYearsFriends = 1;
		james.currCity = "Fishers";
		james.hometown = "Orland";
		james.cityCheck();
		james.school = "Anderson University";
		james.getSchool();
		
		Friends danielle = new Friends();
		danielle.isOnline = true;
		danielle.name = "Danielle";
		
		danielle.onlineCheck();
		james.onlineCheck();
		
		
		
		james.printYearsFriends();
		
		Friends karl = new Friends();
		karl.name = "Karl";
		karl.numYearsFriends = 20;
		karl.printYearsFriends();
			
		
		
	}
} **/