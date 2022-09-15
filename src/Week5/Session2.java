package Week5;

public class Session2 {
    public static void main(String[] args) {


        /**
         * //    (String) Remove Duplicates
         * //    Write a  program that can remove the duplicated values from String
         * //
         * //    Ex:  removeDup("AAABBABCBCCDDAD")  ==> ABCD
         *      Ex :  java >> jav
         */

        String str="AABC";

        System.out.println(str.contains("Z"));
        //

        String result="";// we will store answer in to  this variable.


        for(int i=0; i< str.length(); i++ ){

            // System.out.println(str.charAt(i));// this will print all of the char. from the str.

            if (!(result.contains( ""+ str.charAt(i) ))){
                //      not  result contains  A
                //      not result contains   B
                // if result doesn't contain  str.charAt(i);



                result+=""+str.charAt(i);
                //      =A B C D

                // System.out.println(result);

            }


        }

        System.out.println("result = " + result);


        /**
         * Write a code where it ask user to enter an integer number
         * - Reverse the given number and print the result
         * - Example input ( 5678 )
         * - Example output ( 8765 )
         *
         *   Ex: 12 >> 21
         *    36    63
         */

        int myNumber=5678;



        int revereseOfA=0;

        while ( myNumber !=0){
            //   34 !=0
            //  3 !=0
            // 0 !=0

            int lastDigit= myNumber %10;  // 5 , 4 , 3

            revereseOfA = revereseOfA *10 +lastDigit;
            //            = 0 *10 + 5=   5
            //           = 5 * 10 + 4 = 54
            //            = 54 *10 + 3 == 543

            myNumber= myNumber/10;
            //      = 345/10 >> 34.5>> 34
            //       = 34 /10 > 3.4 >> 3
            //        = 3 /10 > 0.3> 0


        }

        System.out.println(revereseOfA);


        // // Write a program that will check if the given number is a  prime number or not
        //
        //        // 13 => prime , 17 prime
        //        // 22  -- not prime


        int number=8;

        int countOfTheDiveders=0;

        if (number ==2  || number ==3){
            System.out.println(number+ " is a prime number");
        }else {

            for (int i = 2; i <number ; i++) {


                if (number % i==0){
                    countOfTheDiveders++;
                }

            }


        }

        if (countOfTheDiveders ==0){
            System.out.println(number +" is a prime number");
        }else {
            System.out.println(number +" is not a prime number");
        }




    }
}

