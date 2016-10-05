package _89_Gradebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class gradebook {

	public static void main(String[] args) {
		
		//Create Variables
		int option = 0;
		System.out.println("Welcome to the Gradebook");
		Scanner userIn = new Scanner(System.in);
		ArrayList<Double> gradeBook = new ArrayList<Double>();
		
		//Menu Loop
		while(option!=6){
			
			//Print main menu
		}
			System.out.println("-----------------------------------");
			System.out.println("Select Option from the list below:");
			System.out.println("1) Enter Values");
			System.out.println("2) Modify Entry");
			System.out.println("3) Delete Entry");
			System.out.println("4) View Stats");
			System.out.println("5) View All Entries");
			System.out.println("6) Exit Program");
			
		//User to select option
		option = userIn.nextInt();
		//Option 1 Enter Values
		if(option==1){
			System.out.println("Please enter values.  Type -1 to exit.");
			double gradeBookEntry = 0;
			//While Loop for entering data
			while(true) {
				gradeBookEntry = userIn.nextDouble();
				
				//Exit if -1
				if (gradeBookEntry==-1){
					break;//this breaks out of the loop when type in -1
				}
				else{
					gradeBook.add(gradeBookEntry);
					
					}
				}
		}
			
			//Option 2 Modify Entry
			if(option==2){
				System.out.println("Which index would you like to modify?");
				int index = userIn.nextInt();
				System.out.println("Replace Index:" + index + "Value:" + gradeBook.get(index) + "with what?");
				gradeBook.set(index, userIn.nextDouble());
				System.out.println("Successfully Set");
			
			}
		//Option 3 - Delete
			
			if (option==3){
				System.out.println("Which index would you like to delete?");
				int index = userIn.nextInt();
				gradeBook.remove(index);
				System.out.println("Removed");
				
			}
				
			//Option 5  - View elements
			if(option==5){
				System.out.println("|Index| Value");
				for(int i = 0; i < gradeBook.size();i++){
					//Create Rows
					System.out.println("| " + i + " | " + gradeBook.get(i));
					
					
				}			
			
			
			
			
			
			//Option 4 - View Stats
			if(option==4){
				//Calculate Average
				double total = 0;
				for(int i =0; i < gradeBook.size();i++){
					total += gradeBook.get(i);	
				}
				
				double average = total/gradeBook.size();
				
				//Sort gradeBook - make a copy of the gradebook to do calculations
				ArrayList<Double> copiedGradeBook = new ArrayList<Double>();
				copiedGradeBook.addAll(gradeBook);
				Collections.sort(copiedGradeBook);
				
				//Extract max & min
				double max = copiedGradeBook.get(gradeBook.size()-1); //need -1 because zero based
				double min = copiedGradeBook.get(0);
				
				double median =0;
				//Find Median (in middle of gradebook) If even, need to add and average to get median
				if(copiedGradeBook.size()%2==1){
					median = copiedGradeBook.get(copiedGradeBook.size()/2);
				}
				else{
				}
					int secIndex = copiedGradeBook.size()/2;
					double firstMedian = copiedGradeBook.get(secIndex -1);
					double secondMedian = copiedGradeBook.get(secIndex);
					median = (firstMedian+secondMedian)/2.0;//needs to stay a double, so added.0
		}
			System.out.println("Database Stats");
			String average;
//			System.out.println("Average: " + average);
//			System.out.println("Min:     " + min);//		System.out.println("Max:     " + max);
//			System.out.println("Median   " + median);
			System.out.println("Elements:" + gradeBook.size());
		
			
				
				

		
		
		
		
		
		

	}

}
}
