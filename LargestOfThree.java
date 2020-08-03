import java.util.Scanner;

/**
 * Program to find the largest of three numbers using conditional statement.
 * 
 * Author: Shivam Jha
 */
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;

        while (tryAgain) {
            try {
                System.out.println("Enter three numbers:");

                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                int max;

                if (a > b && a > c)
                    max = a;
                else if (b > a && b > c)
                    max = b;
                else
                    max = c;

                System.out.println("The largest of three numbers entered is: " + max);

                tryAgain = false;
            } catch (Exception e) {
                System.out.println("\n");
                e.printStackTrace();
                scanner.next(); // Advance the pointer from illegal integer to take current value if an
                                // exception occurs
                System.out.println("\n---Do you want to try again?(y/n) : ---\n");

                char ch = scanner.next(".").charAt(0);
                tryAgain = (ch == 'y' || ch == 'Y');
            }
        }
        scanner.close();
    }
}