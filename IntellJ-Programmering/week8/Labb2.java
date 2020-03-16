import java.lang.Math;

public class Labb2 {

    public static void main(String[] args) {

        /*int[] arr0 = {0, 1, 5, 8, 1};
        System.out.println(arrayContain(arr0, 1));*/
        //System.out.println(invertString("Din mamma på pizza!"));
        calculateTime(0, 10, 100);
        //m5(4, 5, 10);

    }


    /**
     * Compares 2 numbers and returns the bigger number
     * @param a Input as Integer
     * @param b Input as Integer
     * @return integer, the biggest number.
     */
    public static int getBiggestNumber(int a, int b) {
        if(a < b) {
            return b;
        }
        else{
            return a;
        }
    }


    /**
     * Checks if the array contains Integer x.
     * @param arr an Integer array
     * @param x Input Number
     * @return returns a boolean, either true or false.
     */
    public static boolean arrayContain(int[] arr, int x) {
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] == x) {
                return true;
            }
        }

        return false;
    }


    /**
     * Inverts a Given String.
     * @param str String
     * @return returns the string but inverted.
     */
    public static String invertString(String str) {
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {

            result += str.charAt(i);
        }

        return result;
    }


    /**
     * It calculates the time when given a number of minutes to subtract.
     * @param hours what hour the time you want to be calculated.
     * @param minutes what minutes the time you want to be calculated.
     * @param removedMinutes How many Minutes you want to subtract with.
     */
    public static void calculateTime(int hours, int minutes, int removedMinutes) {
       hours *= 60;
       int totalMins= hours + minutes;
       int resultMins = totalMins - removedMinutes;
       hours = (resultMins - minutes)/60;
       minutes = resultMins % 60;

       double tempHours = Math.floor((minutes - removedMinutes)/60.f);

       if(hours < 0){
           hours += tempHours;
       }
       if(minutes < 0){
           minutes += 60;
       }

        System.out.println(hours + ":" + minutes);
    }



    public static void m5(int num1, int num2, int count) {
        for (int i = 1; i <= count; i++) {

            if(i % num1 == 0) {
                System.out.println("Fizz");
            }
            else if (i % num2 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}


