//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 02
//
//  File Name:         Program1.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          Feb 11, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 2
//
//  Description:
//     Introduction to Java Applications
//
//***************************************************************

package Package1;
import java.util.Scanner;

public class Program2
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

    public static void main(String[] args) {

        developerInfo();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        int totalMilesDriven = input.nextInt();

        System.out.print("Enter cost of gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Average miles per gallon of gasoline: ");
        int avgMilesPerGallonOfGasoline = input.nextInt();

        System.out.print("Enter parking fees: ");
        double parkingFees = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = input.nextDouble();

        double dailyDrivingCost = costPerGallon * totalMilesDriven / avgMilesPerGallonOfGasoline + parkingFees + tollsPerDay;

        System.out.printf("%s%.2f", "The daily driving cost is $", dailyDrivingCost);

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
        System.out.println ("Program: Two \n");

    } // End of developerInfo
}
