package week2;

import java.util.Scanner;

public class Sessions2_2 {
    public static void main(String[] args) {

        // set-up  to get data from user
        Scanner input = new Scanner(System.in);

        System.out.println("whats your team ? ");

        String userTeam = input.nextLine();

        String teamMascot = ""; // we will use this variable to put our mascot.

        switch (userTeam) {

            case "team1":
                teamMascot = "eagle";
                break;
            case "team2":
                teamMascot = "lion";
                break;
            case "team3":
                teamMascot = "bull";
                break;
            case "team4":
                teamMascot = "dragon";
                break;
            case "team5":
                teamMascot = "alligotor";
                break;
            case "team6":
                teamMascot = "dolphin";
                break;

            default:
                teamMascot = "unknown";

        }

                System.out.println("you entered " + userTeam);
                System.out.println("teams mascot " + teamMascot);






    }
}
