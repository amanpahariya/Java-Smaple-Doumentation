/**
 * <h1>Print the Details of Employee</h1>
 * The EmployeeDetails impelment an application that
 * print the Employee Details on the screen
 *
 * @author Aman Gupta
 * @version 1.0
 * @since 2020-03-17
 */

public class EmployeeDetails {
    /**
     * This method is used to print the employee details
     *
     * @param name
     * @param age
     * @param salary
     */
    public static void printEmpDetails(String name, int age, int salary) {
        System.out.println("Employee's name is "+name+", he is "+age+" years old, and his pay is $"+salary);
    }

    /**
     * This is the main method which make use of printEmpDetails method
     *
     * @param args
     * @return nothing
     */
    public static void main(String[] args) {
        String name = "John";
        int age = 26;
        int salary = 35000;
        printEmpDetails(name, age, salary);
    }
}