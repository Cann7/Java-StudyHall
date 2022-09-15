package Week5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Session1 {
    public static void main(String[] args) {

        // write  a program that can reverse a string
        //
        // Ex : Reverse("ABCDE"); ==>  EDCBA
        // Ex : Java ==> avaJ

        String str="ABCDE";
        //          01234

        // System.out.println(str.charAt(0));
        String reversed="";

        //           5-1

        for (int i =str.length()-1 ; i>=0 ; i--) {
              //     startingP.     endPoint ; inc
            System.out.println(str.charAt(i));

            reversed+=str.charAt(i);
            //reversed=reversed+str.charAt(i)

        }

        System.out.println("reversed = " + reversed);
        System.out.println("****************");

        /**INTERVIEW QUESTION.


         * Task : Write a program that checks if a String is a Palindrome.
         *
         * Example: input : Java , output: java is not  palindrome
         * Example: input : kayak , output : kayak is a palindrome
         * Example: input level , ouput : level is a palindrome
         *
         * tip: A palindrome is a word, number, phrase, or other sequence of characters
         * which reads the same backward as forward, such as madam or racecar.

         */

        String str2="java" ;

        String strReversed="";

        for (int i = str2.length()-1; i >=0 ; i--) {

            strReversed+=str2.charAt(i);

        }
        System.out.println("strReversed = "+strReversed);


        if (str2.equals(strReversed)){
            System.out.println(str2 + " is a palindrome string");
        }else {
            System.out.println(str2 + " is not a palindrome string");
        }
        System.out.println("*****************");

        String result="";

        result=(str2.equals(reversed)) ? " is palindrome " : " is not a palindrome";

        System.out.println(str2 +result);


        System.out.println("*****************");
        System.out.println("*****************");

        //    INTERVIEW QUESTION.


        //(Numbers) FINRA
        //Write a Program which prints out the numbers from 1 to 30 but for numbers which are
        // a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
        //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

        String finra="";

        for (int i = 1; i < 30; i++) {

            //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
            //i=3
            //   true  &&  false  = false
            if (i%3==0 && i%5==0){
                finra +=" FINRA ";

                //for numbers which are a multiple of 5, print "RA" instead of the number
            } else if (i%5==0) {
                finra +=" RA ";

                //for numbers which are a multiple of 3, print "FIN" instead of the number
            } else if (i%3==0) {
                finra+=" FIN ";

            }else {
                finra+=" "+i+" ";
            }


        }
        System.out.println(finra);





    }
}
