package Week4;

public class Session3 {
    public static void main(String[] args) {

        /*

        Method             Description                                                                       Return Type


       charAt()            Returns the character at the specified  at the specified index  (position)          char
         */

        String str1="Panda";
        //

        System.out.println("str1.charAt(0) = " + str1.charAt(0)); // we retun index 0 value
        //str1.charAt(0)= P

        // Index number starts with 0
        //P a n d a
        //0 1 2 3 4

        System.out.println("str1.charAt(1) = " + str1.charAt(1));
        System.out.println(str1.charAt(3));

        // There 2 important points.
        // We shouldn't put a number which is not an index.
        //System.out.println(str1.charAt(5)); //StringIndexOutOfBoundsException: String index out of range: 5

        // we use for last character.

        //Length
        System.out.println(str1.length()); //5

        String str2="java";

        //what will print last char.of str2
        System.out.println(str2.charAt(3)); //a

        String str3="Renastech";
        //
        System.out.println(str3.charAt(8));//h
        System.out.println(str3.length());//9

        int LenForStr3=str3.length();//9

        System.out.println(str3.charAt(LenForStr3-1));

        String s="Mahir";
        //        01234
        int length=s.length();

        System.out.println(length);//5
        System.out.println(s.charAt(4)); //r

        System.out.println(s.charAt(length-1)); // r

        String a1="Apple";
        //         01234
        // printing the last char.
        System.out.println(a1.charAt(4));
                     //              5-1
        System.out.println(a1.charAt(a1.length()-1));

        String z = "adfghfashfhfgdjgh1232145656";
        //
        System.out.println(z.charAt(z.length()-1));

        //concat()         Appends a string to the end of another string            String

        System.out.println("###################");

        String fName="Elif";
        String lName="Akyel";

        String fullName= fName.concat(lName);
        System.out.println("fullName = "+ fullName);

        String fullName2 = fName.concat(" Akyel");

        System.out.println("fullName2 = " + fullName2);

        String fullName3="Elif".concat(" Akyel");
        System.out.println("fullName3 = " + fullName3);

        System.out.println("######################");

        String number1="10";
        System.out.println(number1.concat("5")); //105

        // startsWith()        Checks whether a string starts with specified characters          boolean

        String b="Renastech";

        System.out.println(b.startsWith("r")); //false

        //endsWith()                  Checks whether a string ends with the specified character(s)       boolean

        System.out.println(b.endsWith("h"));

        // isEmpty()            Checks whether a string is empty or not                  boolean

        // trim()               Removes whitespace from both ends of string             String

        String a = "R e n a s t e c h          ";
        System.out.println(a);

        System.out.println(a.trim());

        //replace()             Searches s string for a specified value, and returns
        //                       a new string where the  specified values are replaced             String

        System.out.println("********************");
        String aa="java"; //aa = java
        System.out.println("aa = " + aa);

        System.out.println(aa.replace('a','b'));  //jbvb

        System.out.println(aa.replaceFirst("a","b")); //jbva
        String bb ="Slack";
        System.out.println(bb.replace('S','C'));


        String c= "aaaaaaaaaa";
        System.out.println(c.replace('a','b'));

        System.out.println(c.replaceFirst("a","b")); //baaaaaaaa

        String d="Banana";

        //


        // For loop

        //sum of the numbers till 5 :
        //1+2+3+4+5==> 15

        int sum=0;
        System.out.println("sum = "+sum);

        for (int i=0 ; i<=5 ; i++){
            // i=0,  ; 0<=5; 0++   true
            //i=1,     1<=5; 1++   true
            //i=2,     2<=5   2++   true
            //i=3      3<=5   3++   true
            //i=4      4<=5   4++   true
            //i=5      5<=5   5++   true
            //i=6      6=5 // false

            sum+=i;
            //0 +=0 >> 0+0
            //0+i   =>   0+1
            //1+2   >>  3
            //3+3== > 6
            //6+i ==> 6+4 => 10
            //10+5=> 10+5 >> sum = 15

        }

        System.out.println("sum = " +sum);







    }
}
