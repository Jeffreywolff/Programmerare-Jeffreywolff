import java.util.Scanner;
public class Nr4git {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a few numbers: ");
		int i1 = 0;
		int prod = 1;
		for(int i=0;i<10;i++) {
			int a = input.nextInt();
			prod = prod*a;
			i1++;
			if(prod>100000) {
				System.out.println("Thats already a very great number!");
				break;
			}
		}
		System.out.println("Product of Numbers: " + prod);
		System.out.println("Numbers typed: " + i1);
	}

}
