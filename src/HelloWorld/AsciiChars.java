package HelloWorld;

public class AsciiChars {
		
		 public static void printNumbers(int num1) {
		    // TODO: print valid numeric input
			for (num1 = 48; num1 <= 57; num1++) {
				char ascii1 = (char) num1;
				System.out.println("The ASCII value of Number " + num1 + " is: " + ascii1);
			}
		  }

		  public static void printLowerCase(int num2) {
		    // TODO: print valid lowercase alphabetic input
			for (num2 = 97; num2 <= 122; num2++) {
			    char ascii2 = (char) num2;
				System.out.println("The ASCII value of Lowercase Letter " + num2 + 
				" is: " + ascii2);
		    }
		  }

		  public static void printUpperCase(int num3) {
		    // TODO: print valid uppercase alphabetic input
			for (num3 = 65; num3 <= 90; num3++) {
			    char ascii3 = (char) num3;
			    System.out.println("The ASCII value of Uppercase Letter " + num3 + 
			    " is: " + ascii3);
			}
		  }
		  
	}

