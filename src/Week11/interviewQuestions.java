package Week11;

import java.util.Arrays;


public class interviewQuestions {

    /*
	1)Return the number of times that the string "hi" appears anywhere in the given string.
	countHi("abc hi ho")  1
	countHi("ABChi hi")  2
	countHi("hihi")  2
	------------------------------------------------------------
	2)Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
	repeatFront("Chocolate", 4)  "ChocChoChC"
	repeatFront("Chocolate", 3)  "ChoChC"
	repeatFront("Ice Cream", 2)  "IcI"
	------------------------------------------------------------
	   Homework)Input: s = "the sky is blue"
	Output: "blue is sky the"
	------------------------------------------------------------
	    homework)Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
	endOther("Hiabc", "abc")  true
	endOther("AbC", "HiaBc")  true
	endOther("abc", "abXabc")  true
	endOther("Hiabcx", "bc")  false
	     */

    public static void main(String[] args) {
        System.out.println("countHi(\"ABChi hi\") = " + countHi("ABChi hi"));
        System.out.println("repeatFront(\"Chocolate\", 4) = " + repeatFront("Chocolate", 4));
        reverseSentence("the sky is blue");
    }

    private static void reverseSentence(String str) {

        String[] splitArray = str.split(" ");
        String temp = "";

        System.out.println(Arrays.toString(splitArray));
        for( int i = splitArray.length-1; i>0;i--)
        {
            temp += splitArray[i] + " ";
        }

        temp += splitArray[0];

        System.out.println(temp);

    }


    public static int countHi(String str)
    {
        String temp = str.toLowerCase();
        int count = 0;
        for(int i =0;i<str.length()-1;i++)
        {
            int char1 = str.charAt(i);
            String char11 = " "+ str.charAt(i);

            int char2 = str.charAt(i+1);

            if(char1 ==104 && char2 == 105)
            {
                count++;
            }

        }
        return count;


    }


    public static String repeatFront(String str, int n)
    {
        String sample = "";
        for(int i = n ; i>=0;i--)
        {
            sample += str.substring(0,i);


        }

        return sample;
    }
}
