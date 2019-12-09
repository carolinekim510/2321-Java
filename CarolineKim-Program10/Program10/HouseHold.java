//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 10-HouseHold
//
//  File Name:         HouseHold.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          April 31, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 1-9, 11 and 15
//
//  Description:
//     Objects, Classes, Methods, Exception, and Files
//
//***************************************************************


package Program10;

public class HouseHold {

    private int id;
    private double income;
    private int household;

    public HouseHold (int id, double income, int household) {
        this.id = id;
        this.income = income;
        this.household = household;
    }

    public HouseHold () {}

    // Set & Get id:
    public void setId (int id) { this.id = id; }
    public int getId () { return id; }

    // Set & Get income:
    public void setIncome (double income) { this.income = income; }
    public double getIncome () { return income; }

    // Set & Get Household:
    public void setHousehold (int household) { this.household = household; }
    public int getHousehold () { return household; }

    @Override
    public String toString() {
        return String.format("%-15d%-20.2f%-12d%n", getId(), getIncome(), getHousehold());
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

    public void developerInfo() {
        System.out.println("Name:    Caroline Kim");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: Ten \n");
    }

}
