package HelloWorld;
import java.util.Scanner;

public class mainHello {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!\n");
		
		// print the valid characters for input
		  AsciiChars.printNumbers(48);
		  AsciiChars.printUpperCase(97);
		  AsciiChars.printLowerCase(65);
		  
		// asking user to enter name
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("\nPlease enter your name: "); // type a word and hit enter
		  String someString = scanner.nextLine();
		  System.out.println("Hello " + someString);
		  
		// asking user to continue
		  Scanner reader = new Scanner(System.in);
		  String ans1 = "yes";
		  char ans2 = 'y';
		  System.out.print("\nDo you wish to continue to the interactive portion? ");
		  String x = reader.nextLine();
		  char y = x.charAt(0);
		  boolean answString = x == ans1;
		  boolean answChar = y == ans2;
		
		   if (answString || answChar) {
			  System.out.println("\nContinuing to Survey............\n");
		   } else {
			  System.out.println("Please return later to complete the survey.\n");
		   } 
		   
		   if (answString || answChar == true) {
		
		// Starting Survey for User -------------------------->
		   Scanner userInputStr = new Scanner(System.in); // String Input
		   Scanner userInputInt = new Scanner(System.in); // Integer Input
		   String carColor;
		   String pet;
		   int petAge;
		   int luckNum;
		   int jersNum = 0;
		   String Champ;
		   int carModelYear;
		   String fname;
		   int randNum;
		   String genNum;
		   
		   do {
			   
			  System.out.println("\nDo you have a red car? (yes, no): " + "");
			   carColor = userInputStr.nextLine();
			   System.out.println("Your Answer: " + carColor);
	            
		       
		      System.out.println("\nWhat is the name of your favorite pet?"); 
			   pet = userInputStr.nextLine();
			   System.out.println("Your Answer: " + pet);
			   
			  System.out.println("\nWhat is the age of your favorite pet?");
			   petAge = userInputInt.nextInt();
			   System.out.println("Your Answer: " + petAge);
			   
			  System.out.println("\nWhat is your lucky number?");
			   luckNum = userInputInt.nextInt();
			   System.out.println("Your Answer: " + luckNum);
			   
			  System.out.println("\nDo you have a favorite quarterback? " + 
			    "If so, what is their jersey number?");
			   Champ = userInputStr.nextLine();
			   //System.out.println("Your Answer: " + Champ);
			 
			   if (Champ.equals("yes")) {
			      // System.out.println("If so, what is their jersey number?");
				   jersNum = userInputInt.nextInt();
				   System.out.println("\nQB's Jersey Number: " + " #" + jersNum);
			   } 
			   
			  System.out.println("\nWhat is the two-digit model year of your car?");
			   carModelYear = userInputInt.nextInt(); 
			   System.out.println("Your Answer: " + carModelYear);
			   
			  System.out.println("\nWhat is the first name of your favorite actor or actress?");
			   fname = userInputStr.nextLine();
			   System.out.println("Your Answer: " + fname);
			  
			  System.out.println("\nEnter a random number between 1 and 50.");
			   randNum = userInputInt.nextInt();
			   System.out.println("Your Answer: " + randNum);
			  
			   // If statement break 
			   // reset();
			   // Try and catch
//   <------------------------------------------GENERATING OUTPUT------------------------------------------>
			   
			   
			//  **Generating output** 
			   
				 // DECLARED CONSTANTS
					
				 	final int NUMMAX = 65;
				 	final int MAGICMAX = 75;
				 	
				   // 3 random integers
				 	
				   	int a = 5;
					int b = 3;
					int c = 9;
				
				   
				   // Generate the "magic ball" first.
//  It should be the user's FAV QB jersey number *or* their lucky number, * by one of the random numbers.
					int mBall;
					
					for (mBall = 0; mBall <= 1; mBall++) {
						if (jersNum >= 0) {
							mBall = luckNum * a;
							if (mBall > MAGICMAX) {
								mBall -= 75;	
							}
							break;
						} else if (jersNum != 0) {
							mBall = jersNum * a;
							if (mBall > MAGICMAX) {
								mBall -= 75;	
							}
							break;
							
						}
					}
				   
				   // 1ST NON-MAGIC NUMBER
// Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
					
					int nmn1 = 0;
					char l3 = pet.charAt(2);
					nmn1 = (int) l3;
					
						if (nmn1 > NUMMAX ) {
							nmn1 -= NUMMAX;
						}
				   
					// 2ND NON-MAGIC NUMBER
//  Use the two digit model year of their car and add their lucky number to it.
						
					int nmn2 = 0;
					nmn2 = carModelYear + luckNum;
						
						if (nmn2 > NUMMAX ) {
							nmn2 -= (nmn2 / 2);
						}
				     
					// 3RD NON-MAGIC NUMBER
//   Use the value 42.
					
					int nmn3 = 42;
					
					// 4th NON-MAGIC NUMBER
//  Favorite quarterback number + age of pet + lucky number.
					
					int nmn4 = 0;
					nmn4 = jersNum + petAge + luckNum;
					
						if (nmn4 > NUMMAX ) {
							nmn4 -= (nmn4 / 2);
						}
						
					// 5th NON-MAGIC NUMBER
//   Convert the first letter of their favorite actor/actress to an integer and use that value.
						
					int nmn5 = 0;
					char l1 = fname.charAt(0);
					nmn5 = (int) l1;
					
						if (nmn5 > NUMMAX ) {
							nmn4 -= (NUMMAX / 2);
						}
					
					System.out.println("\nLottery numbers: " + nmn1 + ", " + nmn2 + ", " + nmn3 + ", " 
										+ nmn4 + ", " + nmn5 + "  " +  "Magic ball: " + mBall);
					
//  Ask the user if they would like to answer questions to generate another set of numbers. 
			 
			  System.out.println("\nWould like to answer questions to generate another set of "
			  					+ "numbers? Play Again?");
			  genNum = userInputStr.nextLine(); 
					
		      } while (genNum.equals("yes"));
		   
//  If not, print a thank you message and exit.  
 
		      System.out.println("\nThank you for your time!");
		     }
		   
		  
/* 
Once the basics of this are working (happy path), go back and add error-checking for each question. 
If the user does not enter a valid entry, ask the question again until a valid entry is produced.
*/
	 }
 
}
