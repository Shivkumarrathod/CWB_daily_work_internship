import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctPassword = "java123";

        String enteredPassword;
        int no=0;
        do {

            System.out.print("Enter password: ");

            enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(correctPassword)&& no<5) {

                System.out.println("Incorrect password. Please try again.");
                no++;
            }

        } while (!enteredPassword.equals(correctPassword) && no<5);
        
        if(no==5){
                System.out.println("Number of tries exceeded.");
            }
            else{
        System.out.println("Access granted!");
            }
        scanner.close();

    }
 
}
