import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int sum=0;
        for(int i=num;i>0;i/=10){
            sum +=(i%10);
        }
        System.out.println("The sum of digits of " +num + " is: " + sum);
        sc.close();
    }
}
