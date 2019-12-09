//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 03
//
//  File Name:         Employee.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          Feb 18, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 3
//
//  Description:
//     Introduction to Classes
//
//***************************************************************

package Package1;

public class EmployeeTest {

    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  Calling the methods from different class.
    //
    //  Parameters:   None
    //
    //  Returns:      Returning employee's information: First name, last name and their salaries per month.
    //
    //**************************************************************

    public static void main(String[] args) {

        developerInfo();

        Employee employee1 = new Employee("John", " Doe", 2875.00);
        Employee employee2 = new Employee("Jane", " Doe", 3150.75);


        double yearlySalaryE1 = employee1.getMonthlySalary() * 12;
        double yearlySalaryWithRaiseE1 = (yearlySalaryE1 * 0.2) + yearlySalaryE1;

        double yearlySalaryE2 = employee2.getMonthlySalary() * 12;
        double yearlySalaryWithRaiseE2 = (yearlySalaryE2 * 0.2) + yearlySalaryE2;


        System.out.println("First Name \t Last Name \t Yearly Salary \t Yearly Salary with raise");
        System.out.printf("%s \t\t%s \t\t $%.2f \t\t $%.2f%n", employee1.getFirstName(), employee1.getLastName(), yearlySalaryE1, yearlySalaryWithRaiseE1);
        System.out.printf("%s \t\t%s \t\t $%.2f \t\t $%.2f", employee2.getFirstName(), employee2.getLastName(), yearlySalaryE2, yearlySalaryWithRaiseE2);


    }


    //***************************************************************
    //
    //  Method:       developerInfo
    //
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A
    //
    //**************************************************************

    public static void developerInfo()
    {
        System.out.println ("Name:    Caroline Kim");
        System.out.println ("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println ("Program: Three \n");

    } // End of developerInfo

}
