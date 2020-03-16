public class Testing {
    public static void main(String[] args) {
        String[] array1 = {"Hello", "Hej", "Ni hao"};
        int[] array2 = {1, 2, 3, 4};
        printContentArrayString(array1);
        printContentArrayInt(array2);
    }

    public static void printContentArrayString(String[] arr){
        for(String str: arr){
            System.out.println(str);
        }

    }

    public static void printContentArrayInt(int[] arr){
        for(int value: arr){
            System.out.println(value);
        }

    }


}
