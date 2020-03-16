import java.util.ArrayList;

public class Yearswork {

    public static void main(String[] args) {
        String[] names = {"Tomas", "Tomas", "Tomas", "Are", "Tomas", "Are", "Tomas", "Are", "Tomas", "Niklas"};
        ArrayList<String> printedNames = new ArrayList<String>();
        // En for loop som loopar igenom alla namn
        for (int i = 0; i < names.length ; i++) {
            if(printedNames.contains(names[i])) // Om namnet redan skrivits ut, hoppar över iteration
                continue;

            //Om namnet inte har skrivits ut så kommer det göra det under iterationen
            int counter = 1;
            printedNames.add(names[i]);
            for (int j = i + 1; j < names.length; j++) {
                if(names[i].equals(names[j])){
                    counter++;
                }
            }
            System.out.println(names[i] + " har jobbat på skolan " + counter + " år");
        }
    }
}
