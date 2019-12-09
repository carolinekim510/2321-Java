//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 05
//
//  File Name:         Program5.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          March 1, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 5
//
//  Description:
//     Control Statement Part 2
//
//***************************************************************

package Package1;
import java.util.Scanner;

//***************************************************************
//
//  Method:       main
//
//  Description:  Calling the methods from different class.
//
//  Parameters:   None
//
//  Returns:      Returns all the values of hours, overtime hours, pay, overtime pay angross pay a
//
//**************************************************************

public class Program5 {
    public static void main(String[] args) {
        developerInfo();

        Scanner input = new Scanner(System.in);

        double discount = 0;
        double cost;
        double savings;
        double total_cost;


        System.out.println("Enter the number of units: ");
        int units = input.nextInt();
        cost = units * 99;

        if (units >= 200)
            discount = .48;
        else if (units >= 121)
            discount = .42;
        else if (units >= 91)
            discount = .35;
        else if (units >= 66)
            discount =  .27;
        else if (units >= 40)
            discount = .18;
        else if (units >= 10)
            discount = .10;

        savings = cost * discount;
        total_cost = cost - (cost * discount);


        System.out.printf("\nNumber of units purchased is: %s", units);
        System.out.printf("\nDiscount applied is: %.0f%%", discount * 100);
        System.out.printf("\nTotal savings dut to discount is: $%.2f", savings);
        System.out.printf("\nThe total cost of the purchase is: $%.2f", total_cost);




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
        System.out.println ("Program: Five \n");

    } // End of developerInfo

}
