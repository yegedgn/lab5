import java.util.Scanner;

public class Main2 {


    public static int sumDigits(int n) {

        n = Math.abs(n);


        if (n < 10) {
            return n;
        } else {

            return (n % 10) + sumDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        int result = sumDigits(number);
        System.out.println(number + " sayısının basamakları toplamı: " + result);

        input.close();
    }
}

