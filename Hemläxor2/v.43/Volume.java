import java.util.Scanner;
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
		
		// Homework 4
		String str2 = scan.nextLine();
		System.out.println(sjorovare(str2));
	}
	
	/**
	 * 
	 * @param radius
	 * @return
	 */
	public static double Volume(double radius) {
		return  (4 * Math.PI * Math.pow(radius, 3))/3;
		
	}
	
	/**
	 * 
	 * @param str
	 * @return
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
	 * @param str1
	 * @param c
	 * @return
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
	
	
	public static String sjorovare(String str2) {
		char[] vokals = {'a', 'e', 'i', 'o', 'u', 'y', 'å', 'ä', 'ö'};
		String rovareString = "";
		for(int i = 0; i<str2.length();i++) {
			for(int y = 0; y < vokals.length -1;y++) {
				if(str2.charAt(i) != vokals[y]) {
					rovareString += str2.charAt(i) + 'o' + str2.charAt(i);
				}
				
			}
		}
		
		
		return rovareString;
	}
}
