import java.util.Scanner;
public class Palindrome {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numb = sc.nextInt();
        int rev=0;
        int num=numb;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if(rev==numb)
        System.out.println("Palindrome");
        else
          System.out.println("Not Palindrome");  
        sc.close();
    }
}
