import java.util.Scanner;

/**
 * Program to print the sum of digits of a number entered by the user.
 * 
 * Author: Shivam Jha
 */

public class SumOfDigits {

    public static int sum(int a){
        if(a==0)
        return a;
        else return a%10+sum(a/10);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");

            int a = scanner.nextInt();
            
            System.out.println("The sum of digits of the number entered is: " + sum(a));

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("\n---Please enter valid number---\n");
        } finally {
            scanner.close();
        }
    }
}