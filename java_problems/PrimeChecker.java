import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check if it's prime: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            scanner.close();
            return;
        }

        boolean isPrime = true;
        // Loop from 2 up to sqrt(num) for efficiency.
        // If num has a divisor larger than its sqrt, it must also have one smaller.
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false; // Found a divisor, so it's not prime
                break;           // No need to check further
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
}
