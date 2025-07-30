import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a pos int.");
        } else if (n == 1) {
            System.out.println("Fibonacci Sequence:");
            System.out.println("0");
        } else {
            int a = 0;
            int b = 1;
            System.out.println("Fibonacci Sequence:");
            System.out.println(a);
            System.out.println(b);

            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}
