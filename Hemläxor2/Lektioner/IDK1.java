import java.util.Scanner;
public class IDK1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		methodOne(5);
		methodOne(3);
		
		methodTwo(5, 3);
		
		String hello = methodThree("Jeff");
		System.out.println(hello);
				
	}
	
	public static void methodOne(int x) {
		System.out.println(x);
	}
	public static void methodTwo(int x, int y) {
		if(x>y) {
			System.out.println(x);
			
		}
		else {
			System.out.println(y);
		}
	}
	public static String methodThree(String str) {
		return ("Hej " + str);
	}
}
