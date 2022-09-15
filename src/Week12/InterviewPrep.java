package Week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

    public class InterviewPrep {

        // Difference between construction and methods
        // Difference between Overloading and Overriding
        // Difference between Array and ArrayList
        // Object vs class

    /*
    //1)Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
            //sort the individual string and append them back together
            //Ex:
            //Input:  "DC501GCCCA098911"
            //OutPut: "CD015ACCCG011899"
        2) find fibonacci 10
        3) Homework
        ************ find SumOfDigit 64123 ************************
              hint: use both of the operator to solve this question % /
        4)//Write a return method that can find the unique characters from the String
              //Ex: unique("AAABBBCCCDEF") ==> "DEF";
        5) //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
           //Ex:
           //input:  {1,0,2,0,3,0,4,0};
           //output: [1, 2, 3, 4, 0, 0, 0, 0]
     */


        public static void main(String[] args) {
            //1)Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
            //sort the individual string and append them back together
            //Ex:
            //Input:  "DC501GCCCA098911"
            //OutPut: "CD015ACCCG011899"
            System.out.println("1)**********************");
            System.out.println("reverseAlphaNumeric(\"DC501GCCCA098911\") = " + reverseAlphaNumeric("DC501GCCCA098911"));
        /*
            find fibonacci 10
            0 1 1 2 3 5 8
            0 1 2 3 4 5 6
            fibonacci(0) = 0
            fibonacci(1) = 1
            fibonacci(2 ) = fibonacci(0) +fibonacci(1)
         */
            System.out.println("2)**********************");
            System.out.println("fibonacci(6) = " + fibonacci(6));


            // 4)//Write a return method that can find the unique characters from the String
            //Ex: unique("AAABBBCCCDEF") ==> "DEF";
            System.out.println("3)**********************");
            System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));

        }


        public static String unique(String string) {
            String unique = "";

            for (int i = 0; i < string.length(); i++) {
                // Outer Loop
                int count = 0;
                for (int z = 0; z < string.length(); z++) {
                    // Inner loop
                    if (string.charAt(i) == string.charAt(z)) {
                        count++;

                    }


                }

                if (count == 1) {
                    unique += string.charAt(i);
                }
            }


            return unique;
        }


        public static String reverseAlphaNumeric(String string) {
            String[] array = string.split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))");

            String temp = "";
            for (int i = 0; i < array.length; i++) {
                String element = array[i];
                String temp2 = "";
                for (int z = element.length() - 1; z >= 0; z--) {
                    temp += element.charAt(z);
                }
                temp += temp2;

            }

            return temp;
        }

        public static int fibonacci(int n) {
            // recursion
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }


    }


