//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 10-TestHouseHold
//
//  File Name:         TestHouseHold.java
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

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestHouseHold {

    public Scanner input;
    public Formatter output;
    double total = 0;
    double avgIncome = 0;
    double povertyLevel = 0;

    ArrayList<HouseHold> list = new ArrayList<HouseHold>();

    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  Creating an object by 'new' then call subclass 'Household' which created an arrayList object
    //
    //  Parameters:   Inheritance from class 'Household'
    //
    //  Returns:      Total records of averages and income of household
    //
    //**************************************************************

    public static void main(String[] args) {

        TestHouseHold survey = new TestHouseHold();
        survey.openFile();
        survey.readRecordsAndRewrite();
        survey.averageHousehold(survey.list);
        survey.exceedHousehold(survey.list, survey.avgIncome);
        survey.povertyLevel(survey.list);
        survey.closeFile();

        HouseHold info = new HouseHold();
        info.developerInfo();
    }


    // Open file
    public void openFile() {
        try {
            input = new Scanner(Paths.get("Program10.txt"));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }


    //Read records from the file and rewrite to the file.
    public void readRecordsAndRewrite() {

        try {
            output = new Formatter("Program10-out.txt");

            System.out.println("List of each Household: ");
            System.out.printf("%-15s%-20s%-12s%n", "ID Number", "Annual Income", "# of Household");

            output.format("List of each Household: \n");
            output.format("%-15s%-20s%-12s%n", "ID Number", "Annual Income", "# of Household");

            while (input.hasNext()) {

                HouseHold household = new HouseHold(input.nextInt(), input.nextDouble(), input.nextInt());
                list.add(household);
            }

            for (HouseHold a : list) {
                System.out.printf(a.toString());

                output.format(a.toString());
            }

        }
        catch (IOException | NoSuchElementException | IllegalStateException e) {

            e.printStackTrace();
        }
    }


    //Calc income average
    public void averageHousehold(ArrayList<HouseHold> a) {

        for (HouseHold i : a) {
            total += i.getIncome();
        }

        avgIncome = total / a.size();
        System.out.printf("\nAverage Household Income: $%,.2f\n",avgIncome);

        output.format("\nAverage Household Income: $%,.2f\n",avgIncome);
    }


    //Lists of exceed the average household
    public void exceedHousehold (ArrayList<HouseHold> a, double avgIncome) {

        System.out.println("\nIdentification number and income of each household that exceeds the average: ");
        System.out.printf("%-15s%-20s%n", "ID Number", "Annual Income");

        output.format("\nIdentification number and income of each household that exceeds the average: \n");
        output.format("%-15s%-20s%n", "ID Number", "Annual Income");

        for (HouseHold i : a) {
            if (i.getIncome() > avgIncome) {
                System.out.printf("%-15s%-20s%n", i.getId(), i.getIncome());

                output.format("%-15s%-20s%n", i.getId(), i.getIncome());
            }
        }
    }


    // Calculate PovertyLevel
    public void povertyLevel (ArrayList<HouseHold> a) {

        System.out.println("\nIdentification Number and income of households that have income below the 2018 United States Contiguous States poverty level: ");
        System.out.printf("%-15s%-20s%n", "ID Number", "Annual Income");

        output.format("\nIdentification Number and income of households that have income below the 2018 United States Contiguous States poverty level: \n");
        output.format("%-15s%-20s%n", "ID Number", "Annual Income");

        double belowCount = 0;
        double percentage;

        for (HouseHold i : a) {

            povertyLevel = 16460.00 + 4230.00 * (i.getHousehold() - 2);

            if (i.getIncome() < povertyLevel) {
                System.out.printf("%-15s%-20s%n", i.getId(), i.getIncome());
                belowCount++;

                output.format("%-15s%-20s%n", i.getId(), i.getIncome());
            }

        }

        percentage = belowCount / a.size() * 100;
        System.out.printf("\nPercentage of household that have income below the 2018 United States Contiguous States poverty level : %.0f%%\n\n", percentage);

        output.format("\nPercentage of household that have income below the 2018 United States Contiguous States poverty level : %.0f%%", percentage);

    }


    // Close file
    public void closeFile()
    {
        if (input != null)
            input.close();

        output.close();
    }
}
