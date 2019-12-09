//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 09-SavingsAccount
//
//  File Name:         SavingsAccount.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          April 23, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 8
//
//  Description:
//     Classes and Objects: A Deeper Look
//
//***************************************************************


package Program9;

public class SavingsAccount {


    private static double annualInterestRate = 0.04;
    private double savingsBalance;
    private double deposit;
    private double withdraw;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


    // Calculate TOTAL saving balance with monthly interest rate
    public void calculateMonthlyInterest() {

        for (int i = 1; i <= 12; i++) {
            savingsBalance += savingsBalance * annualInterestRate / 12;
            System.out.printf("Month: %d\t%s\n", i, toString());
        }
    }


    // Set and Get Deposit Amount
    public void setDepositAmount(double deposit) {

        if (deposit < 0.0) {
            throw new IllegalArgumentException("The deposit amount can't be negative.");
        } else
            this.deposit = deposit;
        savingsBalance += deposit;
    }
    public double getDepositAmount() { return deposit; }


    // Set and get Withdraw Amount
    public void setWithdrawAmount(double withdraw) {
        if (withdraw < 0.0) {
            throw new IllegalArgumentException("The withdraw amount can't be negative.");
        } else
            this.withdraw = withdraw;
        savingsBalance -= withdraw;
    }
    public double getWithdrawAmount() { return withdraw; }


    // Modify Interest Rate
    public static void modifyInterestRate(double rate) {
        if (rate < 0.02 || rate > 0.05) {
            throw new IllegalArgumentException("The interest rate should be between 2 to 5%.");
        } else
            annualInterestRate = rate;
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
        System.out.println("Program: Nine \n");
    }

        // To convert the variable to string and be able to call at main
    @Override
    public String toString() {
        return String.format("$%,.2f", savingsBalance);
    }



     // End of developerInfo

}
