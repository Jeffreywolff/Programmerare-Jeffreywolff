import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int high = 0;
		int low = 0;
		int total = 0;
		for(int a=0; a<10; a++) {
			System.out.println("Type a number:");
			int answer = input.nextInt();
			if (a == 0) {
			low = answer;
			high = answer;
			}
			total+=answer;
		    if (answer > high) {
		    	high = answer;
		    }
			if (answer < low) {
				low = answer;
			}
			
		}
		System.out.println("Mean: " + total/10);
		System.out.println("Highest:  " + high);
		System.out.println("Lowest: " + low);
		

		
		
		

	}

}
