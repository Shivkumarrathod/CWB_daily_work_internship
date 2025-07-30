import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("--- Simple Menu ---");
        System.out.println("1. Option A");
        System.out.println("2. Option B");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose Option A.");
                break;
            case 2:
                System.out.println("You chose Option B.");
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                scanner.close();
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }while(true);
    }
}