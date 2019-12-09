//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 01
//
//  File Name:         Program1.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          Feb 6, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 1
//
//  Description:
//     Introduction to Java Programming
//
//***************************************************************
package Package1;
public class Program1
{
    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A
    //
    //**************************************************************
    public static void main(String[] args)
    {
        double amount = 32500.00;
        double twiceMonth = amount/24;
        double biWeekly =  amount/26;

        developerInfo();

        // Enter more statements here to make the program work as expected

        System.out.println ("Annual Salary           = $" + (String.format("%.2f", amount)));
        System.out.println ("When paid twice a month = $" + (String.format("%.2f", twiceMonth)));
        System.out.println ("When paid bi-weekly     = $" + (String.format("%.2f", biWeekly)));
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
        System.out.println ("Program: One \n");

    } // End of developerInfo
}
