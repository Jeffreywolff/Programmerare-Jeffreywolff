import java.util.Scanner;
import java.lang.Math;


public class Volume {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Homework 1
		double radius = scan.nextDouble();
		System.out.println(Volume(radius));
		
		// Homework 2
		String str = scan.nextLine();
		System.out.println(reverse(str));

	}

	public static double Volume(double radius) {
		return  (4 * Math.PI * Math.pow(radius, 3))/3;
		
	}
	
	public static String reverse(String str) {
		String revStr = "";
		for(int i = str.length(); i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return(revStr);
		
	}
	
}
