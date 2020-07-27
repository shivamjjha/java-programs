import java.util.Scanner;

/**
 * Program to print the reverse of the number entered by the user.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;

        while (tryAgain) {
            try {
                System.out.println("Enter a number:");

                int a = scanner.nextInt();

                System.out.print("Reverse of number " + a + " is: ");
                while (a > 0) {
                    System.out.print(a % 10);
                    a /= 10;
                }
                tryAgain = false;
            } catch (Exception e) {
                System.out.println("\n");
                e.printStackTrace();
                scanner.next(); // Advance the pointer from illegal integer if an exception occurs
                System.out.println("\n---Do you want to try again?(y/n) : ---\n");

                char ch = scanner.next(".").charAt(0);
                tryAgain = (ch == 'y' || ch == 'Y');
            }
        }
        scanner.close();
    }
}