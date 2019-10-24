import java.util.Scanner;
import java.lang.Math;
public class IDK2 {

	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Hello There, what's your name?");
		getName();

	}
	public static void getName() {
		Scanner scan = new Scanner(System.in);
		String Name = scan.nextLine();
		System.out.println(Name + ", what a beautiful name!");
	}
}
