import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;


public class Volume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Homework 1
		double radius = scan.nextDouble();
		System.out.println(Volume(radius));
		
		// Homework 2
		scan.nextLine();
		String str = scan.nextLine();
		System.out.println(reverse(str));
		
		// Homework 3
		String str1 = scan.nextLine();
		char c = scan.next().charAt(0);
		System.out.println(count(str1, c));
		
		scan.nextLine();
		
		// Homework 4
		String str2 = scan.nextLine();
		System.out.println(sjorovare(str2));
	}
	
	/**
	 * 
	 * @param radius is a input of numbers
	 * @return returns the volume of a sphere
	 */
	public static double Volume(double radius) {
		return  (4 * Math.PI * Math.pow(radius, 3))/3;
		
	}
	
	/**
	 * 
	 * @param str is a input of a string that is reversed
	 * @return returns str reversed
	 */
	public static String reverse(String str) {
		String revStr = "";
		for(int i = str.length() - 1; i>=0; i--) {
			revStr += str.charAt(i);
		}
		return(revStr);
		
	}
	
	/**
	 * 
	 * @param str1 is a input of a string
	 * @param c a input of a character
	 * @return how many times the Character 'c'(input from user) is counted in the String str1
	 */
	public static int count(String str1, char c) {
		int countC = 0;
		
		for(int i = str1.length()-1; i>=0; i--) {
			if(str1.charAt(i) == c) {
				countC += 1;
			}
		}
		return countC;
	}
	
	/**
	 * 
	 * @param str2
	 * @return
	 */
	public static String sjorovare(String str2) {
		ArrayList<Character> vokals2 = new ArrayList<Character>();
		char[] vokals1 = {'a', 'e', 'i', 'o', 'u', 'y', 'å', 'ä', 'ö'};
		for(int k=0; k<10;k++) {
			vokals2.add(vokals1[k]);
		}
		String rovareString = "";
		for(int i = 0; i<str2.length()-1;i++) {
			if(vokals2.contains(str2.charAt(i))) {
				rovareString += str2.charAt(i);
			}
			else {
				rovareString += str2.charAt(i) + 'o' + str2.charAt(i);
			}
			
		}
		
		
		return rovareString;
	}
}
