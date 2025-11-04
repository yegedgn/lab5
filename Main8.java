import java.util.Random;

public class Main8 {


    public static int[] rotateRightByOne(int[] arr) {

        if (arr.length == 0) {
            return arr;
        }


        int last = arr[arr.length - 1];


        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }


        arr[0] = last;


        return arr;
    }

    public static void main(String[] args) {
        Random rand = new Random();


        int size = rand.nextInt(11) + 10;

        int[] numbers = new int[size];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }


        System.out.println("Original array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }


        rotateRightByOne(numbers);

      
        System.out.println("\n\nRotated array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
