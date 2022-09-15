package Week4;

import java.util.Scanner;

public class Session2 {
    public static void main(String[] args) {

        /**
         * Lottery - Nested if
         *
         * Let's create a new Lottery system
         *
         * 1- Ask the user's year of birth and create the user's age as variable
         * 2- Create a new int variable name it as myLuckyNumber and assign any number you want
         * 3-Ask user to enter his/her lucky number(new int variable with any value you would like to add)
         *
         * 4- if the User is 18 years old or older, and the user's luckyNumber and your lucky number is matching Print "Congrats you won 1 milyon$$$$$$$ "
         * 5- if the user is younger than 18 don't ask the user's lucky number and print "You can not join lottery because of your age , Sorry"
         * 6- if the user is 18 years old or older, and the user's lucky number and your lucky number are not matching Print "Please try again"
         */

        //1- Ask the user's year of birth and create the user's age as variable

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your birth year. example 1990,2000");

        int userInput1=scanner.nextInt(); //to calculate age.

        //2- Create a new int variable name it as myLuckyNumber and assign any number you want

        int myLuckyNumber=9;

        //3-Ask user to enter his/her lucky number(new int variable with any value you would like to add)
        System.out.println("please enter your lucky number ");
        int userInput2 = scanner.nextInt();


        //4- if the User is 18 years old or older, and the user's luckyNumber and your lucky number is matching Print "Congrats you won 1 milyon$$$$$$$ "

        // calculate age
        int userAge= 2022 - userInput1;

        //if user is 18 a years old or older and the users luckynumber and your lucky number is matching
        if (( userAge>=18)  && myLuckyNumber==userInput2) {
            System.out.println("congrats you won 1 million $$$");

            // 6- if the user is 18 years old or older, and the user's lucky number and your lucky number are not matching Print "Please try again"


        } else if (userAge >=18 && myLuckyNumber !=userInput2) {
            System.out.println("please try again");

      }else {
            System.out.println("You can not join lottery because of your age , Sorry");
        }

        //5- if the user is younger than 18 don't ask the user's lucky number and print "You can not join lottery because of your age , Sorry"

    }
}
