import java.util.Scanner;
public class Nr1git {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type 2 numbers:");
		int A = input.nextInt();
		int B = input.nextInt();
		
		if (A>B) {
			System.out.println(A + " is greater than " + B);
		}
		else {
			System.out.println(B + " is greater than " + A);
		}

	}

}
