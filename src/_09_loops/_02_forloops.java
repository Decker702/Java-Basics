package _09_loops;

public class _02_forloops {
// saved from Repl.it - worked with Paul and half the class to understand loops.  Good examples of for loops.

//loops, Friday, September 30, 2016 - end of second week.

//for loops
//Travis did it
//	for(int i=1; i <=10; i++) {
//	System.out.println(i); //prints out 1 to 10, vertically
	
//Sydney did it
//for(int i = 1; i <=10; i++){
//	System.out.println(i += 1); //prints out 2,4,6,8,10, vertically
//}

//Tobie did this one
//for(int i = 0; i <= 10; i+=2){
//	System.out.println(i); //prints out 2,4,6,8,10, vertically
//}

// Daniella did this one
//for(int i = 0; i <=30; i+=3){
//	System.out.println(i);//prints out 0 to 30 by 3s, vertically
//}



//count to 100 by 7s, leave out 28 & 49
//1) count to 100 by sevens
//for(int i = 0; i <=100; i+=7){
//	System.out.println(i);// this get you the count.  Now no 28 or 49
//}
//
//FYI - System.out.print - prints it horizonally on one line.

//	if(i = 28 or 49, leave out) -- how???

//	Travis with help from internet
//for(int i = 0; i <=100; i+=7){
//	if(i == 28 || i == 49 ){
//		continue;
//	}
//	System.out.println(i);
//	}
	
//	Paul's example
//	for(int i = 0; i <=100; i+=7){
//	if(i != 28 && i != 49 )
//		System.out.println(i);
//}

//count from 1 to 10, 
//Console should show: The number is (number).
//Console should show: It's five, print "I'm alive.

//Steve did this one
// for(int i=0; i<=10; i++){
// if (i==5){
// 	System.out.println("I'm Alive!");
// }else{
//	 System.out.println("The number is:" + i);
// }
 	

//FIZBUZZ - famous puzzle, might be asked at job interview to whiteboard it.
//1. Print from 1 to 100.
//2. If i is a multiple of 3, print Fizz.
//3. If i is a multiple of 5, print 'buzz'.
//4. If i is a multiple of 3 & 5 print FIZBUZZ
//This is one to memorize for an interview

//classic way to do it:

for(int i=1; i <+100; i++){
	if(i % 15 ==0){
		System.out.println("FIZZBUZZ");
	}else if(i % 3 == 0){
			System.out.println("FIZZ");
	}else if(i % 5 == 0){
			System.out.println("Buzz");
	//There is more, check the internet for answer.		
	
	
}




for(int i=0; i<=100; i+=3){
	if(i +=3)
	System.out.println ("Fizz");
}else{
for(int i=0; i<=100; i+=5){
	System.out.println ("Buzz");
}






}

}