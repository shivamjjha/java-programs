import java.util.Scanner;

/**
 * Program to enter elements in array and display the array.
 */
public class DisplayArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;

        while (tryAgain) {
            try {
                System.out.println("Enter array length: ");
                int len = scanner.nextInt();

                int[] arr = new int[len];

                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Enter value of element " + (i + 1) + ": ");
                    arr[i] = scanner.nextInt();
                }

                System.out.println("Entered array:");

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

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