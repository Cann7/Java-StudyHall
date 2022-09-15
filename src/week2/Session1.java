package week2;

public class Session1 {

    //main
    //psvm
    public static void main(String[] args) {

        // if , if else, else

        //Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for the next 50 calls.
//Plus Rs. 0.50 per call for the next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.


        int calls = 300;
        double bill = 0; // bcz bill is start every month from zero

        if (calls>100){ //base telecommunication package covers first ( 100 calls)
            calls = calls-100; //250-100 = 150
            bill = bill+200;   //0+200 = 200
        }else {
            bill = 200;
            calls = 0;
        }
        if(calls>50){ // base package plus 50 extra call (per call 0.60 )
            calls = calls - 50; //100
            bill = bill + (50 * 0.60); //230
        }else{
            bill=bill+(calls *0.60);
            calls =0;
        }if(calls>50){ // 50 extra call (per call 0.50)
            calls = calls - 50; //50
            bill = bill + (50 * 0.50); //255
        }else{
            bill=bill+(calls *0.50);
            calls =0;
        }
        bill=bill+(calls*0.40); //275 unlimited package after 200 calls ( per call 0.40)

        System.out.println( "the bill : " +bill);

        System.out.println("**************");
        // Nested if ;

        boolean hasAvalidEmail = false;
        String userName = "m1234";
        String password = "123456";

        if (hasAvalidEmail){
            //true

            // 1234 ==m1234 >>false && 123456==123456 true
            if(userName=="m1234" && password== "123456"){
                System.out.println("welcome to amazon");
            }else {
                System.out.println("password ot username is not correct");
            }

        }else{
            System.out.println("there was a problem");

        }




    }


}
