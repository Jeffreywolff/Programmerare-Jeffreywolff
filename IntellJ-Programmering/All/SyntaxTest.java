

public class SyntaxTest {
    public static void main(String[] args) {
        int[] arrayX = {1,2,3,4,5};
        m5(arrayX, 1);
    }

    public static void m5(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                System.out.println(i);
            }
        }
    }


}


