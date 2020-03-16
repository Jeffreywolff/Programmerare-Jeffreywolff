import java.util.Random;

public class Ranomization {
    public static void main(String[] args) {



        for(int i = 0; i < 10; i++){
            System.out.println(randomNum(1,7));
        }

    }

    public static int randomNum(int bottom, int top){
        /*double num = Math.random();

        num *= (top - bottom + 1);

        num += bottom;
        int result = (int)num;
        return result;*/
        Random rand = new Random();
        return rand.nextInt(top - bottom + 1) + bottom;
    }
}
