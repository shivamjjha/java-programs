import java.util.Scanner;

/**
 * Program to implement employee class with data members i.e. name and salary
 * and member functions i.e. getdata and showdata.
 */
public class Employee {
    static Scanner scanner = new Scanner(System.in);
    String name;
    double salary;

    void getData() {
        // Scanner scanner = new Scanner(System.in);
        System.out.print("\tName: \n\t");
        name = scanner.next();

        System.out.print("\tSalary: \n\t");
        salary = scanner.nextDouble();
    }

    void printData() {
        System.out.println("\tName: " + name);
        System.out.println("\tName: " + salary + '\n');
    }

    public static void main(String[] args) {
        
        try {
            System.out.println("Enter number of employees: ");
            int num = scanner.nextInt();

            Employee[] employees = new Employee[num];

            for (int i = 0; i < employees.length; i++) {
                employees[i] = new Employee();
            }
            int i = 0;

            for (i = 0; i < employees.length; i++) {
                employees[i].getData();
            }

            System.out.println("\n-----Employee Data-----");
            for (i = 0; i < employees.length; i++) {
                employees[i].printData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}