import java.util.Scanner;
public class Kattis3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in a number:");
		int num = input.nextInt();
		//Har definerat num2 som 1 f�r att man ska kunna ha startv�rde.
		//num m�ste vara mindre �n eller lika med 100, annars k�rs inte programmet.
		//s� l�nge num2 �r mindre eller lika med num s� k�r den loopen och l�gger till 1 efter varje loop.
		for(int num2 = 1;num2<=num && num<=100;num2++) {
			System.out.println(num2 + " ballodallo");
			
		}
		

	}

}
