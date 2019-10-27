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
	 * @param str2 is an input that will be converted into the rovar language.
	 * @return returns the string that contains the rovar language of str2
	 */
	public static String sjorovare(String str2) {
		ArrayList<Character> konsonant2 = new ArrayList<Character>();
		char[] konsonant1 = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
		for(int j=0; j< konsonant1.length ;j++) {
			konsonant2.add(konsonant1[j]);
		}
		String rovareString = "";
		for(int i = 0; i<str2.length();i++) {
			if(!konsonant2.contains(str2.toLowerCase().charAt(i))) {
				rovareString += str2.charAt(i);
			}
			else {
				rovareString += str2.charAt(i) + "o" + str2.toLowerCase().charAt(i);
			}
			
		}
		
		
		return rovareString;
	}
}
