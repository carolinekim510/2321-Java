//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 09-TestSavingsAccount
//
//  File Name:         TestSavingsAccount.java
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
public class TestSavingsAccount {

    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  Creating an object based on the different class then call methods
    //
    //  Parameters:   None
    //
    //  Returns:      Total Savings Account balance by calculate interest, deposit and withdraw
    //
    //**************************************************************

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);


        System.out.println("Saver 1 Monthly Saving's Balance");
        saver1.calculateMonthlyInterest();
        System.out.println("\nSaver 2 Monthly Saving's Balance");
        saver2.calculateMonthlyInterest();

        saver1.setDepositAmount(1500);
        saver2.setWithdrawAmount(550);
        SavingsAccount.modifyInterestRate(0.05);

        System.out.printf("\nSaver 1 AFTER deposit: %s", saver1.toString());
        System.out.println("\nSaver 1 Monthly Saving's Balance with interest AFTER deposit");
        saver1.calculateMonthlyInterest();

        System.out.printf("\nSaver 2 AFTER withdrawal: %s", saver2.toString());
        System.out.println("\nSaver 2 Monthly Saving's Balance with interest AFTER withdrawal");
        saver2.calculateMonthlyInterest();


        //Calling developer info
        System.out.println("\n\n");
        saver1.developerInfo();
    }
}
