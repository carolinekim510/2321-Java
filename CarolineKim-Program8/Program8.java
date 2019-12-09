//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 08
//
//  File Name:         Program8.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          April 9, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 7
//
//  Description:
//     Arrays and ArrayLists
//
//***************************************************************


package Package1;

import java.util.Scanner;

public class Program8 {

    Scanner input = new Scanner(System.in);

    boolean assignSeat[] = new boolean[10];
    int firstClassCounts = 0;
    int economyCounts = 4;

    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  Calling the methods to create a reservation for the user
    //
    //  Parameters:   None
    //
    //  Returns:      The customer's chosen class and assigned seat.
    //
    //**************************************************************

    public static void main(String[] args) {

        Program8 airplaneTicket = new Program8();
        airplaneTicket.developerInfo();
        airplaneTicket.selection();

    }


    public void selection(){

        while (seatCheck(assignSeat) != true) {

            System.out.println("Please enter 1 for First Class or 2 for Economy: ");
            int classSelect = input.nextInt();

            if (classSelect == 1) {
                firstClass();

            } else if (classSelect == 2) {
                economyClass();

            } else
                System.out.println("Enter valid class: ");
        }

        System.out.println("All seats are fully booked.");

    }


    public void firstClass(){

        if (firstClassCounts < 5) {
            assignSeat[firstClassCounts] = true;
            firstClassCounts++;
            System.out.println("Here is your boarding ticket");
            System.out.printf("Class: \tFirst Class\n");
            System.out.printf("Seat: \t%d\n\n", firstClassCounts);

        } else if (firstClassCounts == 5){

            char choice;

            System.out.println("First Class is full");
            System.out.println("We still have an availabilities in Economy Class.");
            System.out.println("Would you to book an Economy Class? Y/N: ");
            choice = input.next().toLowerCase().charAt(0);

                if (choice == 'y') {
                    economyClass();
                } else {
                    System.out.println("Next flight leaves in 3 hours. \n");
                }
        }
    }


    public void economyClass(){

        if (economyCounts < 10) {
            assignSeat[economyCounts] = true;
            economyCounts++;
            System.out.println("Here is your boarding ticket");
            System.out.printf("Class: \tEconomy Class\n");
            System.out.printf("Seat: \t%d\n\n", economyCounts);

        } else if (economyCounts == 10){

            char choice;

            System.out.println("Economy Class is full");
            System.out.println("We still have an availabilities in First Class.");
            System.out.println("Would you to book an First Class? Y/N: ");
            choice = input.next().toLowerCase().charAt(0);

                if (choice == 'y') {
                    firstClass();
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
        }
    }


    public boolean seatCheck(boolean[] assignSeat) {

        for (int s = 0; s < assignSeat.length; s++)
        {
          //if (!assignSeat[s]) return false;
            if (assignSeat[s] == false)
            {
                return false;
            }
        }
        return true;
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
        System.out.println ("Program: Eight \n");

    } // End of developerInfo
}



