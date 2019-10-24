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
}
