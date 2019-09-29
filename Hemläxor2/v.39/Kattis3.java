import java.util.Scanner;
public class Kattis3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type in a number:");
		int num = input.nextInt();
		//Har definerat num2 som 1 för att man ska kunna ha startvärde.
		//num måste vara mindre än eller lika med 100, annars körs inte programmet.
		//så länge num2 är mindre eller lika med num så kör den loopen och lägger till 1 efter varje loop.
		for(int num2 = 1;num2<=num && num<=100;num2++) {
			System.out.println(num2 + " ballodallo");
			
		}
		

	}

}
