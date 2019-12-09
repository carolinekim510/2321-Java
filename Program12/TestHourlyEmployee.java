package Program12;

import java.util.Scanner;

public class TestHourlyEmployee {


    public static void main(String[] args) {

        TestHourlyEmployee employeeTest = new TestHourlyEmployee();
        employeeTest.calc();
        employeeTest.developerInfo();
    }

    public void calc() {

        Scanner input = new Scanner(System.in);
        String name;
        double payRate;

        //To collect hours
        double[] hoursWorked = new double[4];

        String choice = "";

        do {

            System.out.println("Enter name: ");
            name = input.nextLine();

            //Splitting Name
            String[] spilitName = name.split(" ");
            String firstName = spilitName[0];
            String lastName = spilitName[1];

            System.out.println("Enter Pay Rate: ");
            payRate = input.nextDouble();

            //attributes for regularHours & overTime SET to 0
            double regularHour;
            double overTime;
            double totalRegularHour = 0.0;
            double totalOverTime = 0.0;

            for (int i = 0; i < 4; i++) {

                System.out.printf("Enter week%s hours: ", i + 1);
                hoursWorked[i] = input.nextDouble();

                if (hoursWorked[i] > 40) {
                    overTime = hoursWorked[i] - 40;
                    regularHour = 40;
                } else {
                    regularHour = hoursWorked[i];
                    overTime = 0.0;
                }

                totalRegularHour += regularHour;
                totalOverTime += overTime;
            }

            HourlyEmployee eInfo = new HourlyEmployee(firstName, lastName, payRate, totalRegularHour, totalOverTime);
            System.out.println(eInfo.toString());


            System.out.println("Try with another Employee? Y/N: ");
            choice = input.next();
            input.nextLine();

        }

        while (!(choice.equals("n") || choice.equals("N")));

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
        System.out.println("Program: Twelve \n");
    }
}

