package _09_loops;

public class _02_for {

	public static void main(String[] args) {
		
		//for loops have more control then while loops//
		//for (initialize for lcv(loop  control variable); relational test on lvc; 
		//modifier lvc)
		
		//for(int i=0; i<10; i++) {
		//	System.out.println(i);
		//}
		
//TODO create a for loop that increments by 5 and counts from 0 to 100 by 5.
		
	//	for(int i=0; i<=100; i+=5){
		//	System.out.println(i);
	//	}
		
	//	int sum = 0;
	//	for(int i=0; i<=10; i++) {
	//		sum = sum+i;
	//	}
	//	System.out.println(sum);
		//answer is 55; 0+1=1; 1+2=3; 3+3=6; 6+4=10; 10+5=15; 15+6=21;
		//21+7=28; 28+8=36; 36+9=45; 45+10=55.  We stop at when it equals 10
		
		
// simple interest over time - compound over 10 years
	//	double balance = 5000;
	//	double rate = 1.02; //2% interest rate; compounded each year.
	//	for(int i=1; i<=10; i++){
	//	balance *= rate; //balance = balance * rate
	//	}
	//	System.out.println(balance);//outside the } will give you the total.  
		// inside the } will show you the number for each calculation in a list.

		String spaces = "There are spaces in this string";
		int numSpaces =0;
		
	//	System.out.println(spaces.length());//returns number of spaces in the string, there are 31
		
		for(int i = 0; i <spaces.length(); i++){
		
		// stings are indexed like arrays - they start at zero.  Above T is zero.
	//	System.out.println(spaces.charAt(30)); //the g is the last one.  
		//Yes, 31 spaces, but it begins at zero - so last one is 30.

		//Pulling out characters, not spaces.  continue in java means if not then continue
		//To count empty spaces.
		if (spaces.charAt(i) != " ") {
			continue;
		}else{
			numSpaces++;  //every empty space you find add one.  Total empty spaces=5
		}
		
		System.out.println("There are " + numSpaces + " spaces in your string");
		
		
		
		//System.out.println(spaces.charAt(i));
		
	}

}
