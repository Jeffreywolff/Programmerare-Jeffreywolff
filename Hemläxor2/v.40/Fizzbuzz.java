import java.util.Scanner;
public class Fizzbuzz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int Y = input.nextInt();
		int N = input.nextInt();
		
		for(int a=1;a<=N;a++) {
			//Kollar f�rst om talet modulus X och Y �r sant.
			 if(a%Y==0 && a%X==0) {
				 System.out.println("FizzBuzz");
			 }
			 //D�refter om inte det f�rsta st�mmer s� kollar den om X �r sant.
			 else if(a%X==0) {
				 System.out.println("Fizz");
			 }
			//Om inte x �r sant s� kollar den om Y �r sant.
			 else if(a%Y==0) {
				 System.out.println("Buzz");
			 }
			 // Om inget �r sant s� skriver outputen bara ut siffran a.
			 else {
				 System.out.println(a);
			 }
			 
			 
		}
		
	}
}
