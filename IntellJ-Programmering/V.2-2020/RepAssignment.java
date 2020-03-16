import java.util.Scanner;

public class RepAssignment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Skriv ett program som läser in två heltal från konsolen och skriver ut det största.
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        System.out.println(biggerNum(firstNum, secondNum));

        //2. Skriv ett program som läser in ett heltal från konsolen och beräknar talets siffersumma.
        //Talet 1066 har siffersumman 1+0+6+6=13.
        int numberSum = scan.nextInt();


        //3. Skriv ett program som
        //4. Skriv ett program som läser in en följd av tal och multiplicerar ihop dem.
        //Inläsningen ska avbrytas då produktens belopp överstigit 100 000 eller då 10 st tal skrivits in.
        //Skriv sedan ut produkten och antalet inlästa tal.
        //5. Skriv ett program som beräknar summan av alla tal under 1000 som är jämnt delbara med ett tal som läses in från konsolen.
        //Exempelvis: input = 7 -> output = 7, 14, 21, 28 ... 994
    }

    public static int biggerNum(int firstNum, int secondNum){
        int bigNum = 0;
        if (firstNum > secondNum) {
            bigNum = firstNum;
        } else {
            bigNum = secondNum;
        }
        return bigNum;
    }

}

