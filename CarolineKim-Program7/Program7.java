//***************************************************************
//
//  Developer:         Caroline Kim
//
//  Program #:         Assignment 07
//
//  File Name:         Program7.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          April 1, 2019
//
//  Instructor:        Fred Kumi
//
//  Chapter:           Chapter 6
//
//  Description:
//     Methods: Deeper look
//
//***************************************************************

package Package1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.security.SecureRandom;

public class Program7 {

    //***************************************************************
    //
    //  Method:       main
    //
    //  Description:  Calling the methods to play multiply questions.
    //
    //  Parameters:   None
    //
    //  Returns:      If the questions are answered correctly or not there will be response depends.
    //
    //**************************************************************

    public static void main(String[] args) {

        Program7 game = new Program7();
        game.developerInfo();
        game.PlayTest();

    }

    // Let the Play() 5 times until all the questions are answered
    void PlayTest(){

        for (int i = 1; i <= 5; i++) {

            Play();
        }
        Replay();

    }

    // Method to create a play : It creates only one play at a time
    void Play(){
        SecureRandom randNum = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int num1 = 1 + randNum.nextInt(9);
        int num2 = 1 + randNum.nextInt(9);
        int answer;
        int correctAnswer = num1 * num2;

        System.out.printf("How much is %d times %d: ", num1, num2);
        answer = input.nextInt();

        if (correctAnswer == answer)
        {
            ResponseCorrect();
        }
        else {
            while (correctAnswer != answer)
            {
                ResponseIncorrect();
                System.out.printf("How much is %d times %d: ", num1, num2);
                answer = input.nextInt();
            }
            ResponseCorrect();
        }
    }

    // Ask to see if the student will be playing again after 5 questions answered
    void Replay(){
        Scanner input = new Scanner(System.in);

        System.out.printf("Do you wish to play again? Y/N: ");
        String choice = input.nextLine().toLowerCase();

        while (choice.equals("y"))
        {
            Play();
            System.out.printf("Do you wish to play again? Y/N: ");
            choice = input.nextLine().toLowerCase();

        }

        if (choice != "y"){
            System.out.println("Good Bye!");
        }
    }


    // Switch for correct answers
    void ResponseCorrect(){
        SecureRandom randomResponse = new SecureRandom();
        int a = 1 + randomResponse.nextInt(5);

        switch (a) {
            case 1:
                System.out.println ("Excellent!\n");
                break;
            case 2:
                System.out.println ("Very good!\n");
                break;
            case 3:
                System.out.println ("Nice work!\n");
                break;
            case 4:
                System.out.println ("Way to go!\n");
                break;
            case 5:
                System.out.println ("Keep up the good work!\n");
                break;
        }
    }

    // Switch for incorrect answers
    void ResponseIncorrect(){
        SecureRandom randomResponseIncorrect = new SecureRandom();
        int b = 1 + randomResponseIncorrect.nextInt(5);

        switch (b) {
            case 1:
                System.out.println ("That is incorrect!\n");
                break;
            case 2:
                System.out.println ("No, Please try again!\n");
                break;
            case 3:
                System.out.println ("Wrong, Try once more!\n");
                break;
            case 4:
                System.out.println ("Don't give up!\n");
                break;
            case 5:
                System.out.println ("No. Keep trying!\n");
                break;
        }
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
        System.out.println ("Program: Seven \n");

    } // End of developerInfo
}

