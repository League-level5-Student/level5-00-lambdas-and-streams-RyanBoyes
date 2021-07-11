package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			for (int i = s.length()-1; i >=0; i--) {
				System.out.println(s.charAt(i));
			}
			
		}, "String");
		
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			String newS = "";
			for (int i = 0; i < s.length(); i++) {
				if(i%2==0) {
				
				newS = newS + s.substring(i, i+1).toUpperCase();
				}
				else if(i%2==1) {
					s.toLowerCase();
					newS = newS + s.substring(i, i+1).toLowerCase();
					
				}
			}
			System.out.println(newS);
		}, "String");
		
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			String[] a = new String[s.length()];
			String newS = "";
			for (int i = 0; i < s.length(); i++) {
				a[i] = s.charAt(i)+".";
				newS = newS + a[i];
			}
		
			System.out.println(newS);
			
		}, "String");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='i') {
				s = s.substring(0, i) + s.substring(i+1, s.length());
			}
		}
			System.out.println(s);
		},  "String");
		
		
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
