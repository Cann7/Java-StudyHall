package week2;

public class mahirstudyhalltasktelephonebill {
    public static void main(String[] args) {

        //Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for the next 50 calls.
//Plus Rs. 0.50 per call for the next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.



        //Step 1- Creating Variables

        double  bill=0; // We will use this variable to store answer.

        int callAmount=300;

        //Step 2-  Set-up logic

        ////Minimum Rs. 200 for up to 100 calls.
        if (callAmount <=100){

            bill=200;
            ////Plus Rs. 0.60 per call for the next 50 calls.
        } else if (callAmount >100 && callAmount <=150) {

            bill= 200 + ((callAmount -100 )*0.60); // 120 ==> 100=200
            //f100

            ////Plus Rs. 0.50 per call for the next 50 calls.
        }else if( callAmount >150 && callAmount <=200){

            bill = 200 + (50  * 0.60)  + ((callAmount -150 ) *0.50);


        }else if (callAmount >200){

            bill= 200 +(50 * 0.60 )+ (50 * 0.50) +( (callAmount -200 )* 0.40) ;

        }


        System.out.println("Call Amount : " + callAmount);
        System.out.println("Bill : "+bill);

        

    }
}
