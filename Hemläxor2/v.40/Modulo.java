import java.util.Scanner;
import java.util.ArrayList;
public class Modulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> number = new ArrayList<>();
		
		int testnum = 0;
		for(int i=0;i<10;i++) {
			testnum = scan.nextInt()%42;
			if(!number.contains(testnum)) {
				number.add(testnum);
			}
		}
		System.out.println(number.size());
		

	}

}
