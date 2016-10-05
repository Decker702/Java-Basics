package _90_Password;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String1 == String2 would not work.
        //Instead, we do String1.equals(String 2)

        String wordOne = "Cat";
        String wordTwo = "Dog";
        String wordThree = "Cat";

        System.out.println(wordOne.equals(wordTwo));
        System.out.println(wordOne.equals(wordThree));
		
		
		
        
        String currentPassword = "Now";
        String enteredPassword = "Then";
        String secondPassword = "Now";
		System.out.println(currentPassword.equals(enteredPassword));
        System.out.println(currentPassword.equals(secondPassword));
        
        
    	//bankpin
 /**   	function enterpin(xyz) {
    		var pin = 503;

    		if (pin != xyz) {
    			console.log("Pin not accepted");
    		} else {
    			console.log("Correct!");**/
        
 
		
	}

}
