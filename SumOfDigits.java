import java.util.Scanner;

/**
 * Program to print the sum of digits of a number entered by the user.
 * 
 * Author: Shivam Jha
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("The sum of numbers entered is: " + a + b);

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("\n---Please enter valid numbers---\n");
        } finally {
            scanner.close();
        }
    }
}