import java.util.Scanner;

/**
 * Program to implement employee class with data members i.e. name and salary
 * and member functions i.e. getdata and showdata.
 */
public class Employee {
    String name;
    double salary;

    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tName: ");
        name = scanner.nextLine();

        System.out.println("\tSalary: ");
        salary = scanner.nextDouble();

        scanner.close();
    }

    void printData() {
        System.out.println("\tName: " + name);
        System.out.println("\tName: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter number of employees: ");
            int num = scanner.nextInt();

            Employee[] employees = new Employee[3];
            System.out.println(employees.length);

            for (int i = 0; i < employees.length; i++) {
                employees[i].getData();
            }

            for (int i = 0; i < employees.length; i++) {
                employees[i].printData();
            }
            /* Employee a = new Employee();
            a.getData();
            a.printData(); */

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}