import java.util.ArrayList;
import java.util.Scanner;

public class Kattisrep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = input.nextInt();

        for(int i = 0; i < times; i++){

            int cities = input.nextInt();

            ArrayList<String> log = new ArrayList<>();

            for(int j = 0; j <= cities; j++){

                String str = input.nextLine();
                if(!log.contains(str)){
                    log.add(str);
                }
            }
            System.out.println(log.size()-1);
        }



    }

}
