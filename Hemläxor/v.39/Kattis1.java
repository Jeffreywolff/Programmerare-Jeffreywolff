import java.util.Scanner;
public class Kattis1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// S = (R1 + R2)/2;
		// 2S - R1 = R2;
		System.out.println("Type 2 numbers:");
		int S = input.nextInt();
		int R1 = input.nextInt();
		int S2 = S*2;
		int R2 = S2-R1;
		System.out.println("R2: " + R2);

	}

}
