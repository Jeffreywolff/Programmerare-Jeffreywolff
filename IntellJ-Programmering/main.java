
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] fiveTable = new int[20];

        for (int i = 0; i < 20; i++) {
            fiveTable[i] = 5 * i;
            System.out.println(fiveTable[i]);
        }
    }

}
