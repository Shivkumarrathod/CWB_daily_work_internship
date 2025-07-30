public class IncDecOps {
    public static void main(String[] args) {
        int a;

        // Post-increment
        a = 5;
        System.out.println("Initial a: " + a);
        System.out.println("a++: " + (a++)); // Prints 5, then a becomes 6
        System.out.println("a after a++: " + a); // Prints 6

        // Pre-increment
        a = 5;
        System.out.println("\nInitial a: " + a);
        System.out.println("++a: " + (++a)); // a becomes 6, then prints 6
        System.out.println("a after ++a: " + a); // Prints 6

        // Post-decrement
        a = 5;
        System.out.println("\nInitial a: " + a);
        System.out.println("a--: " + (a--)); // Prints 5, then a becomes 4
        System.out.println("a after a--: " + a); // Prints 4

        // Pre-decrement
        a = 5;
        System.out.println("\nInitial a: " + a);
        System.out.println("--a: " + (--a)); // a becomes 4, then prints 4
        System.out.println("a after --a: " + a); // Prints 4
    }
}