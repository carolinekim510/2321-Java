//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 06
//
//  File Name:         Program6.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          March 17, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 15
//
//  Description:
//     Files, Streams, and Methods
//
//***************************************************************


package Package1;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

//***************************************************************
//
//  Method:       main
//
//  Description:  Calling the methods to open, read, write and close the file.
//
//  Parameters:   None
//
//  Returns:      Returns total earnings after raise.
//
//**************************************************************

public class Program6 {
    private Scanner input;

    // Declare and initializing global variables
    int numCount = 0;
    double raise = 0.0;
    double pay, salary;
    double totalSalary = 0;
    double totalRaise = 0;
    double totalPayroll = 0;
    double raisePercent = 0;

    public static void main(String[] args)
    {
        developerInfo();

        Program6 myObject = new Program6();
        myObject.openFile();
        myObject.readRecordsAndWrite();
        myObject.closeFile();

    }


    // Open file
    public void openFile()
    {
        try
        {
            input = new Scanner(Paths.get("Program6.txt"));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }


    // Read records from the file and write to the file : it is happening same the same time.
    public void readRecordsAndWrite()
    {
        try
        {
            File file = new File("Program06-output.txt");

            if (!file.exists()){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
            System.out.println("Employee earnings: \nSalary: \t\t % Raise: \t\t Earnings: \t\t\t Total Payroll: \n");

            pw.println("Employee earnings: \nSalary: \t% Raise: \tEarnings: \t\tTotal Payroll: \n");

            while (input.hasNext()) // while there is more to read
            {
                // Calculation raise and earnings
                salary = input.nextDouble();         //salary
                raisePercent = calcRaise(salary);            //calculate raise
                raise = salary * raisePercent / 100;
                pay = salary + raise;                 //Total earning

                // Calculation of total amount and average
                numCount++;
                totalSalary += salary;
                totalRaise += raise;
                totalPayroll += pay;

                // display record contents
                System.out.printf("$%,.2f \t\t %.1f \t\t\t $%,.2f \t\t\t $%,.2f%n", salary, raisePercent, raise, pay);
                pw.printf("$%,.2f \t%.1f \t\t$%,.2f \t\t$%,.2f%n", salary, raisePercent, raise, pay);
            }

            System.out.printf("%n\tTotal salary(before raise): $%,.2f%n \tTotal payroll(after raise): $%,.2f%n  Average payroll(after raise):  $%,.2f%n%n", totalSalary, totalPayroll, totalPayroll/numCount);
            System.out.printf("\tTotal raise: $%,.2f%n Average raised: $%,.2f%n", totalRaise, totalRaise/numCount);

            pw.printf("%n  Total salary(before raise): $%,.2f%n  Total payroll(after raise): $%,.2f%nAverage payroll(after raise): $%,.2f%n%n", totalSalary, totalPayroll, totalPayroll/numCount);
            pw.printf("   Total raise: $%,.2f%nAverage raised: $%,.2f%n", totalRaise, totalRaise/numCount);
            pw.close();

            System.out.println("DONE");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating.");
        }
        catch (IllegalStateException stateException)
        {
            System.err.println("Error reading from file. Terminating.");
        }
    }


    // Calculate raise per faculty
    public double calcRaise(double salary)
    {
        if (salary > 70000.00) {
            raise = 4;
        }
        else if (salary > 50000.00) {
            raise = 7;
        }
        else
            raise = 5.5;

        return raise;
    }


    // Close file
    public void closeFile()
    {
        if (input != null)
            input.close();
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
        System.out.println ("Program: Six \n");

    } // End of developerInfo

}
