import java.util.Scanner;
public class Kattis2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type two Cordinates:");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		if (x1>0 && y1>0) {
			System.out.println("X: " + x1 + " Y: " + y1 + "\n" + "Is in quadrant number 1");
		}
		else if(x1<0 && y1>0) {
			System.out.println("X: " + x1 + " Y: " + y1 + "\n" + "Is in quadrant number 2");
		}
		else if(x1<0 && y1<0) {
			System.out.println("X: " + x1 + " Y: " + y1 + "\n" + "Is in quadrant number 3");
		}
		else if(x1>0 && y1<0) {
			System.out.println("X:  " + x1 + " Y: " + y1 + "\n" + "Is in quadrant number 4");
		}
		

	}

}