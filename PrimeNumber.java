import java.util.Scanner;

public class PrimeNumber {
    static int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number or not: ");
        num = sc.nextInt();

        PrimeNumber p = new PrimeNumber();
        p.checkPrimeNumber();
    }

    void checkPrimeNumber() {
        // A prime number is greater than 1 and divisible only by 1 and itself
        if (num > 1 && isDivisibleOnlyByOneAndItself()) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    boolean isDivisibleOnlyByOneAndItself() {
        // Check if the number is divisible only by 1 and itself
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // If it's divisible by any other number, it's not a prime number
                return false;
            }
        }
        return true;
    }
}
