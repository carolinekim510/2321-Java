//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 11
//
//  File Name:         Program11.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          May 15, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapters 1 - 9, 14, and 15:
//
//  Description:
//  Objects, Classes, Methods, Strings, and Files
//
//***************************************************************


package Package1;

import java.util.Scanner;

public class Program11 {

    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  Conversion date format to letter format of month/day/year
    //
    //  Parameters:   None
    //
    //  Returns:
    //
    //**************************************************************

    public static void main(String[] args) {

        Program11 devInfo = new Program11();

        Scanner input = new Scanner(System.in);
        String choice="";

        do {
            //Entering date in NUM format
            System.out.println("Enter the date in format of mm/dd/yyyy: ");
            String date = input.nextLine();

            //Splitting date
            String[] spilDate = date.split("/");

            if (spilDate.length == 3 && spilDate[0].matches("[0-9]+") && spilDate[1].matches("[0-9]+") && spilDate[2].matches("[0-9]+")) {
                int month = Integer.parseInt(spilDate[0]);
                int day = Integer.parseInt(spilDate[1]);
                int year = Integer.parseInt(spilDate[2]);

                String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
                String monthLetter;
                int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


                //checking MONTH
                if (month <= 0 || month > 12) {
                    throw new IllegalArgumentException("The Month(" + month + ") must be between 1 to 12.");
                }
                //checking DAY
                else if (day <= 0 || (day > monthDays[month - 1] && !(month == 2 && day == 29))) {
                    throw new IllegalArgumentException("The day (" + day + ") out of range for specified month and year");
                }
                //checking YEAR & LEAP YEAR
                else if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                    throw new IllegalArgumentException("The day(" + day + ") out of range for the specific month and year");
                }
                //assigning month to LETTER
                else
                    monthLetter = monthName[month - 1];

                //printing the date in LETTER format
                System.out.printf("%s %d,%d\n", monthLetter, day, year);
            }


                System.out.println("Do you like to try again? Y/N: ");
                choice = input.nextLine().toLowerCase();

        }

        while (!choice.equals ("n"));
        devInfo.developerInfo();

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

    public void developerInfo()
    {
        System.out.println ("Name:    Caroline Kim");
        System.out.println ("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println ("Program: Eleven \n");

    } // End of developerInfo
}
