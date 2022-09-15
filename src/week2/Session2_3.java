package week2;

import java.util.Scanner;

public class Session2_3 {
    public static void main(String[] args) {

        // setting my scanner
        Scanner scanner= new Scanner(System.in);

        System.out.println("hey, whats your team name ? ");

        String userteam = scanner.nextLine();//first data will be stored in the userteam.
        String teammascot = "";

        if (userteam=="team1"){
            teammascot="eagle";

        } else if (userteam=="team2") {
            teammascot="lion";
        } else if (userteam=="team3") {
            teammascot="bull";
        } else if (userteam=="team4") {
            teammascot="dragon";
        }else if (userteam=="team5") {
            teammascot = "alligotor";
        }else if (userteam=="team6") {
            teammascot = "dolphin";
        }else {
            teammascot="unknown";

        }

        System.out.println("you enntered = "+userteam);
        System.out.println("team mascot =" +teammascot);
    }
}
