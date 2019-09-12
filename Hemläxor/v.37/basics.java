import java.util.Scanner;
public class basics {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hello There! What's your name?");
		String Name = input.nextLine();
		System.out.println( Name + ", what a beutifull name!");
		System.out.println(Name + ", whats your age?");
		String age = input.nextLine();
		
	}

}
