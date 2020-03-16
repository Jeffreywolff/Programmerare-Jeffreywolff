import java.util.Scanner;

public class classmission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[10];
        String[] nameCount = new String[10];

        System.out.println("Skriv in tio namn:");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        for (int i = 0; i < names.length ; i++) {
            String name = names[i];

            //
            for (int j = i + 1; j < names.length; j++) {
                String otherName = names[j];
                if (names[i] == names[j]){
                    nameCount[i] = names[i];
                }

            }
        }

        for (int i = 0; i <= nameCount.length ; i++) {
            System.out.println(nameCount[i]);
        }


    }
}
