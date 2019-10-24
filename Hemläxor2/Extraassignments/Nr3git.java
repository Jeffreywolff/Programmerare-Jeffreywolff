import java.util.Scanner;
public class Nr3git {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some numbers, end with a '0': ");
		int A1 = 1;
		int sum = 0;
		int m = 0;
		while(A1 != 0) {
			A1 = input.nextInt();
			sum += A1;
			m++;
		}
		System.out.println("Sum: " + sum + "\n" + "Mean: " + sum/m);
	}

}
