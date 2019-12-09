//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 04
//
//  File Name:         Program4.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          Feb 25, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 4
//
//  Description:
//     Control Statement Part 1
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

public class Program4 {
    public static void main(String[] args) {
        developerInfo();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee ID: ");
        int id = input.nextInt();
        System.out.println("Enter employee's hourly rate: ");
        double hourlyRate = input.nextDouble();
        System.out.println("Enter total worked hours of employee: ");
        int totalHours = input.nextInt();

        int regularHours = 40;
        int overTimeHours = 0;

        double overTimePay = 0;
        double regularPay;
        double grossPay;


        if (totalHours < 40)
        {
            regularPay = totalHours * hourlyRate;
            grossPay = regularPay;
            regularHours = totalHours;
        }
        else if (totalHours > 40)
        {
            overTimeHours = totalHours - 40;
            overTimePay = overTimeHours * (hourlyRate * 1.5);
            regularPay = 40 * hourlyRate;
            grossPay = regularPay + overTimePay;
        }
        else
        {
            regularPay = 40 * hourlyRate;
            grossPay = regularPay;
        }

        double deduction = 0;
        double netPay;
        int parking = 25;

        if (grossPay > 600)
        {
            deduction = grossPay * 0.105;
            netPay = (grossPay - (grossPay * 0.105)) - parking;
        }
        else
        {
            netPay = grossPay - parking;
        }

        System.out.printf("ID number: \t\t\t%s", id);
        System.out.printf("\nPay rate: \t\t\t$%.2f", hourlyRate);
        System.out.printf("\nRegular Hours: \t\t%s", regularHours);
        System.out.printf("\nOvertime Hours: \t%s", overTimeHours);
        System.out.printf("\nTotal Hours: \t\t%s", totalHours);
        System.out.printf("\nRegular Pay: \t\t$%.2f", regularPay);
        System.out.printf("\nOvertime Pay: \t\t$%.2f", overTimePay);
        System.out.printf("\nGross Pay: \t\t\t$%.2f", grossPay);
        System.out.printf("\nDeduction: \t\t\t$%.2f", deduction);
        System.out.printf("\nNet Pay: \t\t\t$%.2f", netPay);


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
        System.out.println ("Program: Four \n");

    } // End of developerInfo
}
