import java.util.Scanner;
public class Fizzbuzz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int Y = input.nextInt();
		int N = input.nextInt();
		
		for(int a=1;a<=N;a++) {
			
			 if(a%Y==0 && a%X==0) {
				 System.out.println("FizzBuzz");
			 }
			 
			 else if(a%X==0) {
				 System.out.println("Fizz");
			 }
			
			 else if(a%Y==0) {
				 System.out.println("Buzz");
			 }
			 
			 else {
				 System.out.println(a);
			 }
			 
			 
		}
		
	}
}
