import java.util.Random;

public class Main10 {
    public static void main(String[] args) {
        final int SIZE = 30;
        int[] arr = new int[SIZE];
        Random rand = new Random();


        for (int i = 0; i < SIZE; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }


        System.out.println("Generated Array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println("\n");


        int peakCount = 0;
        int tallestPeak = Integer.MIN_VALUE;

        System.out.println("Peaks found:");


        for (int i = 1; i < SIZE - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peakCount++;
                System.out.print(arr[i] + " ");


                if (arr[i] > tallestPeak) {
                    tallestPeak = arr[i];
                }
            }
        }

      
        System.out.println("\n\nTotal number of peaks: " + peakCount);
        if (peakCount > 0) {
            System.out.println("Tallest peak value: " + tallestPeak);
        } else {
            System.out.println("No peaks found in the array.");
        }
    }
}
