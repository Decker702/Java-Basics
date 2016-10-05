package _19_Friends_Challenge;

	public class Friends {
		private String name;
		private String city;
		private int yearMet;
	
	
		public Friends(String name, String city, int yearMet){
			this.name = name;
			this.city = city;
			this.yearMet = yearMet;
		}
		
		public String getName(){
			System.out.println(name);
			return name;
		}
		
		public String getCity(){
			System.out.println(city);
			return city;
		}
			
		public int getyearMet(){
			System.out.println(yearMet);
			return yearMet;
			
		}
		
	}


/**Pretend that you are creating a new social media application.
Think of things you would like to include in the Friend Class in terms
of properties and methods - DON'T GET TOO COMPLICATED

1.  Create a package and call it _19_NewFriends
2.  Inside of this package create a Main Class
3.  Inside this package create a Friend Class
4.  Inside the Friend Class
	-Include properties (at least 3 and make them private)
	-Create a constructor that will set these fields
	-Next create methods that will get these properties
	
5.  Inside the Main Class and main(String[] args) 
	1.  Create at least two new Friend objects
	2.  Call the methods on these two objects.
	
6.  BONUS CHALLENGE -
	-Use a conditional to check if the two Friend objects have the same name
	-Remember when comparing a string you should use .equals()
	-Also remember that a getter should return a value...**/