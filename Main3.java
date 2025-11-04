import java.util.Scanner;

public class Main3 {


    public static long power(long base, int exp) {

        if (exp == 0) {
            return 1;
        } else {
           
            return base * power(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban (base) değerini girin: ");
        long base = input.nextLong();

        System.out.print("Üs (exponent) değerini girin: ");
        int exp = input.nextInt();

        long result = power(base, exp);

        System.out.println(base + " ^ " + exp + " = " + result);

        input.close();
    }
}
