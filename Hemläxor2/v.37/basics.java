import java.util.Scanner;
public class basics {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello There! What's your name?");
		String Name = input.nextLine();
		System.out.println( Name + ", what a beutifull name!");
		System.out.println(Name + ", whats your age?");
		String age = input.nextLine();
		
		System.out.println("Okey, Whats you home address?");
		String address = input.nextLine();
		System.out.println("Whats your postcode?");
		String pcode = input.nextLine();
		System.out.println("What city do you live in?");
		String city = input.nextLine();
		System.out.println("Whats your phone number?");
		String phonenum = input.nextLine();
		
		System.out.println("Information:");
		System.out.println("Name: " + Name);
		System.out.println("Age: " + age);
		System.out.print("Adress: " + address + "\n \t" +  pcode + "\n \t" +  city + "\n");
		System.out.println("PhoneNumber: " + phonenum);
		
		
	}

}
