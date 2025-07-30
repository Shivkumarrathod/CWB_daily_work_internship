import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact =1;
            int x=num;
            while(x>=1){
                fact*=x--;
            }
            System.out.println("Factorial of "+num+" is : "+ fact);
        }
        sc.close();
    }
}
