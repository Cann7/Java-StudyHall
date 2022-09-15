package week1;

public class Session3 {
    public static void main(String[] args) {

        //logical operators
        // &&  => and
        // || => or
        // ! => not

        //relational operators
        // == equals  5==3
        boolean b1 = 5==3;
        System.out.println("b1 = " +b1); //b1 = false

        //!= not equals , returns true or false

        boolean b2=10 !=5;
        System.out.println("b2 = " + b2); //b2 =true

        // >
        // >=
        //<
        //=

        //IF , ELSE , ELSE, ELSE IF

        /**
         *
         *
         * if(condition){
         * the block of the code to be executed if condition is true
         *
         * }
         */

        String  weather = "rainy";

        // if weather is sunny
        if(weather=="sunny") {
            //rainy

            System.out.println("i will meet with you");
            System.out.println("we can go to eat");
            System.out.println("we can go to the cinema");

        }

        System.out.println("hello hello");

        int age=24;

        boolean hasmoney=true;

        System.out.println("welcome yo the liqour store");
        if (age >=21 && hasmoney){
            //true && true >>true

            System.out.println("enjoy your wine");
        }


        System.out.println("case2");

        age=20;
        hasmoney=false;

         // 20>=21
        if (age >=21 && hasmoney){
            // false && false

            System.out.println("enjoy your wine");
        }

        //if else.

        System.out.println("case 3 ");

        int age2= 21;


        if (age2 > 22){
            // 40 > 22
            System.out.println("enjoy your drink");
        }else{
            System.out.println("you are not eligible to buy drink");
        }

        System.out.println("**************");
        System.out.println("**************");
        System.out.println("tip calculator app");

        /**

        // Tip Calculator  [if-else]

        Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
        // condition1 >>> In his country, it's usual to tip 15% if the bill value is between 99 and 280.
        // condition2 >>> If the value is different, the tip is 20%.


        Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).

                Example: "The bill was 275, the tip was 41.25, and the total value 316.25

        Data to test 97 ,100, 275 , 25
         */

        double bill = 0.00;
        double tiprate=0;
        double tip=0;
        double finalbill=0;

        //if the bill value is between 99 and 280.
        if (bill >=99 && bill<280){
            //case bill = 100>=99 && 100 <280
            //true && true >> true

            //case bill =20 : 20>=99 && 20<280
            //                false && true



            //it's usual to tip 15%
            tiprate=0.15;   // %15

            tip=bill * tiprate; // tip = %15 of the bill
            finalbill=bill+tip;

            System.out.println("bill = " + bill);
            System.out.println("tiprate = " + tiprate);
            System.out.println("tip = " + tip);
            System.out.println("finalbill = " + finalbill);


        }else {////condition2 >>> If the value is different, the tip is 20%.
            //the tip is 20%

            tiprate = 0.20;

            tip = bill * tiprate; // 20* 0.20 ==4

            finalbill = bill + tip; // 20+4

            System.out.println("bill = " + bill);
            System.out.println("tiprate = " + tiprate);
            System.out.println("tip = " + finalbill);
            System.out.println("finalbill = " + finalbill);

        }

        System.out.println("end of the code");




    }

}
