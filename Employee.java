import java.util.Scanner;

/**
 * Program to implement employee class with data members i.e. name and salary
 * and member functions i.e. getdata and showdata.
 */
public class Employee {
    String name;
    double salary;

    void getData(Scanner scanner) {
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
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter number of employees: ");
            int num = scanner.nextInt();

            Employee[] employees = new Employee[num];

            for (int i = 0; i < employees.length; i++) {
                employees[i] = new Employee();
            }
            int i = 0;
            // System.out.println(employees.length);

            /*
             * employees[0].getData(); employees[1].getData();
             */

            for (i = 0; i < employees.length; i++) {
                employees[i].getData(scanner);
            }

            /*
             * for (int i = 0; i < employees.length; i++) { employees[i].printData(); }
             */

            /*
             * System.out.println("Just before loop"); int i = 0; while (num > i &&
             * scanner.hasNextLine()) { System.out.println("In loop");
             * System.out.print("\tName: \n\t"); employees[i].name = scanner.next();
             * 
             * System.out.print("\tSalary: \n\t"); employees[i].salary =
             * scanner.nextDouble(); ++i; }
             */
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