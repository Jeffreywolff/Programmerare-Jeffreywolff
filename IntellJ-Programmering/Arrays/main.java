
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] fiveTable = new int[20];
        int[] sevenTable = new int[11];
    /*
        for (int i = 0; i < 20; i++) {
            fiveTable[i] = 5 * i;
            System.out.println(fiveTable[i]);
        }
    */
        /*for (int j: fiveTable) {
            System.out.println(j);
        }
    */
       /* for (int i = 0; i < 11; i++) {
            sevenTable[i] = 7 * i;
            System.out.println(sevenTable[i]);
        }
        for (int k : sevenTable) {
            System.out.println(k);

        }
        */

        String[] attendance = {"Fabian", "Jeff", "Hugo", "Leo"};
        boolean here = false;
        for (String name:attendance) {
            if(name == "Are"){
                here = true;
            }
        }
        if(here){
            System.out.println("He's here!");
        }
        else{
            System.out.println("He's not here!");
        }

    }

}
