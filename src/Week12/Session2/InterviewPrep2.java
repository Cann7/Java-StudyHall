package Week12.Session2;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewPrep2 {

     /*
    An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
        153 - 1'3  + 5'3 + 3'3  = 1 + 125 + 27 = 153
     */


    public static void main(String[] args) {
        System.out.println("isArmstrong(153) = " + isArmstrong(153));
    }

    public static boolean isArmstrong(int n)
    {
        String temp = String.valueOf(n);
        String[] tempArray = temp.split("");
        boolean isArmstrong = false;

        int count = 0;


        for(int i =0; i<tempArray.length;i++)
        {
            count += Integer.parseInt(tempArray[i]) * Integer.parseInt(tempArray[i]) * Integer.parseInt(tempArray[i]) ;
        }
        System.out.println(count);
        if(count == n)
        {
            isArmstrong = true;
        }


        return isArmstrong;
    }
}
