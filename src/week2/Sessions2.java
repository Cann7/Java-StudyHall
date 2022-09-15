package week2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Sessions2 {
    public static void main(String[] args) {

        System.out.println("HELLO");


        //Scanner is used to get data from user.

        //Step1 - set-up  Scanner

        Scanner scanner = new Scanner(System.in);  // import java.util.Scanner;

        System.out.println("hey, whats your name ?");

        // Step2 -  deciding dataType

        // first user's input value will be stored in userName variable.
        String userName = scanner.nextLine();

       // System.out.println("userName = "+userName); // username = renastech


        System.out.println("hi "+ userName + " whats your birthday ?"); //hi alican whats your birtday

        int userBirthYear = scanner.nextInt(); // second input will be userBirthYear.

        System.out.println("Hey , "+userName + " "+(2022 -userBirthYear) + " years old");





    }
}
