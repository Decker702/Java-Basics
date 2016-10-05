package _08_DataCollection;

import java.util.ArrayList;
import java.util.Arrays;


public class _02_ArrayList {

	public static void main(String[] args) {
	
			ArrayList<String> names = new ArrayList<String>();
			
			names.add("James");
			names.add("Paul");
			names.addAll(Arrays.asList("Sydney", "John", "Karl", "Marissa"));
			System.out.println(names);
			System.out.println(names.get(0));
			
			
			//TODO - create an ArrayList of integers and add some numbers to it//
			
			ArrayList<Integer> nums = new ArrayList<Integer>();
			nums.add(1);
			nums.addAll(Arrays.asList(5, 10,20));
			System.out.println(nums);
			System.out.println(nums.get(2));  //This will print out number 10, because 1 is in place zero, 5 is in place 1 and 10 is in place 2.  
			//You added 1 before you added the numbers in the array.//
						
			
			//TODO - Create an ArrayList of type Doubles and add some double to it
			//Print out each one on a different line
			
/**			ArrayList<doubles> dubNums = new ArrayList<Double>();
			dubNums.addAll(Arrays.asList(5.5, 2.5, 3.3));
			print.out.printIn(dubNums) //prints 5.5, 2.5, 3.3
			print.out.printIn(dubNums.get(0)); //prints 5.5
			print.out.printIn(dubNums.get(1)); //prints 2.5
			print.out.printIn(dubNums.get(2)); //prints 3.3**/

		
		
		
		