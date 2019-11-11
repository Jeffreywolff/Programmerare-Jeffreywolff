import java.util.ArrayList;

public class Primenumbers {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3;i<10;i+= 2) {
			for(int j = 1;j < i;j++) {
				if((j/i) == i ) {
					break;
				}
			}
		}
	}

}
