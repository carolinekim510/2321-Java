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
public class Employee {

    //***************************************************************
    //
    //  Method:       Set of methods
    //
    //  Description:  Set of methods that will be called at main.
    //
    //  Parameters:   None
    //
    //  Returns:      Yearly Salary and Yearly Salary with Raise.
    //
    //**************************************************************

    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Created constructor
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // set & get First name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    // set & get Last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    // set & get Monthly Salary
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }


    //getting yearlySalary
    public double yearlySalary(){
        double yearlySalary;
        yearlySalary = monthlySalary *12;
        return yearlySalary;
    }

    // getting yearlySalary with raise
    public double yearlySalaryWithRaise(){
        double yearlySalaryWithRaise;
        yearlySalaryWithRaise = (yearlySalary() * 0.2) + yearlySalary();
        return yearlySalaryWithRaise;
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



