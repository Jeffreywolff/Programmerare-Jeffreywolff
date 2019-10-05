import java.util.Scanner;
public class Fizzbuzz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int Y = input.nextInt();
		int N = input.nextInt();
		
		for(int a=1;a<=N;a++) {
			//Kollar först om talet modulus X och Y är sant.
			 if(a%Y==0 && a%X==0) {
				 System.out.println("FizzBuzz");
			 }
			 //Därefter om inte det första stämmer så kollar den om X är sant.
			 else if(a%X==0) {
				 System.out.println("Fizz");
			 }
			//Om inte x är sant så kollar den om Y är sant.
			 else if(a%Y==0) {
				 System.out.println("Buzz");
			 }
			 // Om inget är sant så skriver outputen bara ut siffran a.
			 else {
				 System.out.println(a);
			 }
			 
			 
		}
		
	}
}
